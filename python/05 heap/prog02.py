# 디스크 컨트롤러
# input
# jobs 2차원 배열: [ [작업이 요청되는 시점, 작업의 소요시간], ...]
#  - 길이는 1 이상 500 이하
#  - 작업이 요청되는 시간은 0 이상 1,000 이하
#  - 작업의 소요시간은 1 이상 1,000 이하
# 하드디스크가 작업을 수행하고 있지 않을 때에는 먼저 요청이 들어온 작업부터 처리합니다.

# output
# 가능한 방법 중 '작업의 요청부터 종료까지 걸린 시간의 평균'의 최솟값
#   n개 작업의 요청부터 종료까지 걸린 시간의 평균 = sum(종료시점-요청시점) / n
# 단, 소수점 이하의 수는 버림


# 스케쥴러
# 생각나는건 SJF, FCFS, RR(time), PS(우선순위) 등등..
# 의문1 : jobs는 들어오는 순서대로 인가 - 명시 없는 걸 보니 아닌듯
# 의문2 : 비선점인지 선점인지 조건이 추가돼야 한다고 생각함
############################################################

# 1. 나의 풀이 fcfs, sjf 를 리스트로 구현
# sjf
# time 내 들어온 요청 중 짧은 순
# 일단 먼저 도착순 -> 그 안에서 짧은 task 찾기

# 단점: sjf에서 jobs가 보존되지 않음 -> 다른 배열로 담아서 해결가능
# 		 코드 길어짐( heap 왜 사용하지 못하니 ) , 중복 제거하기

#FCFS
def fcfs(jobs):
	cnt = len(jobs)
	time = 0
	answer = 0
	jobs = sorted(jobs)
	for job in jobs:
		if time >= job[0]: 
			time += job[1]  	
		else:				# **주의: 시간내 요청된 작업 없는 경우**  -> max연산으로 단순화 가능 (time 둘중 더큰거)
			time = job[0]  	# **다음 요청까지 시간 흐름**
			time += job[1]	# 완료
		answer += (time - job[0])

	return answer // cnt

#SJF
def sjf(jobs):
		cnt = len(jobs)
		jobs.sort(reverse=True)  # 일단 먼저 온 순서대로 정렬(리버스 for pop)
		job = jobs.pop()
		time = job[0]+job[1]  # 첫 요청작업 수행 후 시간
		answer = job[1] 
		while len(jobs) > 0:
			shortest_idx = -1
			for i in range(len(jobs)):
				if jobs[i][0] <= time and jobs[shortest_idx][1] >= jobs[i][1]:  #time내 들어온 요청 중 짧은거 찾기
				# -> 이부분을 heap 사용하면 간단히 할 수 있음 #[처리시간 기준으로 minheap] 
					shortest_idx = i
			if jobs[shortest_idx][0] > time: 	# 시간내 요청된 작업 없는 경우
				time = jobs[shortest_idx][0]  # 다음 요청까지 시간 흐름
			job = jobs.pop(shortest_idx)
			time += job[1]
			answer += (time - job[0])

		return answer // cnt

def solution(jobs):
		fcfs_time = fcfs(jobs)
		sjf_time = sjf(jobs)
		if fcfs_time < sjf_time:
			return fcfs_time
		else:
			return sjf_time


# 2. heap
# time 내 들어온 요청 중 짧은 순 정렬
# "시간이 흐름에 따라" 재정렬
import heapq
def solution2(jobs):
		time = 0  # 첫 요청작업 수행 후 시간
		answer = 0
		sorted_jobs = sorted(jobs, reverse=True)  # reverse for pop() O(1)  < or dequeue로 가능 >
		# sorted_jobs = sorted([(x[1], x[0]) for x in jobs], key=lambda x: (x[1], x[0])) # 튜플로 처음부터 처리시간을 앞으로 오게 해도됨
		
		heap = []
		heapq.heappush(heap, sorted_jobs.pop()[::-1])  #[처리시간, 요청시간]  # ***처리시간 기준 minheap이 돼야함***
		
		while len(heap) > 0:
				task_time, request_time = heapq.heappop(heap)
				time = max(time + task_time, request_time + task_time)
				# *** (시간 내 들어온 요청 처리한 시간),(다음 요청까지 시간 흘러서 처리한 시간) 중 더 큰 것 *** 으로 단순화함

				answer += (time -	request_time)

				while len(sorted_jobs)>0 and sorted_jobs[-1][0] <= time: # 시간 내 요청 요소들 넣고 heapify
						heapq.heappush(heap, sorted_jobs.pop()[::-1])
				if len(sorted_jobs)>0 and len(heap)==0:								# 요청 없는 경우 가장 처음 요소 하나만 넣으면 됨
						heapq.heappush(heap, sorted_jobs.pop()[::-1])	
		return answer // len(jobs)



# 3. 
import heapq
from collections import deque
def solution3(jobs):
	N = len(jobs)
	jobs = deque(sorted(jobs))
	jobs_done, curr_time, wait_time, cand = 0, 0, 0, []

	# *** 변수 N을 두면 while문마다 len연산을 안해도 돼서 효율성이 좋을듯 ***
	while jobs_done < N:
			# 요청이 들어온 것이 없을 때 - 단순 job에서 pop해서 씀
			if not cand:
					request, time = jobs.popleft()
					curr_time = request + time
					wait_time += time
			# 요청이 들어온 것이 있을 때 - 이때만 heap
			else:
					time, request = heapq.heappop(cand)
					curr_time += time
					wait_time += curr_time - request

			jobs_done += 1
					
			while jobs and jobs[0][0] <= curr_time:  # 시간 내 들어온 요청 heapify : **처리시간을 기준으로**
					heapq.heappush(cand, jobs.popleft()[::-1])
					
	return wait_time // N

# a = [[1, 2], [3,4]]
# print(a.pop(0)[::-1])


# testcase
print(solution3([[0, 3], [1, 9], [2, 6]]), 9)
# print(solution([[0, 1]]), 1)
# print(solution([[0, 1], [0, 1], [0, 1]]), 2)
# print(solution([[0, 1], [0, 1], [0, 1], [0, 1]]), 2)

# print(solution([[1000, 1000]]), 1000)  #1000 1000
# print(solution([[0, 1], [1000, 1000]]), 500)  #500 500
# print(solution([[10, 10], [30, 10], [50, 2], [51, 2]]), 6) #6 6
# print(solution([[0, 10], [2, 12], [9, 19], [15, 17]]), 25) #25 25
# print(solution([[0, 10], [2, 10], [9, 10], [15, 2]]), 14) #14 14
# print(solution([[0, 3], [1, 9], [2, 6], [30, 3]]), 7)  #7 7
# print(solution([[100, 100], [1000, 1000]]), 500)
