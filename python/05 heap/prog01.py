
# 스코빌 지수가 가장 낮은 두 개의 음식으로
  # 섞은 음식의 스코빌 지수 
  # = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)

# Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
# input: 음식의 스코빌 지수를 담은 배열 scoville 
#          - 길이 2 이상 1,000,000 이하
#          - 원소는 각각 0 이상 1,000,000 이하
#        원하는 스코빌 지수 K 
#          - 0 이상 1,000,000,000 이하
# output: 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수 
#         모든 음식의 스코빌 지수를 K 이상으로 "만들 수 없는 경우"에는 -1

scoville = [1,3,5,7,0,16]
K = 30

## min heap
# 최솟값 7보다 작은지 확인
# 최소 = 최소1 + 최소2 * 2
# 최소가 7보다 클때까지

# 1. heapq 모듈 사용하기
import heapq
def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)
    while scoville[0] < K and len(scoville) > 1:
      first = heapq.heappop(scoville)
      second = heapq.heappop(scoville)
      heapq.heappush(scoville, first + second * 2)
	  # ***형제와의 대소 알 수 없으므로 scoville[1] x***
      answer += 1
    
    if scoville[0] < K:
      return - 1
    return answer

# 같은 방법
def solution2(scoville, K):
	answer = 0
	heapq.heapify(scoville)
	while True:
		first = heapq.heappop(scoville)
		if first >= K:
			break
		if (len(scoville))==0:
			return -1
		second = heapq.heappop(scoville)
		heapq.heappush(scoville, first + second * 2)
		answer += 1
	return answer
