
# 프린터
# 이런 문제를 보완하기 위해 ** 중요도가 높은 문서를 먼저 인쇄 ** 하는 프린터를 개발했습니다. 

# 1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
# 2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
# 3. 그렇지 않으면 J를 인쇄합니다.

# 4개의 문서(A, B, C, D)가 순서대로 인쇄 대기목록에 있고 중요도가 2 1 3 2 라면 C D A B 순으로 인쇄하게 됩니다.
# 내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 알고 싶습니다. 
# 위의 예에서 C는 1번째로, A는 3번째로 인쇄됩니다.

# input
# 현재 대기목록에 있는 문서의 중요도가 순서대로 담긴 배열 priorities
# - 현재 대기목록에는 1개 이상 100개 이하의 문서가 있습니다.
# - 인쇄 작업의 중요도는 1~9로 표현하며 숫자가 클수록 중요하다는 뜻입니다.
# 내가 인쇄를 요청한 문서가 현재 대기목록의 어떤 위치에 있는지를 알려주는 location
# - 0 이상 (현재 대기목록에 있는 작업 수 - 1) 이하의 값

# output
# 내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 

#############
priorities = [2, 1, 3, 2]
# [(0,2), (1,1), (2,3), (3,2)] = (loc, pri)
location = 2 
# 1

# max 구하기
# popleft front
# if max > front: append
# else: continue

from collections import deque
def solution(priorities, location):
    answer = 0
    priorities = [(priority,idx) for idx, priority in enumerate(priorities)]
    prior = deque(priorities)

    # while len(prior) > 0:  
    while True: 
        max_p, max_idx = max(prior)
        front, idx = prior.popleft()
        if front == max_p:
            answer += 1
            if idx == location:
                return answer
        else:  
            prior.append((front,idx))


def solution2(priorities, location):
    queue = [(i, p) for i, p in enumerate(priorities)]
    queue = deque(queue)
    answer = 0
    while True:
        cur = queue.popleft()
        if any(cur[1] < q[1] for q in queue): #max대신 사용
            queue.append(cur)
        else:
            answer += 1
            if cur[0] == location:
                return answer




    

print(solution([1, 1, 9, 1, 1, 1],0),"5")
print(solution([2, 1, 3, 2], 2), "1")

