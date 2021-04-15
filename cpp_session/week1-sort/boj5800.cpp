/*
한상덕은 이번에 중덕 고등학교에 새로 부임한 교장 선생님이다. 
교장 선생님으로서 첫 번째 일은 << 각 반의 수학 시험 성적의 통계를 내는 일 >> 이다.

중덕 고등학교 각 반의 학생들의 수학 시험 성적이 주어졌을 때,
<< 최대 점수, 최소 점수, 점수 차이를 구하는 프로그램 >> 을 작성하시오.

입력
- 반의 수 K (1 ≤ K ≤ 100)
- 각 반의 학생수 N (2 ≤ N ≤ 50)와 각 학생의 수학성적 (0<= score <=100)

출력
각 반에 대한 출력은 다음과 같이 두 줄로 이루어져 있다.

- "Class X"
- 가장 높은 점수, 낮은 점수, 성적을 내림차순으로 정렬했을 때 가장 큰 인접한 점수 차이

입력
2
5 30 25 76 23 78
6 25 50 70 99 70 90

출력
Class 1
Max 78, Min 23, Largest gap 46

Class 2
Max 99, Min 25, Largest gap 25
*/

#include <bits/stdc++.h>
using namespace std;

int get_lg_gap(int cnt, int scores[]){
  int lg_gap = 0;

  for (int i = 0; i < cnt - 1; i++) {
    if (lg_gap < scores[i+1] - scores[i]) {
      lg_gap = scores[i+1] - scores[i]; 
    }
  }

  return lg_gap;
}

int main(void){
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);

  freopen("input.txt", "r", stdin);

  int k; 
  cin >> k;

  for (int i = 0; i < k; i++){
    int n;
    cin >> n;
    int scores[n];

    for (int j = 0; j < n; j++){
      cin >> scores[j];
    }

    sort(scores, scores+n);
      
    cout << "Class " << i+1 << "\n";
    cout << "Max "
         << scores[n-1]
         << ", Min "
         << scores[0]
         << ", Largest gap "
         << get_lg_gap(n, scores)
         << "\n";
  }

  return 0;
}