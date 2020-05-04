#include <queue>
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

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
  int unTomato = 0;
  int nowTomato = 0;
  cin >> m >> n >> h;

  for (int k=0; k<h; k++) {
    for (int i=0; i<n; i++){
      for(int j=0; j<m; j++) {
        cin >> box[i][j][k];
        if (box[i][j][k] == 0) unTomato++;
      }
    }
  }

  //day 범위만큼 초기화
  for (int i= 0; i<n; i++) {
    for (int j= 0; j<m; j++) 
      fill(day[i][j],day[i][j]+h,-1);
  }

  //fill(&day[0][0][0],&day[MX-1][MX-1][MX],-1);
  queue < pair<pair<int,int>,int> > Q;
  
  //시작점 queue에 넣기
  for (int k=0; k<h; k++) 
    for(int i=0; i<n; i++) 
      for (int j=0; j<m; j++) {
        if (box[i][j][k] == 1) {
          Q.push({{i,j},k});
          day[i][j][k]++;
        }
      }

  while(!Q.empty()) {
    auto cur = Q.front();
    Q.pop();
    
    for (int i = 0; i<6; i++){
      int nx = cur.X.X + dirX[i];
      int ny = cur.X.Y + dirY[i];
      int nz = cur.Y + dirZ[i];

      if( nx<0 || ny<0|| nz<0|| nx>=n || ny>= m || nz>=h ) continue; //영역밖
      if (box[nx][ny][nz] != 0 || day[nx][ny][nz] >= 0  ) continue; // 안익은 토마토 아니거나 이미방문한경우

      day[nx][ny][nz] = day[cur.X.X][cur.X.Y][cur.Y] + 1;
      nowTomato++; 
      Q.push({{nx,ny},nz});
    }
  }
  
  if (unTomato > nowTomato) cout << -1 <<endl; //덜 익은 토마토 있는 경우
  if (unTomato == nowTomato ) cout << *max_element( &day[0][0][0],&day[0][0][0]+m*n*h) << endl;
  
}