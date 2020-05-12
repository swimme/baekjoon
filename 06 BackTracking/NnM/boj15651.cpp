//N과M(3) 
//같은 수를 여러번 골라도됨 - issued없어도ㅇ
// 2 1 (ㅇ)
// 2 2 (ㅇ)

/*printf, scanf써야 시간초과x*/

#include <iostream>
#define MX 7
using namespace std;

int arr[MX];
int n, m;
void track(int k){
  if (k==m) {
    for (int i =0 ; i<m; i++) {
      cout << arr[i] << ' ';
    }
    cout << endl;
    return;
  }

  for (int i = 0; i <n ; i++ ) {
    arr[k] = i+1;
    track(k+1);
  }
}

int main (void) {
  cin >> n >> m;

  track(0);
}