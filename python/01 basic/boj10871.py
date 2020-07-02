# X보다 작은 수
# 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
# A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오

import sys
a,b = map(int, input().split())

for x in sys.stdin.readline().split():  # 한줄에 여러개입력시 stdin.readline() 유용
  if int(x) < b:
    print(x, end=' ')


#리스트형 활용한 다른 풀이
nums = list(map(int, input().split()))
for i in range(a):
  if nums[i] < b:
    print(nums[i], end = ' ')



