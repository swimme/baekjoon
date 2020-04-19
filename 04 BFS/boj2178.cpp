#include <queue>
#include <iostream>
using namespace std;

// 입력
// 첫째줄: 두 정수 n,m 2~100
// n개 세로, m개 가로
// n개의 줄이 m개씩 '붙어서'입력됨 - 배열인덱스로

// 시작점과의 거리를 저장할 dist배열을 하나둠
// dist배열을 미리 -1로 초기화하면 vis배열을 따로 둘 필요없이 배열의 값이 0이상인지로 방문여부 확인가능..
#define MX 100
#define X first
#define Y second

int main (void) {
  int n,m;
  cin >> n >> m;

  //입력
  char miro[MX][MX];
  for (int i=0; i<n; i++){
    for(int j=0; j<m; j++) {
      cin >> miro[i][j];
    }
  }

  //거리배열 - 방문여부
  int dist[MX][MX] = {-1 };

  //아래, 오른쪽 ctrl
  int dirX[4] ={1,0,-1,0};
  int dirY[4] ={0,-1,0,1};

  int cnt = 0; //경로
//  int dis = 0; //거리

  queue <pair<int,int>> Q;
  
  //init
  dist[0][0] = 1;
  Q.push({0,0});
  
  while(!Q.empty()){
    auto cur = Q.front();
    Q.pop();

    for (int i =0; i<4; i++){
      int nx = cur.X + dirX[i];
      int ny = cur.Y + dirY[i];

      if(nx<0 || nx>= n || ny<0 || ny >= m) continue;
      if(dist[nx][ny]>1 || miro[nx][ny] != '1') continue;

      dist[nx][ny]= dist[cur.X][cur.Y]+1; //현재보다 1증가한 거리로
    //dist[nx][ny] = dis;
      Q.push({nx,ny});
    }
  }

  cout << dist[n-1][m-1] << endl;
  return 0;
}