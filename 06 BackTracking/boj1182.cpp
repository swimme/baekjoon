/*
- 다른방법도 확인

<부분수열의합>
N개의 정수로 이루어진 수열이 있을때
크기가 양수인 부분수열 중 그수열의 원소합이 S가 되는 경우의수

입력:
1 정수개수N, 정수S
2 N개의 정수가 빈칸을 사이에 두고 주어짐

출력:
합이 S가 되는 부분수열의 개수
*/
#include <iostream>
#include <vector>
using namespace std;

int n, s;
vector <int> num;
vector <bool> issued;
int cnt;
int sum;

void track(int k, int id, int size, int * part) { //k번째수까지   
  
  // if (sum == s){
  //   cnt++;
  //   // return;
  // }  
  if (k==size) {
    int sum = 0;
    for (int i=0; i<size; i++){
      sum+=part[i];
    }
    if (sum ==s) cnt++;
  }

  //index오름차순
  for (int i=id;i<n;i++) {
      part[k] = num[i];
      track(k+1, i+1, size, part);
  } 
}

int main(void){
  cin >> n >> s;
  int part[n];
  
  for (int i=0; i<n; i++){
    int m;
    cin >> m;
    num.push_back(m);
  }

  for (int i=1; i<=n;i++) {
    track(0, 0, i, part);
  }
  cout << cnt << endl;
}
