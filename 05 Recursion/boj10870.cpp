//피보나치수 5
#include <iostream>
using namespace std;

//피보나치 수는 0과 1로 시작
//a0 = 0
//a1 = 1
//an = an-1 + an-2 (n>=2)

// n번째 피보나치 수를 구하라
// 0 <= n <= 20
int pibo(int k) {
  if (k==0) return 0;
  if (k==1) return 1;
  return pibo(k-1)+pibo(k-2);
}

int main (void){
  int n;
  cin >> n;
  cout << pibo(n) << endl;
}


