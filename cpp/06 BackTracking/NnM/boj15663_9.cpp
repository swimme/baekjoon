/*
** used저장위치 다시 재정립
** base condition에 return문 추가하는 것의 의미 다시정립!

n개의 무작위 + 중복일 수 있는 수 
사전순 수열 (sort필요)
1 2 (o)
2 1 (o)

** 단, 수열은 중복이면 안됨
-> 같은k번째 자리에 대해 직전에 출력된 arr수가 num에있는 다음수와 다른지 확인하는 조건 추가? (인자로 직전에 사용된 k번째수넘기기?)
-> 아님 sort하면서/후 중복된 수 제거? (시간복잡도 주의..)
*/

#include <iostream>
#include <algorithm>

using namespace std;
#define MX 8
int n, m;
int num[MX];
int arr[MX];
bool issued[MX];

void track(int k){
  if (k==m) {
    for (int i =0; i<m; i++)
      cout << arr[i] << " ";
    cout << endl;
    return;
  }

  int used = 0;
  for (int i =0 ; i<n; i++){
    if (!issued[i] && used!= num[i]) {
      arr[k] = num[i];
      issued[i]=1;
      track(k+1); 
      issued[i]=0; //k번째 수에 i가 들어가는 경우 모두 확인
      used = arr[k]; //for 중복체크
      // cout << "arr[k]" << k << " " << used << endl;
    }
    //if문탈출한 반복문마지막 경우는 첫자리 수 모두확인한 경우 (1 7, 1 7, 1 9) rere
  }
}

int main(void){
  ios_base::sync_with_stdio(0);
	cin.tie(0);

  cin >> n >> m;
  for (int i = 0; i <n; i++ )
    cin >> num[i];
  
  sort(num, num+n);
  
  track(0);
}