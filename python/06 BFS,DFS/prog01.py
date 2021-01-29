# 타겟 넘버
# n개의 양의 정수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 한다.

# input
# numbers : 사용할 수 있는 숫자가 담긴 자연수 배열 
# - 개수 2~20, 자연수 1~50
# target : 만들고자 하는 숫자 자연수 1 ~ 1000

# output
# 타켓 넘버를 만드는 방법의 수 

# -1+1+1+1+1 = 3
# +1-1+1+1+1 = 3
# +1+1-1+1+1 = 3
# +1+1+1-1+1 = 3
# +1+1+1+1-1 = 3
# return 5
###########################

# (-1,+1)(-2,+2),(-3,+3)(-4,+4),(-5,+5)  n개의 수
# 각 숫자 사이 - 와 + "조합"
# -가 1개일때 nC1, 
# -가 2개일때 nC2 
# -가 n-1개일때 nCn-1


# 1. sub 조합 만들어서 brute-force
import itertools
def solution(numbers, target): 
  answer = 0
  result = 0
  n = len(numbers)

  if sum(numbers) == target: 
    return 1

  for i in range(1, n):  # i개 빼기
    combis = [list(combi) for combi in itertools.combinations(numbers, i)]
    for combi in combis:
      result = sum(numbers) - 2 * sum(combi)
      if result == target:
        answer += 1
        # break (x)  예외: 같은 수 원소
      # if result < target:
      #   return answer (x) 예외: [4,5]>[1,2,3]  
  return answer

# 2. 완전탐색2 
# (-i,i)로 product해서 모든 조합 구함
# map(func, [iterable]) 활용 - 훨씬 빠름
from itertools import product
def solution2(numbers, target):
    l = [(x, -x) for x in numbers]
    s = list(map(sum, product(*l)))
    
    return s.count(target) 
    

# bfs
# (-1,+1)(-2,+2),(-3,+3)(-4,+4),(-5,+5) 그래프 가지치기
from collections import deque
def solution3(numbers, target):
    answer = 0
    queue = deque() 
    n = len(numbers)

    # 1 init 
    # - 방문한 index와 item 
    # - 두 가지 갈래 
    queue.append([numbers[0],0]) 
    queue.append([-1 * numbers[0], 0])
    
    while queue:
        temp, idx = queue.popleft()  # 2 현재 위치
        
        idx += 1 # 3 현재 위치의 다음 index
        if idx < n: # 범위내 확인
            queue.append([temp+numbers[idx], idx]) # 4 누적 item과 검사중인 인덱스
            queue.append([temp-numbers[idx], idx])
        else:
            if temp == target:  # target일치 확인
                answer += 1
    return answer



# 4.  재귀 + dfs
def solution4(numbers, target):
    n = len(numbers)
    answer = 0

    def dfs(idx, result):
        if idx == n: # 끝까지 검사 
            if result == target:
                nonlocal answer
                answer += 1
            return
        else: # 다음 아이템 검사, 가지 두 갈래로 -item or item
            dfs(idx+1, result+numbers[idx]) 
            dfs(idx + 1, result - numbers[idx])
            
    dfs(0,0) #(index, result)
    return answer


# [ 이전 결과 ] + [다음 +item, -item]
def solution5(numbers, target):
    tree = [0] # 이전 수에 대한 계산 결과를 담은 층
    for num in numbers: 
        sub_tree = [] # 결과를 담은 자식 노드를 하나씩 추가하는 역할 
        for tree_num in tree:
            sub_tree.append(tree_num + num) # [ 0+1, 1+2, -1+2]
            sub_tree.append(tree_num - num) # + [ 0-1, -1+2, -1-2]
        tree = sub_tree #[0] -> [1,-1]
    return tree.count(target)


# print(solution3([1, 1, 1, 1,1], 3), "5")
