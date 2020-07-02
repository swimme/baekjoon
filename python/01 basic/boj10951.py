# A+B 여러개 

#stdin 활용
import sys
for line in sys.stdin:
  x, y = map(int, line.strip().split())
  print(x+y)

#다른 풀이 
# - case수가 정해지지않은 경우 while문과 break조합 유용
while True:
  case = sys.stdin.readline().rstrip()
  if case == "":
    break
  a, b = map(int, case.split())
  print(a+b)