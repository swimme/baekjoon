/*
무작위 수 + 오름차순(issued x)
** 주의 : 무작위수 sort해야함

1 2 (o)
2 1 (x)
*/

#include <iostream>
#include <algorithm> //for sort
using namespace std;

#define MX 8

int n, m;
int num[MX]; //입력수 받을 배열
int arr[MX]; //수열
// bool issued[MX];

void track(int k, int j) { //수열의 k번째 수 정하기
  //base condition (k==m일때)
  if (k==m) {
    for (int i=0; i<m; i++)
      cout << arr[i] << ' ';
    cout << endl;
  }

  //시작점 update for 오름차순
  // int st = 0;
  // if (k!=0) st = arr[k-1];
  //-> 이렇게하면 안되는 이유는 .... 수열의 첫 수가 7일때 st가 7이된다 7<n이므로 반복문종료됨
  // 시작점이 num의 index가 되어야한다
  // 시작점을 따로 저장하기보다 인자로 몇번째 num까지 track 했는지 넘겨주는게 좋을듯

  for (int i = j ; i<n; i++){ 
    arr[k] = num[i];
    track(k+1,i+1);
  }
}

int main(void) {
  ios_base::sync_with_stdio(0);
	cin.tie(0);
  cin >> n >> m;

  //수 입력받기
  for (int i = 0; i<n; i++){
    cin >> num[i];
  }
  sort(num, num+n);

  track(0,0);
}