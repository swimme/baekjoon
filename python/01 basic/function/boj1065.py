# 함수
# 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
# 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 

# N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

# 입력
# 110 보다 작거나 같은 한수의 개수
# 한자리수는 모두 등차수열 한수
# 두자리수는 모두 등차수열 한수
# 111
# 123 ...
# cf. 등차: list(range(init, end, d))

n = int(input())
arr = list(range(1,n+1)) #1~n

# 각 자리수로 나눠서 자리수1 - 자리수2 = 자리수2 - 자리수3 ,,,일때 +1 # 세자리수부터
cnt = 0
check = True
def check_digit(n):
  digit = list(map(int,str(n)))
  print(digit)
  
  d = digit[0]-digit[1]
  for i in range(1, len(digit)-1):
    if d != digit[i]-digit[i+1]:
      check = False
  print(check)
  
check_digit(123)

# if n < 100:
#   print(n)
# else:
#   for i in range(1,n+1):
#     check_digit(i)
#   print(99+cnt)


