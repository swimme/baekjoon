# DFS

: 다차원 배열에서 각 칸을 방문할 때 깊이를 우선으로 방문하는 알고리즘

: stack 사용 (한방향 pushpop 후입선출)

- 과정

  1. 시작 칸을 스택에 push하고 방문표시 남김
  2. 스택에서 pop하여 상하좌우 인접칸에 대해 3번실행
  3. 처음방문한 칸은 방문표시후 스택에 push (칸을 이전에 방문했다면 nothing)
  4. 스택 빌때까지 2번 반복

- 시간 복잡도: N개의 칸일때 O(N) (모든 칸이 스택에 한번씩 들어가므로)

- BFS와 다르게 추가된 인접한 칸이 현재보는 칸보다 시작점으로부터 더 떨어져있다는 성질 성립x
  ![dfs](https://t1.daumcdn.net/cfile/tistory/99D596435C2E351736)
- 다차원 배열에서 DFS 보다 BFS 더 많이 쓰임
- 주로 그래프에서 사용

- 예제 코드 https://0bin.net/paste/fd4--ZSocw-8wCdN#d0dC6SHLTDS7wy7200cwBYIiyPrZechYUVGD81G9Kuz
