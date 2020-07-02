# 배열
# 최대값을 찾고 몇번째요소인지

import sys

#a = list(map(int,sys.stdin.strip())) #stdin에 바로 strip안됨'
a = []
for line in sys.stdin:
  a.append(int(line.strip()))
print(max)
print(a.index(max(a))+1)


# while로 입력받기
while(True):
  num = input()
  if num == "":  # input()=="" (x)
    break
  a.append(int(num))
print(a)

#for i in range(9)
