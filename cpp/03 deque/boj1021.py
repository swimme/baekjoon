import sys
from collections import deque

# 입력받기 N k 
n, k =map(int, input().split())

elem =  list(map(int, input().split())) # [2,9,5]

# deque에 12345678910 넣기
deq = deque()
for i in range(1,n+1):
    deq.append(i)

#print(deq)
#print(deq.index(2))
cnt = 0
for i in range(k):
    while(deq[0] != elem[i]):
        if (deq.index(elem[i]) <= len(deq)/2 ): #2번
            deq.rotate(-1)
            #print(deq)
            cnt+=1
        else: 
            deq.rotate(1)
            #print(deq)
            cnt+=1
    deq.popleft()
        
print(cnt)


