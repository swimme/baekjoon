#  요세푸스 문제

n, k = map(int, input().split())


queue = [i+1 for i in range(n)]
print("<", end= '')
while len(queue)!=1:
  for _ in range(k-1):
    queue.append(queue[0])
    queue.pop(0)

  print(queue.pop(0), end=', ')

print(queue.pop(), end='')
print(">")


#2. 원형 큐 개념사용
pos = 0
result = []
while len(queue) > 0:
  pos = (pos+k-1) % len(queue)   # head = (tail+1) % qsize
  result.append(queue.pop(pos))

result = [str(x) for x in result]
print("<" + ", ".join(result) + ">")



#3. deque 라이브러리 사용 
from collections import deque

dq = deque([i+1 for i in range(n)])

print("<", end= '')
while len(dq) != 1:
  for _ in range(k-1):
    dq.append(dq[0])
    dq.popleft()
  print(dq.popleft(), end=', ')

print(dq.pop(), end='')
print(">")



