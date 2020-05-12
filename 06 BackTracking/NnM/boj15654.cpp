/*vector 쓰레기값 다시확인 */
// N과 M
//N개의 무작위 수 중 M개를 고른 수열

//입력
// n , m (n 주어질 수 개수)
// n개의 수들

#include <iostream>
#include <algorithm> //for sort
#include <vector>

#define MX 8
using namespace std;

int n, m;
int arr[MX];
bool issued[MX];
int num[MX];
// vector <int> v;

void track(int k){
  if (k == m) {
    for (int i =0; i<m; i++) {
      cout << arr[i] << ' ' ;
    }
    cout << endl;
  }
  
  for (int i =0; i<n; i++) {
    if (!issued[i]) {
      // arr[k] = v[i]; //vecto[i]는 반환만
      arr[k] = num[i];
      issued[i] = 1;
      track(k+1);
      issued[i] = 0;
    }
  }
}

int main(void) {

	ios_base::sync_with_stdio(0);
	cin.tie(0);
  cin >> n >> m;
  // int num[n]; //works in g++ <- 지역변수사용시 시간초과

  // v.resize(n); <- n만큼 공간예약 + null로 초기화/ 없으면..
  for (int i = 0; i<n; i ++) {
    // int k;
    // cin >> v[i]; //이렇게 사용가능
    // v.push_back(k); 
    cin >> num[i];
  }

  // sort(v.begin(), v.end());
  sort(num, num+n);
  track(0);
}


