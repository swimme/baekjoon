# 01 조건/반복문
# A+B 여러줄

# 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
# 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.

import sys
a = int(input())

for line in sys.stdin:      #sys.stdin 여러줄 입력받을때 유용
  x,y = map(int, line.strip().split())   # 각 line의 수 split
  print(x+y)
    