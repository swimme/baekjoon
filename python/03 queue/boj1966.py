# 현재 Queue의 가장 앞에 있는 문서의 ‘중요도’를 확인한다.

# 나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면, 이 문서를 인쇄하지 않고 Queue의 가장 뒤에 재배치 한다. 그렇지 않다면 바로 인쇄를 한다.

import sys
import queue 
case = int(input()) 

for _ in range(case):
  n, m = map(int, sys.stdin.readline().split())  # m번째 위치의 문서 언제 출력되는가
  imp = list(map(int, sys.stdin.readline().split()))

  # arr = []
  arr = queue.Queue()
  cnt = 0

  for i in range(n):
    arr.put((imp[i],i))

  imp.sort() # 1234

  # while arr.qsize != 0:
  while arr:
    out = arr.get() 
    # out = arr.pop(-1) # FIFO이므로 

    if out[0] == imp[-1]: # 가장높은 운선순위 나오면 pop
      imp.pop()
      cnt+=1

      if out[1] == m: # 그 우선순위가 찾는 문서면 cnt
        print(cnt)
        break
    else:
      arr.put(out)


#2.
import sys
from collections import deque

case = int(input()) 

for _ in range(case):
  n, m = map(int, sys.stdin.readline().split())  # m번째 위치의 문서 언제 출력되는가
  imp = list(map(int, sys.stdin.readline().split())) #중요도

  dq = deque([(imp[i],i) for i in range(n)])
  cnt = 0

  imp.sort()

  while len(dq) != 0:
    # out = dq.popleft()

    if imp[0] == imp[-1]:
      imp.pop()
      cnt += 1

      if out[1] == m:
        print(cnt)
        break
    else:
      dq.append(out)


#3. 
for _ in range(case):
    n, m = map(int, input().split())
    s = list(map(int, input().split())) #중요도

    s_ = [0 for i in range(n)] # 모두 0으로
    s_[m] = 1   # 찾고자하는 문서를 1로

    cnt = 0
    while True:
        if s[0] == max(s): #중요도가 max면
            cnt += 1
            if s_[0] == 1:  #그리고 찾고자하는 문서면 break
                print(cnt)
                break
            else:
                del s[0]  #아니면 프린트 pop
                del s_[0] 
        else:
            s.append(s[0]) #뒤로보내기
            del s[0]
            s_.append(s_[0])
            del s_[0]