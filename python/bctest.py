# 직사각형 4개의 점중 3개의 좌표주어질 때 나머지 한점의 좌표구하기
# 배열: [점 3개의 좌표]
# 출력 나머지 한점좌표
# 각 변은 x축, y축에 평행하며, 반드시 직사각형을 만들 수 있는 경우만 입력
# v = [[1,4],
#      [3,4],
#      [3,10]]
# x 0열, y1열
# x한쌍, y한쌍

# def solution(v):
#     answer = []
#     x = []
#     y = []
#     for point in v:
#         if point[0] in x:
#             x.pop()
#         elif point[0] not in x:  
#             x.append(point[0])
#         if point[1] in y:
#             y.pop()
#         elif point[1] not in y:  
#             # x.append(point[0])
#             y.append(point[1]) 
#             print(y)
#     # answer.append(x[0])
#     # answer.append(y[0])
#     # print(x)
#     # print(y)
#     answer.extend(x)
#     answer.extend(y)
#     return answer

b = [i + 5 for i in range(10) if i % 2 == 1]    # 0~9 숫자 중 홀수에 5를 더하여 리스트 생성

v = [[0, 0], 
      [1, 2], 
      [0, 2]]

def count(arr):
  answer = []
  # for i in arr:
  #   if arr.count(i) == 1:
  #     answer.append(i)
  answer = [i for i in arr if arr.count(i) == 1 ]
  return answer

def solution(v):
    answer = []    
    x = [point[0] for point in v] 
    y = [point[1] for point in v] 
    answer.extend(count(x))
    answer.extend(count(y))
    return answer

print(solution(v))