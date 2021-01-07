# 함수
# 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 

# N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.  (N <= 1000)

# 한자리수는 모두 등차수열 한수
# 두자리수는 모두 등차수열 한수
# 각 자리수로 나눠서 자리수1 - 자리수2 = 자리수2 - 자리수3 ,,,일때 +1 # 세자리수부터

n = int(input())

cnt = 0
def check_digit(n, cnt):
  
  digit = list(map(int,str(n)))
  if digit[0]-digit[1] == digit[1]-digit[2]:  
      cnt += 1
  return cnt

if n < 100:
  print(n)
else:
  for i in range(100,n+1):
    cnt = check_digit(i,cnt)
  print(99+cnt)

#또다른 변수 사용 check
cnt = 0
def check_digit2(n):
  check = False
  digit = list(map(int,str(n)))
 
  if digit[0]-digit[1] == digit[1]-digit[2] :  #세자리수 조건
    check = True
  return check

if n < 100:
  print(n)
else:
  for i in range(100,n+1):
    if check_digit2(i) == True:
      cnt+=1
  print(99+cnt)

# global사용
# cnt = 0
# def check_digit(n):
#   global cnt
#   digit = list(map(int,str(n))) # 자리수 구별
#   d = digit[0]-digit[1]  

#   for i in range(1, len(digit)-1):   
#     if d == digit[i]-digit[i+1]:  # 자리수마다 차이가 일정한 경우
#       cnt += 1
#   return cnt

#굳이 함수로 풀지 않아도..
num = int(input())
hansu = 0

for n in range(1, num+1) :
    if n <= 99 : # 1부터 99까지는 모두 한수
        hansu += 1 
    
    else :     
        nums = list(map(int, str(n))) # 숫자를 자릿수대로 분리 
        if nums[0] - nums[1] == nums[1] - nums[2] : #등차수열 확인
            hansu+=1