/*
어떤 반에 있는 학생들의 생일이 주어졌을 때,
가장 나이가 적은 사람과 가장 많은 사람을 구하는 프로그램을 작성하시오.

입력
- 첫째 줄에 반에 있는 학생의 수 n이 주어진다. (1 ≤ n ≤ 100)
- 다음 n개 줄에는 각 학생의 이름과 생일이 "이름 dd mm yyyy"와 같은 형식으로
주어진다.

- 이름은 그 학생의 이름이며, 최대 15글자로 이루어져 있다. (1 <= name <= 15)
- 1990 ≤ yyyy ≤ 2010, 1 ≤ mm ≤ 12, 1 ≤ dd ≤ 31
  - 연, 월 일은 0으로 시작하지 않는다.
  - 이름이 같거나, 생일이 같은 사람은 없다.

5
Mickey 1 10 1991
Alice 30 12 1990
Tom 15 8 1993
Jerry 18 9 1990
Garfield 20 9 1990

출력
- 첫째 줄에 가장 나이가 적은 사람의 이름,
- 둘째 줄에 가장 나이가 많은 사람 이름을 출력한다.

Tom
Jerry
*/

#include <bits/stdc++.h>
using namespace std;

int main(void) {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);

  freopen("input.txt", "r", stdin); 

  int n;
  cin >> n;

  vector< pair<string,string> > pv(n);

  // moth, day, year 각각 저장하여 sort하는 방법.. better memory!
  // vector<pair<pair<int, int>, pair<int, string>>> v(N); 
  // for (int i = 0; i < N; i++) { 
  //   cin >> v[i].second.second >> v[i].second.first >> v[i].first.second >> v[i].first.first; 
  // }


  for (int i = 0; i < n; i++)
  {
    string year, month, day;
    pair<string, string> p;
    
    cin >> pv[i].second;
    cin >> day >> month >> year;

    if (day.length()==1)
      day = "0" + day;
    if (month.length()==1)
      month = "0" + month;

    pv[i].first = year + month + day;
  }

  sort(pv.begin(), pv.end());

  for (int i = 0; i < n; i++)
  {
    cout << pv[i].first << "\n";
  }

  cout << pv[n-1].second << "\n";
  cout << pv[0].second << "\n";

  return 0;
}


// int main(void) {
//   ios_base::sync_with_stdio(false);
//   cin.tie(nullptr);

//   freopen("input.txt", "r", stdin);

//   int n;
//   cin >> n;

//   string min_age_name;
//   int min_month, min_date, min_year;
//   cin >> min_age_name >> min_month >> min_date >> min_year;

//   int max_year, max_date, max_year = min_year;
//   string max_age_name = min_age_name;

//   for (int i = 0; i < n - 1; i++) {
//     string name;
//     int month, date, year;

//     cin >> name >> month >> date >> year;
//     if (min_year > year){
//       min_year = year;
//       max_age_name = name;
//       continue;
//     }
//     // if (min_year == year && min_date < min_date){
//     // 일일히 조건문 구현해야함;;
//     // }

//     if (max_year < year){
//       min_year = year;
//       min_age_name = name;
//     }
//   }

//   cout << min_age_name << "\n";
//   cout << max_age_name << "\n";

//   return 0;
// }

