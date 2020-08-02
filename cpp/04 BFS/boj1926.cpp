#include <queue>
#include <string>
#include <iostream>
using namespace std;

//큰 도화지에 그림이 그려져있을 때 
// 1 그그림의 개수와
// 2 그그림중 넓이가 가장넓은 것의 넓이 출력하라

// 그림: 1로연결된 것을 한 그림이라고 정의(대각선 연결x)
// 넓이는 그림에 포함된 1의 수

//입력
//1 첫째줄에 도화지의 세로크기 n과 가로크기 m
//2 둘째줄부터 그림의 정보 (1이 색칠된 부분)

//출력 1 그림의 수 2 가장넓은 그림의 넓이

#define MX 500
#define X first
#define Y second

int main() {
	int n, m;
	//scanf_s("%d %d", &n, &m);
	cin >> n >> m;

	int board[MX][MX]; // 도화지

  //입력
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			//scanf_s("%d", &board[i][j]); 
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
  
  //init
  // vis[0][0] =1;
  // Q.push({0,0});
  // int area =1; //너비

  for (int i = 0; i<n; i++) {
    for (int j = 0; j <m; j++){
      
      //if(board[i][j] == 0 or vis[i][j]) continue;
      if (!vis[i][j] && board[i][j] ==1) {

        cnt++; //*그림 수 증가 여기서

        vis[i][j] = 1;
        Q.push({i,j});
        int area = 0; //*0으로 초기화

        while(!Q.empty()) {
          area++; //*큐원소 뺄때마다 넓이 1증가
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
            //area++; //*1로 초기화하여 push마다 증가
          }
        }
        //cnt++; //*큐 한번 비워질때마다 그림수++
        if (area > MXarea) MXarea = area; //최대너비찾기
      }

    }
  }

  cout << cnt << endl;
  cout << MXarea << endl;
  return 0;
}