# 프로그래머스 주식가격
# input 
# prices : 초 단위로 기록된 주식가격이 담긴 숫자 배열 
# - 각 가격은 1이상, 10,000 이하인 자연수
# - 길이는 2이상 100,000 이하
# output 
# 가격이 떨어지지 않은 기간은 몇 초인지
################################################
# 다음으로 현재원소 보다 작은 원소가 등장하는 시점 - 현재 시점
#   등장하지 않았다면 총 길이 - 현재시점
# 마지막 원소는 0


# 뒤에서부터 검사함
# 코드 복잡, 효율성 soso
def solution(prices):
  answer = []
  dec = []  # 감소된 시점의 가격 stack [[price, index]]
  n = len(prices)

  next_p = prices.pop()     # init 뒤에서부터 검사함
  answer.append(0)

  for i in range(n - 2, -1, -1): 
    curr_p = prices.pop()
    if curr_p > next_p:       # 다음 원소에서 가격이 감소한 경우 
      answer.append(1)
      dec.append([next_p, i+1]) 
    else: 
      answer.append(n - 1 - i)  # 한번도 가격이 감소하지 않은 경우라고 가정      
      for j in range(len(dec)-1,-1,-1):   # 감소가격 중 처음 본인보다 작은 가격 나올때를 검사 
        if curr_p > dec[j][0]:
          answer.pop()          # 가정한 거 뺌
          answer.append(dec[j][1]- i)
          break
    next_p = curr_p

  answer.reverse()

  return answer

# 효율성 good
def solution2(prices):
    answer = [0]*len(prices) # 모두 0으로 초기화하여 인덱스 사용하게 함
    stack = []                # 가격이 처음으로 떨어지는 지점을 아직 못찾은 가격의 index 
 
    # 각 가격의 기존시점(index)을 stack에 쌓고
    # 다음 원소에서 처음으로 감소된 가격이 나오면 stack pop하며 검사 
    for i, price in enumerate(prices):  
        while stack and price < prices[stack[-1]]:   
            j = stack.pop()  
            answer[j] = i - j  # 가격이 떨어진 시점(i) - 기존 시점(j)
        stack.append(i)
 
    # stack에 남아있는 값들은 끝까지 떨어지지 않은 가격
    while stack:
        j = stack.pop()
        answer[j] = len(prices) - 1 - j
    return answer


# deque로
from collections import deque
def solution3(prices):
    answer = []
    prices = deque(prices)  
    while prices:
        c = prices.popleft()  # 앞 원소부터 빼기
        count = 0
        for i in prices:  # 나머지 원소 검사 : 현재 가격보다 작은 가격인 경우 count++
            count += 1 # 마지막 원소 제외 모두 1초씩은 유지되므로
            if c > i:
                break  # 등장한 시점에서 for문 탈출
        answer.append(count)

    return answer

# 간단해보이지만 효율성 not good - 이중 for문과 비슷
def solution5(prices):
    answer = []
    n = len(prices)
    for i, price in enumerate(prices): # [index, price]
        count = 0
        pos = i                                  # index 연산용 pointer
        while pos < n and price <= prices[pos]:  # pointer돌려서 현재 index 이후 원소 검사
            pos += 1
            if pos < n:
                count += 1
        answer.append(count)

    return answer

# 가장 간단하게는 이중 for문을 구현하여 각 원소마다 그 이후의 원소들을 검사하는 방법도 있다.
# enum -> index와 price 간단하게 사용 가능해짐 

# test case
# print(solution([1, 2, 3, 2, 3])) #[4, 3, 1, 1, 0]
# print(solution([1, 3, 4, 4, 2, 3]))  #[5, 3, 2, 1, 1, 0]
# print(solution([5, 8, 6, 2, 4, 1]))  #[3, 1, 1, 2, 1, 0]

# print(solution([1, 1]))  #[1, 0]
# print(solution([2, 1]))  #[1, 0]
# print(solution([2, 3, 1]))  #[2, 1, 0]
# print(solution([5, 4, 3]))  #[1, 1, 0]
# print(solution([5, 4, 3, 4, 5]))  #[1, 1, 2, 1, 0]
