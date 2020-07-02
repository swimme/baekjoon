# A+B 여러줄

a, b = map(int, input().split())

while(a!=0 and b!= 0):
  print(a+b)
  a, b = map(int, input().split())


# 다른 풀이 
while True:
  a, b = map(int, input().split())
  if a == 0 and b == 0:
      break
  print(a+b)