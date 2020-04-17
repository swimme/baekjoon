//#include <bits/stdc++.h>
#include <algorithm>
#include <iostream>
#include <queue>

using namespace std;

#define X first
#define Y second //stl pair에서 first,second줄여쓰기 위해 사용

int board[502][502] =
{{1,1,1,0,1,0,0,0,0,0},
 {1,0,0,0,1,0,0,0,0,0},
 {1,1,1,0,1,0,0,0,0,0},
 {1,1,0,0,1,0,0,0,0,0},
 {0,1,0,0,0,0,0,0,0,0},
 {0,0,0,0,0,0,0,0,0,0},
 {0,0,0,0,0,0,0,0,0,0} };
 // 1이 파란 칸, 0이 빨간 칸에 대응

bool vis[502][502]; //해당 칸 방문여부저장
int n = 7, m = 10; // n행, m열

int dx[4] = {1,0,-1,0};
int dy[4] = {0,1,0,-1}; //상2(0,1) 하4(0,-1) 좌3(-1,0) 우1(1,0)  네방향

int main(){
  queue<pair<int,int>> Q; //stl pair
  //init
  vis[0][0] = 1; //(0,0)방문표시
  Q.push({0,0});

  while(!Q.empty()) {
    auto cur = Q.front();
    Q.pop();
    cout << '(' << cur.X << "," << cur.Y << ") ->" ; // (x,y) ->

    for(int dir = 0; dir<4; dir++) { //우상좌하칸에 대해
      int nx = cur.X + dx[dir];
      int ny = cur.Y + dx[dir];

      if (nx<0 || nx >=n || ny<0 || ny >= m) continue; //범위밖일경우 pass
      if (vis[nx][ny] =1 || board [nx][ny] != 1)continue; //이미 방문한 칸이거나 파란판아닐경우 pass
      

      vis[nx][ny] = 1; //방문표시
      Q.push({nx,ny});
    }
  }
  
}