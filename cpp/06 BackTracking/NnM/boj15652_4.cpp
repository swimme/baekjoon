// 1~n
// 길이 m
//한수열에서 같은수 여러번 골라도된다.
//비내림차순이어야한다. 2 2 (o), 2 1(x)
// 수의 중복을 막기 위해 사용하던 isused가 이젠 필요하지 않고
// 비내림차순 성질을 만족하기 위해 재귀 함수 내의 for문이 0부터 시작하는 대신 arr[k-1]부터 시작하면 됩니다.

#include <iostream>
using namespace std;
#define MX 8

int n, m;
int arr [MX]; 

void track(int k, int j ){
  if (k == m) {
    //print
    for (int i = 0; i<m; i++) cout << arr[i] << ' ';
    cout << endl;
    return;
  }

  // 1~n탐색이 아닌 i+1부터 탐색 - 인자로
  for (int i = j; i<n; i++) {
    arr[k] = i+1;
    track(k+1, i);
  }

  /* 비내림차순 다른 방법
  
  int st = 0;
  if(k != 0) st = arr[k-1];  //k가 0이 아닌 경우에 대해
  for(int i = st; i < n; i++)
  //st라는 변수하나 만들어서 arr값저장하여 init조건으로

  */
}

int main (void) {
  cin >> n >> m;
  track(0, 0);
}
