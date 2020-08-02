/* 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열 
1 2
2 1 

*/
#include <iostream>
#include <vector>
using namespace std;

#define MX 8

int n, m;
int arr [MX];
bool issued[MX];

//k개수까지 택함
void track(int k) {
  //base condition - m개를 모두 택하면 출력
  if (k==m) {
    for (int i = 0; i<m; i++) cout << arr[i] << ' ';
    cout << '\n';
    return;
  }

  //1~n까지의 수에 대해 track
  for (int i = 0; i<n; i++) {
    if (!issued[i]) {  
      arr[k] = i+1;
      issued[i] = 1; //used
      track(k+1); //다음 수 정하러 재귀
      issued[i] = 0; // k번째 수를 i+1로 정한 모든 경우에 대해 확인했으니 다시 back
    }
  }
}

int main(void) {
  cin >> n >> m;

  track(0);

}