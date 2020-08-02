/*
n개의 무작위 수(sort) + 중복일 수 있는 수 
단, 중복된 수열 x -> 직전에 사용된 수 저장하여 비교조건추가
같은 수를 여러 번 골라도 된다. ==  1 1 (o) -> issued 필요x

고른 수열은 비내림차순이어야 한다. (1 1 같은게 포함되기때문에) 
-> 1 7 (o)
7 1 (x)
7 7 부터 
-> 인자로 시작점index넘겨주기 
-> or used활용가능..?
*/

#include <iostream>
#include <algorithm>
using namespace std;
#define MX 8

int n,m;
int num[MX];
int arr[MX];

void track(int k, int id) {
  if (k==m) {
    for (int i = 0 ; i<m; i++)
      cout << arr[i] << ' ';
    cout << endl;
    return;
  }

  int used = 0;
  for (int i = id; i<n; i++){
    if (used != num[i]) {
      arr[k]= num[i];
      track(k+1, i);
      used = arr[k];
    }
  }
}

int main(void) {  
  ios_base::sync_with_stdio(0);
  cin.tie(0);
  cin >> n >> m;
  for (int i = 0; i<n; i++)
    cin >> num[i];
  
  sort(num, num+n);
  track(0, 0);
}