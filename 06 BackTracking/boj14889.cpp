/* bool team 처리 다시... vector의 문제는?? */
/* 왜 idx인자 추가? 다시.. */
//스타트와 링크
/*
 축구를 하기 위해 모인 사람은 총 N명이고 짝수이다. 
 이제 N/2명으로 이루어진 스타트 팀과 링크 팀으로 사람들을 나눠야 한다.

 번호를 1부터 N까지로 배정했고, 아래와 같은 능력치를 조사했다. 
 
 능력치 Sij는 i번 사람과 j번 사람이 같은 팀에 속했을 때, 팀에 더해지는 능력치이다. 
 팀의 능력치는 팀에 속한 모든 쌍의 능력치 Sij의 합이다. 
 
 Sij는 Sji와 다를 수도 있으며, i번 사람과 j번 사람이 같은 팀에 속했을 때, 팀에 더해지는 능력치는 Sij와 Sji이다.

축구를 재미있게 하기 위해서 스타트 팀의 능력치와 링크 팀의 능력치의 차이를 최소로 하려고 한다. 

위의 예제와 같은 경우에는 1, 4번이 스타트 팀, 2, 3번 팀이 링크 팀에 속하면 스타트 팀의 능력치는 6, 링크 팀의 능력치는 6이 되어서 차이가 0이 되고 이 값이 최소이다.
*/

/*
첫째 줄에 N(4 ≤ N ≤ 20, N은 짝수)이 주어진다. 
둘째 줄부터 N개의 줄에 S가 주어진다. 
각 줄은 N개의 수로 이루어져 있고, i번 줄의 j번째 수는 Sij 이다. 
Sii는 항상 0이고, 나머지 Sij는 1보다 크거나 같고, 100보다 작거나 같은 정수이다.

첫째 줄에 스타트 팀과 링크 팀의 능력치의 차이의 최솟값을 출력한다.
*/

#include <iostream>
#include <vector>
#include <cstdlib> //for abs
#include <algorithm>
#define MX 20
using namespace std;

int n;
vector < vector<int> > stat;
bool team[20];
// vector <bool> team(n);
int gap = 1000; //주어진 조건의 max

int addStat(){
  int A = 0;
  int B = 0;

  for (int i = 0; i<n; i++) {
      for (int j = 0; j<n; j++){
        if (team[j]&&team[i]) A += stat[i][j];
        else if (!team[j]&&!team[i]) B+= stat[i][j];
    }
  }
  return abs(A-B);
}

void track(int cur, int k) {
  //track- 모든 가능한 팀구성 
  //중복없이 수열 
  //(1,2) == (3,4) 
  //(1,3) == (2,4)
  //(1,4) == (2,5)
  // 팀구성은 (1, x) 에 대해서만 따져보면됨
  if (k==n/2) {
    int A = 0;
    int B = 0;

    for (int i = 0; i<n; i++) {
      for (int j = 0; j<n; j++){
        if (team[j]&&team[i]) A += stat[i][j];
        else if (!team[j]&&!team[i]) B+= stat[i][j];
    }
   }
    // if (gap > addStat()) gap = addStat();
    gap = min(gap, abs(A-B));
  }

  //팀구성 - 오름차순, 중복x, team[0] =1 일때만
  for (int i=cur+1; i<n; i++) {
      if (!team[i]) {
        team[i] = 1;
        track(i,k+1);
        team[i] = 0; 
      }      
  }
}

int main(void) {
  ios::sync_with_stdio(false);
  cin.tie(NULL);

  cin >> n;
  for (int j = 0; j<n; j++) {
    vector <int> tmp;
    for (int i = 0; i<n; i++) {
      int k;
      cin >> k;
      tmp.push_back(k);
    }
    stat.push_back(tmp);
  }

  // team.push_back(1);
  // team[0] = 1;
  track(0,0);
  cout << gap << endl;
}