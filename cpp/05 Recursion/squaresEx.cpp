//a^b mod m
#include <iostream>
using namespace std;

typedef long long ll;

int func1(int a, int b, int m) {
  int val = 1;
  while(b--) val = val*a%m;
 // val = val % m;
  return val;
}

//int overflow 주의 ! 6^12는 int범위 벗어남
// long long 
// 중간에서 계속 %m해줘야함

//b가 그다지 작지않고 최대 20억일 경우? too much loop
// -> b=2k, b=2k+1일때에 따라 ..
// a^b = (a^k)^2*a
// a^b = (a^k)^2 

// 인자 b를 점점 줄이기
// (3,13,13) -< (3,6,13) -< (3,3,13) -< (3,1,13) -< (3,0,13)
// (3,0,13) return 으로 (3,1,13) 
// (3,1,13) return 으로 (3,3,13)
// ... on and on
  
  ll func2(ll a, ll b, ll m){ 

  if (b==0) return 1;  //base condition , else 무한 loop

  ll val = func2(a,b/2,m); 
  val = val * val % m;  // int overflow 방지

  if ( b % 2 == 0) return val;  //함수호출x for시간복잡도

  return val * a%m;
}


int main(void) {
  //cout << func1(6,12,5) << endl;
  cout << func2(3,13,5)<< endl;
}
