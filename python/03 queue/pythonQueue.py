#1. 큐
import queue
que = queue.Queue()

que.put(1)
que.put(2)
que.get() # pop 1
que.qsize() 


## + 우선순위 큐
que2 = queue.PriorityQueue()

que2.put((5,1)) #(우선순위, 데이터)의 튜플형식으로 
que2.put((3,2))
que2.get() #(3, 2) 순위값 낮은 데이터부터 출력 


## deque 사용하기
from collections import deque

que3 = deque([1,2,3])
que3.append(4)
que3.popleft() # 1
# que3.pop() # 4
# que3.appendleft(1) #front에삽입


## heapq
import heapq

testheap = [1,3,2,6,8,0,6]
heapq.heapify(testheap)
print(testheap)  #힙정렬 [0, 3, 1, 6, 8, 2, 6]

heapq.heappush(testheap, 5)
heapq.heappop(testheap)