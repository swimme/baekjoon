# boj1193
# 무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

# 이와 같이 나열된 분수들을 
# 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 
#분자가 1 # 1 2 4 7 11
#분자가 2 # 3 5 8 12
#분자가 3 # 6 9 13
#      4 # 10 14
# 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.

# 1. 분자찾기
# An = 1 + 2 + .... +n 
# # 2. 분모찾기

n = int(input())
sum = 0
child = 0
i = 1

while sum != n:
  sum += i
  i += 1
  child+=1
  if sum > n: break

print(sum)

