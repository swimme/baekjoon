# 배열
# 정수의 min, max구하기

import sys
a = int(input())
nums = list(map(int,sys.stdin.readline().split())) 
#print("%d %d" % (min(nums),max(nums)))
print(min(nums), max(nums))