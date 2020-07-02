# 셀프 넘버
# 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자.
# d(75) = 75+7+5 = 87
# 75는 87의 생성자이다.

# n을 d(n)의 생성자라고 한다. 
# 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다. 

# 생성자가 없는 숫자를 셀프 넘버라고 한다. 
# 100보다 작은 셀프 넘버는 총 13개가 있다. 
# 1, 3, 5, 7, 9 : 홀수 (한자리수 + 한자리수 = 무조건 짝수)
# 20, 31, 42, 53, 64, 75, 86, 97 (두자리수 + 한자리수 + 한자리수 ) (십의자리 2~9/일의자리 0~7)

# 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

# >>> 1부터 10000 까지 숫자의 d(n)을 제외하고 남은 숫자 출력? 

# n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열
# 33으로 시작하면, 33, 39, 51, 57, ... , 141
# >>> 이 성질 이용?(재귀)

def sum_digit(num): # 10000이하의 무한 수열 출력
  for i in str(num):
    num += int(i)
  return num

a = list(range(1,10001)) #1~10000
for n in range(10000): 
  if sum_digit(n) in a:
    a.remove(sum_digit(n))

for n in a:
  print(n)

# 재귀 사용?
# 잘못쓰면 시간 제한
# a = list(range(1,101)) #1~10000
# def add_digit(num):
#   for i in str(num):
#     num += int(i)
#   if num > 10: 
#     return 
#   if num in a:
#     a.remove(num)
#   return add_digit(num)

# for i in range(1,100):
#   add_digit(i)
# print(a)

def self_num(x):
    a = int(x)
    if a > 10000:
        return
    else:
        for j in range(len(x)):
            a += int(x[j])
            if a > 10000:
                return
        check[a] = True
        self_num(str(a))
            
check = [False]*10001  ## 
for i in range(1, 10000):
    self_num(str(i))
    
for i in range(1, 10000):
    if check[i] ==False:
        print(i)