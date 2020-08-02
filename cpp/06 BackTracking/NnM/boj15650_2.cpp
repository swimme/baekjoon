//*확인 issued - 없어도됨ㅇㅇ (오름차순이므로 반복문 시작점을 늘려주면됨)
//N과 M (2)
//한 수열에 중복없이 오름차순
// 1 1 (x)
// 1 2 (o)
// 2 1 (x)
// 2 3 부터

#include <iostream>
#define MX 8
using namespace std;

int n, m;
int arr[MX];
bool issued[MX];

void track(int id, int k) {
  if(k==m) {
    for (int i =0 ; i<m; i++) 
      cout << arr[i] << ' ';
    cout << endl;
  }

  //1~n에 대해 오름차순 - 가능 , 인자로도 가능
  // int st = 0;
  // if (k!=0) st = arr[k-1];
  for (int i = id; i<n; i++) {
    // if (!issued[i]) { //*확인
      arr[k] = i+1;
      // issued[i] = 1;
      track (i+1,k+1);
      // issued[i] = 0;
    // }
  }

}

int main(void){
  cin >> n >> m;
  track(0,0);
}
