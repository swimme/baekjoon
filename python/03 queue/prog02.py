# 기능 개발
# 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 
# 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.

# 또, 각 기능의 개발속도는 모두 다르기 때문에 
# 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 
# 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
# = 순서가 지켜진다.

# input
# 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses
# - 작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
# - 작업 진도는 100 미만의 자연수입니다.
# 각 작업의 개발 속도 (일단위) 가 적힌 정수 배열 speeds 
# - 작업 속도는 100 이하의 자연수입니다.

# 각 배포마다 몇 개의 기능이 배포되는지를 return 
##########################################################
progresses = [93, 30, 55]
speeds = [1, 30, 5]
# [2, 1]

# 남은 작업의양 100-p
# 남은 일자 100-p / s
# 뒤에꺼 먼저 100돼도 앞에꺼 완성될때 배포된다.

# Sol1. 소요시간을 먼저 계산해둔 방법
# 1. calculate completion time
# 2. pop first time
# 3. find smaller or equal ones among the others
# ** 4. but should break when meet bigger one **
import math
from collections import deque
def solution(progresses, speeds):
  time = []
  answer = []
  for idx, program in enumerate(progresses):                #zip(p,s)로 하는 게 나을듯
    t = math.ceil((100 - program) / speeds[idx])
    time.append(t)

  time_deq = deque(time)

  while len(time_deq) > 0:
    front = time_deq.popleft()
    count = 1
    for t in list(time_deq):
      if t <= front:
        time_deq.popleft()
        count += 1
      else:           # **미완성 만났을땐 break loop해야함**
        break
    answer.append(count)
  return answer



# Sol2. #[time, count] 한꺼번에 계산 -> time[-1]과만 비교하면 되므로 가능
def solution2(progresses, speeds):
    Q=[] 
    for p, s in zip(progresses, speeds):
        if len(Q)==0 or Q[-1][0] < -((p-100)//s):     # 앞에꺼보다 더 늦게 완성된경우: 새로 append
            Q.append([-((p - 100) // s), 1])  
        else:                                         # 앞에꺼와 동시/먼저 완성된경우: 더하기
            Q[-1][1] += 1 # 뒤에꺼 count+=1
    return [q[1] for q in Q]  # [count]
    
## Tip. math.ceil 없이 올림하는 법 ##
# (p-100) => 음수
# (p-100) // s => 내림한 음수(음수에서 내림은 절대값은 커짐)
# - (p-100)//s  => (100-p) / s의 올림한 양수 


# Sol3 시간 먼저계산하지 않고 FIFO queue
def solution3(progresses, speeds):
    answer = []
    time = 0
    count = 0
    
    while len(progresses)> 0:
        if (progresses[0] + time*speeds[0]) >= 100:   # 첫번째가 100이 될때까지 loop 를 돌며 time 을 늘린다. 
            progresses.pop(0)                         # deque로 O(1) 가능
            speeds.pop(0)
            count += 1                                # 뒤에 완성된 작업의 경우도 cnt++
        else:                                         # 뒤에 미완성 작업 만난 경우
            if count > 0:                             
                answer.append(count)                  # 기존 append and 초기화 cnt
                count = 0                             
            time += 1
    answer.append(count)
    return answer




# test case
print(solution2([95, 90, 99, 99, 80, 99],[1, 1, 1, 1, 1, 1]), "[1, 3, 2]")
print(solution2([93, 30, 55],	[1, 30, 5]), "[2, 1]")


