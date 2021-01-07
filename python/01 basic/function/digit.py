def digit_length(n):
    ans = 0

    while n:
        n //= 10
        ans += 1

    return ans


# while n: 파이썬은 숫자 자체를 조건식으로 사용하는 것을 허락한다. 
# 이때 0(0.0 등 포함)일 때는 False, 그 외에는 정수, 실수, 음수, 복소수 할 것 없이 전부 True 가 된다. 
# // 몫만남긴다

# while n:
  # 첫째자리수 n % 10 
  # 둘째자리수 부터 n //= 0
#   n //= 10


def sum_digit(number):
    result = 0   
    for i in str(number): 
        result += int(i) 
    return result   

