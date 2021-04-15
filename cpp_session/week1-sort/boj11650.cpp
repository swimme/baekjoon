/*
좌표 정렬학기


2차원 평면 위의 점 N개가 주어진다. 

x좌표가 증가하는 순으로,
x좌표가 같으면 y좌표가 증가하는 순서로 정렬

입력
- 첫째줄 점의 개수 N (1 ≤ N ≤ 100,000)
- 둘째 줄부터: N개의 줄에는 i번점의 위치 x와 y가 주어진다. 
  (-100,000 ≤ xi, yi ≤ 100,000) 
  좌표는 항상 정수이고, 위치가 같은 두 점은 없다.

5
3 4
1 1
1 -1
2 2
3 3

출력
첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
1 -1
1 1
2 2
3 3
3 4
*/


#include <bits/stdc++.h>
using namespace std;
#define MAX_SIZE 100000

pair<int, int> p[MAX_SIZE];


/* y가 증가하는 순 
  y좌표가 같으면 x좌표가 증가하는 순서로 */
bool cmp(pair<int, int> p1, pair<int, int> p2){
  if (p1.second == p2.second)
    return p1.first < p2.first; //필수!
  return p1.second < p2.second;
}


int main(void) {  
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);


  freopen("input.txt", "r", stdin); 
  freopen("output.txt", "w", stdout);

  int N;
  cin >> N;

  for (int i = 0; i < N; i++){
    cin >> p[i].first >> p[i].second;
  }

  sort(p, p+N, cmp); // y가 증가하는 순

  for (int i = 0; i < N; i++){
    cout << p[i].first << " "<< p[i].second << "\n";
  }

  return 0;
}  


/* y증가 trick */
// int main(void) {  
//   ios_base::sync_with_stdio(false);
//   cin.tie(nullptr);

//   int N;
//   cin >> N;

//   for (int i = 0; i < N; i++){
//     cin >> p[i].second >> p[i].first;
//   }

//   sort(p, p+N); 

//   for (int i = 0; i < N; i++){
//     cout << p[i].second << " "<< p[i].first << "\n";
//   }

//   return 0;
// }  



