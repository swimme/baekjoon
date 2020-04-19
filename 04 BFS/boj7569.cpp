#include <queue>
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

//3차원배열과 bfs
//pass하는 경우 -1일때 , 이미 지난 경우?
//모든 토마토가 1이 될때까지 

//큐가 엔드될때 == 같은 1만 지나온다
//이미 1인 토마토 = 0일째
// 1인토마토 인접한 = 하루
// 인접의인접 = 이틀째
// -> 미로문제처럼 풀면 안되는 이유 
// : 익은토마토 옆에 있음에도 더 빠르게 접근된 칸에 의해 더 오래 걸리는 것으로 저장될수잇다..
#define MX 100
#define X first
#define Y second

int dirX[6] = {1,0,-1,0,0,0};
int dirY[6] = {0,1,0,-1,0,0};
int dirZ[6] = {0,0,0,0,1,-1};

int main(void) {
  int box[MX][MX][MX];
  int day[MX][MX][MX];

  //입력
  int m,n,h; //가로, 세로, 높이
  cin >> m >> n >> h;
  for (int k=0; k<h; k++) {
    for (int i=0; i<n; i++){
      for(int j=0; j<m; j++) {
        cin >> box[i][j][k];
      }
    }
  }

  //day 범위만큼 초기화
  for (int i= 0; i<n; i++) {
    for (int j= 0; j<m; j++) 
      fill(day[i][j],day[i][j]+h,-1);
  }

  queue < pair<pair<int,int>,int> > Q;
  
  for (int k=0; k<h; k++) {
    for(int i=0; i<n; i++) {
      for (int j=0; j<m; j++) {
        //시작점찾기
        if( box[i][j][k]!=1 || day[i][j][k] >= 0  ) continue;//안익었거나 이미방문한경우 pass?
          
        Q.push({{i,j},k});
        day[i][j][k]++; 

        while(!Q.empty()) {
          auto cur = Q.front();
          Q.pop();

          for (int i = 0; i<6; i++){
            int nx = cur.X.X + dirX[i];
            int ny = cur.X.Y + dirY[i];
            int nz = cur.Y + dirZ[i];

            if(nx<0 || ny<0|| nz<0|| nx>=n || ny>= m || nz>=h ) continue;
            // 토마토가없거나 이미익은토마토인경우, 이미방문한토마토+더 적은날인경우 pass
            if (box[nx][ny][nz] != 0 || day[nx][ny][nz] >= 0 && day[nx][ny][nz] < day[cur.X.X][cur.X.Y][cur.Y] + 1 ) continue; 
              
            day[nx][ny][nz] = day[cur.X.X][cur.X.Y][cur.Y] + 1;
            Q.push({{nx,ny},nz});
          }
        }
      }
    }
  }

  // for (int k=0; k<h; k++) {
  //   for (int i=0; i<n; i++){
  //     for(int j=0; j<m; j++) {
  //       cout << day[i][j][k];
  //     }
  //     cout << endl;
  //   }
  //   cout << endl;
  // }

  
  //day에 -1이 없으면 최대값출력
  //day에 -1이 있으면 box의 -1개수보다 day의 -1개수가 더크면 -1 (안익은게잇)
  //                   box의 -1개수와 day의 -1개수가 같으면 0

  if (count(&day[0][0][0],&day[0][0][0]+m*n*h, -1) == 0 ) {
    cout << *max_element( &day[0][0][0],&day[0][0][0]+m*n*h) << endl;
  } else {
    if (count(&box[0][0][0],&box[0][0][0]+m*n*h, -1) < count(&day[0][0][0],&day[0][0][0]+m*n*h, -1)) cout << -1 << endl;
    else cout << 0 << endl;
  }
  
}
