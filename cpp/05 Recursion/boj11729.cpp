#include <iostream>
#include <cmath>
using namespace std;

// a에서 b로 옮기기
//1. n-1개를 c에옮긴다.
//2. 가장큰판을 b에 옮긴다.
//3. n-1개를 c에서 b로 옮긴다.
// 
//횟수구하기
// A_n = 2A_n-1+1
// A_n = 2^n -1
int cnt = 0;
void hanoi(int a, int b, int k) {
  int c = 6-b-a;
  
  cnt++;
  if (k==1) {
    cout << a << ' ' << b << endl;
    return;
  }

  hanoi(a,c,k-1);
  cout << a << ' ' << b << endl;
  hanoi(c,b, k-1); //3번

}

int main(void){
  int n;
  cin >> n;
  // cout << pow(2,n)-1 <<endl;
  // cout << cnt <<endl;
  printf("%d\n", (1<<n)-1);
  printf("%d\n", int(pow(2,n)-1));
  hanoi(1,3,n);
}