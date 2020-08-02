#include <iostream>
using namespace std;
// n개의 원판을 a에서 b로 옮기기

// 1. n-1개의 원판을 a에서 c로
// 2. 마지막원판을 a에서 b로
// 3. n-1개의 원판을 c에서 b로

// base condition : n이 1일 경우 2번과정만 하면됨

void func(int a, int b, int n) {
  int cnt = 0;

  if (n==1){                          //base condition
    cout << a << ' ' << b << endl;
    return;
  }

  int c = 6-a-b; //why 6? 1,2,3중 하나라고 가정?

  func(a,c,n-1); //1번
  cout << a << ' ' << b << endl;
  func(c,b,n-1); //3번
}

//+옮기는 최소 횟수 구하기
// n개 원판 옮기기 = (n-1개 원판 옮기기)*2 +1
// A_n = 2A_n-1 +1
// 점화식 일반항: A_n = 2^n -1

int main (void) {
  int n;
  cin >> n;
  cout << (1<<n)-1 << endl; //shift 비트연산 0001 shift 2^n 
  func(1,3,n);
}