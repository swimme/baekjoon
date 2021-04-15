/*
상근이는 퀴즈쇼의 PD이다.
이 퀴즈쇼의 참가자는 총 8개 문제를 푼다. 
참가자의 총 점수는 가장 높은 점수 5개의 합이다. 
참가자의 8개 문제 점수가 주어졌을 때, 총 점수를 구하는 프로그램을 작성하시오.

입력
- 8개 줄에 걸쳐서 각 문제에 대한 참가자의 점수가 주어진다. 
  - 점수는 0보다 크거나 같고, 150보다 작거나 같다. 
  - 모든 문제에 대한 점수는 서로 다르다. 

20
30
50 -
48 -
33 -
66 -
0
64 -

출력
- 첫째 줄에 참가자의 총점을 출력한다. 
- 둘째 줄에는 어떤 문제가 최종 점수에 포함되는지를 공백으로 구분하여 출력한다. 
- 출력은 문제 번호가 증가하는 순서이어야 한다.
261
3 4 5 6 8
*/

#include <bits/stdc++.h>
using namespace std;

int main(void){
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);

  freopen("input.txt", "r", stdin);

  vector< pair<int, int> > pv(8);
  vector< int > arr;
  int total = 0;

  for (int i = 0; i < 8; i++){
    cin >> pv[i].first;
    pv[i].second = i+1;
  }

  sort(pv.begin(), pv.end());

  for (int i = 7; i > 2; i--){
    total += pv[i].first;
    arr.push_back(pv[i].second);
  }

  sort(arr.begin(), arr.end());

  cout << total << "\n";

  for (int i = 0; i < 4; i++){
    cout << arr[i] << " ";
  }
  cout << arr[4];


  return 0;
}