
board = [
  [0,0,0,0,0],
  [0,0,1,0,3],
  [0,2,5,0,1],
  [4,2,4,4,2],
  [3,5,1,3,1]
]
moves = [1,5,3,5,1,2,1,4]	
# [00000]
# [00103]
# [02501]
# [42442]
# [35131] 
# 이거헷갈려서 삽질... 한 배열이 한 층인줄.. 2차원배열 다시..
# arr[세로인덱스][가로인덱스]
# arr[4][0] = 3
# arr[3][0] = 4

# arr[1][5] = 3
# 43113204

b = [n[0] for n in board] #열column 뽑기

# def solution(board, moves):
#     arr = []
#     answer = 0
#     for i in moves:
#         if len(board[i-1]) != 0:
#             item = board[moves[i]-1].pop()
#             if item != 0:  
#               if len(arr)!= 0 and arr[-1] == item: 
#                 answer += 2
#                 arr.pop()
#               else:
#                 arr.append(item)
#     return answer

# print(solution(board,moves))

def solution(board, moves):
  arr = []
  answer = 0
  for m in moves:
    for i in range(len(board)): #한 열에서 아래로 탐색
      if board[i][m-1] == 0:  #m번째 열에서 0있는 경우
        continue
      if len(arr)!= 0 and arr[-1] == board[i][m-1]:
        answer+=2
        arr.pop()
      else:
        arr.append(board[i][m-1])
    
      board[i][m-1] = 0 #pop
      break
  return answer

print(solution(board,moves))
