#include <iostream>
#include <vector>
using namespace std;

#define MX 8

int n, m;

//k개수까지 택함
void track(int* arr, bool* issued, int k) {
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
      track(arr, issued, k+1); //다음 수 정하러 재귀
      issued[i] = 0; // k번째 수를 i+1로 정한 모든 경우에 대해 확인했으니 다시 back
    }
  }
}

int main(void) {
  cin >> n >> m;

  int arr [MX];
  bool issued[MX];

  track(arr, issued, 0);

}