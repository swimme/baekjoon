# BFS

### Flood Fill 문제

: 다차원 배열에서 어떤 칸과 연결된 영역을 찾는 문제
![floodfill](https://t1.daumcdn.net/cfile/tistory/99ACB7345C2E1D5E32)

- bfs/dfs 알고리즘으로 해결가능
- bfs는 큐로, dfs는 스택으로

### BFS

: 다차원 배열에서 각 칸을 방문할 때 너비를 우선으로 방문하는 알고리즘

: (원래) 그래프 자료구조에서 모든 노드를 방문하기 위한 알고리즘

- 과정:

  1. 시작하는 칸을 큐에 push하고 방문했다는 표시남기기

  2. (비어있지 않은 큐) 큐에서 원소를 pop하여 그 칸에 상하좌우로 인접한 (같은색의) 칸에 대해 3번행동을 한다.

  3. 해당 칸을 처음으로 방문했다면 방문한 표시남기고 큐에 push
     (이미 방문한건 nothing)

  ![bfs](https://t1.daumcdn.net/cfile/tistory/99A18D345C2E1D6304)

  4. 큐가 모두 빌때까지 2번 반복

  ![bfs](https://t1.daumcdn.net/cfile/tistory/9959E63E5C2E1D6E2A)

- 시간복잡도: 모든 칸이 큐에 1번 씩만 들어감이 보장되므로 N개의 칸에 대해 O(N)

### 구현

- 큐에 int2개를 묶은 원소들어가야함
- STL의 pair활용가능

- or 구조체나 큐에 2개의 data배열 원소
