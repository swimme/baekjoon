//#include <bits/stdc++.h>
#include <algorithm>
#include <iostream>
#include <queue>

using namespace std;

#define X first
#define Y second //stl pair에서 first,second줄여쓰기 위해 사용

// 0-1 보드
int board[502][502] =
{{1,1,1,0,1,0,0,0,0,0},
 {1,0,0,0,1,0,0,0,0,0},
 {1,1,1,0,1,0,0,0,0,0},
 {1,1,0,0,1,0,0,0,0,0},
 {0,1,0,0,0,0,0,0,0,0},
 {0,0,0,0,0,0,0,0,0,0},
 {0,0,0,0,0,0,0,0,0,0} };
 // 1이 파란 칸, 0이 빨간 칸에 대응
int n = 7, m = 10; // n행, m열

// 0-2 방문여부
bool vis[502][502]; 

// 0-3 상하좌우 control
int dx[4] = {1,0,-1,0};
int dy[4] = {0,1,0,-1}; 
 

int main(){
  queue<pair<int,int>> Q; // 0-4 queue with stl pair

  //1 init -  방문표시, push
  vis[0][0] = 1;
  Q.push({0,0});
  int cnt=1; //칸수

  // loop
  while(!Q.empty()) {
    auto cur = Q.front(); //2 현재 위치 , pop
    Q.pop();
    cout << '(' << cur.X << "," << cur.Y << ") ->" ; // (x,y) ->

    for(int dir = 0; dir<4; dir++) { // 3 인접한 칸 check
      int nx = cur.X + dx[dir]; //좌우이동
      int ny = cur.Y + dy[dir]; //상하이동

      //4 칸 범위 & 방문여부 & 칸종류 check
      if (nx<0 || nx >=n || ny<0 || ny >= m) continue; //범위밖일경우 pass
      if (vis[nx][ny] || board [nx][ny] != 1) continue; //이미 방문한 칸이거나 파란판아닐경우 pass
      
      vis[nx][ny] = 1; //5 방문표시, push
      //cnt++;
      Q.push({nx,ny});
    }
  }
  //cout << cnt;
}