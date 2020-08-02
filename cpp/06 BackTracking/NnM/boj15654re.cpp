// boj15654- why rere

#include <iostream>
#define MX 8
using namespace std;

int n, m;
void track(int * arr,  bool* issued, int* num, int k){
  if (k == m) {
    for (int i =0; i<m; i++) {
      cout << arr[i] << ' ' ;
    }
    cout << endl;
  }
  
  for (int i =0; i<n; i++) {
    if (!issued[i]) {
      arr[k] = num[i];
      issued[i] = 1;
      track(arr, issued, num, k+1);
      issued[i] = 0;
    }
  }
}

int main(void) {
  int arr[m];
  int num[n];
  bool issued[n];

  cin >> n >> m;

  for (int i = 0; i<n; i ++)
    cin >> num[i];

  track(arr, issued, num, 0);
}


