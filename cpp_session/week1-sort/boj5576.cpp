/*
입력 20행
1~10: W대학 참가자의 점수 (정수 0~100)
11~20: K대학 참가자의 점수 (정수 0~100)

10 명 중 득점이 높은 사람에서 3 명의 점수를 합산하여 대학의 득점으로하기로 했다.
이때, 각각의 대학의 점수를 계산하는 프로그램을 작성하라.


출략: 
W 대학 점수와 K 대학의 점수(합산)를 순서대로 공백으로 구분하여 출력하라.
*/


#include <bits/stdc++.h>
using namespace std;

bool cmp(int a, int b){
  return a > b;
}

int main(void){
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);

  freopen("input.txt", "r", stdin); 
  freopen("output.txt", "w", stdout);

  int W[10];
  int K[10];

  int w_score = 0;
  int k_score = 0;

  for (int i = 0; i < 10; i++){
    cin >> W[i];
  }

  for (int i = 0; i < 10; i++){
    cin >> K[i];
  }

  sort(W, W + 10, cmp);
  sort(K, K + 10, cmp);

  for (int i = 0; i < 3; i++){
    k_score += K[i];
    w_score += W[i];
  }

  cout << w_score << " " << k_score;

  return 0;
}