#include <queue>
#include <string>
#include <iostream>
using namespace std;

#define MX 500
#define X first
#define Y second

int main() {
	int n, m;
	cin >> n >> m;

	int board[MX][MX]; // 도화지

  //입력
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) { 
			cin >> board[i][j];
		}
	}

  //bfs로 그림찾기
  // 큐, vis[][], dir[]

  //(0,0)부터 시작?
  // "값이 1이고 방문하지 않은 칸에 대해 bfs loop"
  // - 한 bfs끝날때마다 그림수 cnt+1, 그림너비저장(==bfs에서 queue에 push될때마다 area+1)
  // 가장 mxarea인 너비 출력 (이전 너비보다 더크면 저장, 아니면 날리기)

  bool vis[MX][MX];
  int dirX[4] = {1,0,-1,0};
  int dirY[4] = {0,1,0,-1};
  int cnt = 0;  //그림수
  int MXarea = 0; //최대너비

  queue <pair<int,int>> Q;

  for (int i = 0; i<n; i++) {
    for (int j = 0; j <m; j++){
      
      if(board[i][j] == 0 || vis[i][j]) continue;

        vis[i][j] = 1;
        Q.push({i,j});
        int area = 1; 

        while(!Q.empty()) {
          auto cur = Q.front();
          Q.pop();

          for (int i=0; i<4; i++) { //인접한 칸 이동
            int nx = cur.X + dirX[i];
            int ny = cur.Y + dirY[i];

            if(nx<0 || nx>= n || ny<0 || ny >= m) continue;
            if(vis[nx][ny] || board[nx][ny] != 1) continue;

            //push, vis
            vis[nx][ny] = 1;
            Q.push({nx,ny});
            area++; //*1로 초기화하여 push마다 증가
          }
        }
        cnt++; //*큐 한번 비워질때마다 그림수++
        if (area > MXarea) MXarea = area; //최대너비찾기

    }
  }

  cout << cnt << endl;
  cout << MXarea << endl;
  return 0;
}