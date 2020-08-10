# stack
# 하나씩 pop, top이 max보다 크면 cnt+1, max = top

import sys

n = int(input())

arr = []
for line in sys.stdin:
  arr.append(int(line.rstrip()))

max = arr.pop()
cnt = 1
while len(arr) != 0:
  top = arr.pop()
  if top > max:
    cnt += 1
    max = top
print(cnt)