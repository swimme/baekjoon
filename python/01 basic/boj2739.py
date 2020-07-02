#구구단
# 문자열 포매팅

a = int(input())
for i in range(1,10):
  print("{} * {} = {}".format(a,i,a*i))
  print("%d * %d = %d" % (a,i,a*i))
  print(f'{a} * {i} = {a*i}')
