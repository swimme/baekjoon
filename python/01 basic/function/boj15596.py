# 함수
# 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.

#def solve(a: list) -> int
#a: 합을 구해야 하는 정수 n개가 저장되어 있는 리스트 
# (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
#리턴값: a에 포함되어 있는 정수 n개의 합 (정수)

def solve(a: list) -> int :
  ans = 0
  for i in a:
    ans+=i
  return ans
  # return sum(a) 로 가능

print(solve([1,2,3]))