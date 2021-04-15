/*
1. 금메달 수가 더 많은 나라 
2. 금메달 수가 같으면, 은메달 수가 더 많은 나라
3. 금, 은메달 수가 모두 같으면, 동메달 수가 더 많은 나라 

각 국가는 1부터 N 사이의 정수로 표현된다. 

만약 두 나라가 금, 은, 동메달 수가 모두 같다면 두 나라의 등수는 같다. 
예를 들어, 1번 국가가 금메달 1개, 은메달 1개를 얻었고, 
2번 국가와 3번 국가가 모두 은메달 1개를 얻었으며, 
4번 국가는 메달을 얻지 못하였다면, 

1번 국가가 1등, 
2번 국가와 3번 국가가 공동 2등, 
4번 국가가 4등이 된다. 
이 경우 3등은 없다. 

각 국가의 금, 은, 동메달 정보를 입력받아서, 
어느 국가가 몇 등을 했는지 알려주는 프로그램을 작성하시오. 

입력
- 입력의 첫 줄은 국가의 수 N(1 ≤ N ≤ 1,000)과 등수를 알고 싶은 국가 K(1 ≤ K ≤ N)
  - 각 국가는 1부터 N 사이의 정수로 표현된다. 
- 각 국가를 나타내는 정수와 이 국가가 얻은 금, 은, 동메달의 수가 빈칸을 사이에 두고 주어진다. 
전체 메달 수의 총합은 1,000,000 이하이다.

출력
- 입력받은 국가 K의 등수를 하나의 정수로 출력한다. (1등부터 시작)

[총4] 3번나라
1/ 1 2 0
2/ 0 1 0
3/ 0 1 0
4/ 0 0 1

# 2

4 3번나라
1/ 3 0 0
3/ 0 0 2
4/ 0 2 0
2/ 0 2 0

#4
*/



#include <bits/stdc++.h>
using namespace std;

//sol 2
int n, target;
bool cmp(pair<pair<int, int>, pair<int, int> > v1, pair<pair<int, int>, pair<int, int> >   v2){
  if (v1.first.first > v2.first.first) //금
    return true;
  else if (v1.first.first == v2.first.first){ 

    if (v1.first.second > v2.first.second) //은
      return true;
    else if (v1.first.second == v2.first.second){

      if (v1.second.first > v2.second.first)  //동
        return true;
      else if (v1.second.first == v2.second.first)
        // 동일 랭크일 경우 target 나라가 먼저 오도록
        // then, 공동 등수에 대해 신경안써도됨
        return v1.second.second == target;

    }
  }

  return false;
}

int main(void){
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);

  freopen("input.txt", "r", stdin);

  cin >> n >> target;

  vector<pair<pair<int, int>, pair<int, int> > > v(n);
  // < 금, 은 > < 동, id>

  for (int i = 0; i < n;i++){
    cin >> v[i].second.second >> v[i].first.first >> v[i].first.second >> v[i].second.first;
  }

  sort(v.begin(), v.end(), cmp);

  for (int i = 0; i < n; i++) {
    if (v[i].second.second == target){
      cout << i + 1 << "\n";
      break;
    }
  }

  return 0;
}



// sol3.
// 입력받을 때부터 index를 나라 id로 
// 1번 국가부터 N번 국가까지 K번 국가보다 더 잘한 국가일 경우 res++

// #include <iostream>
// using namespace std;
 
// int N, K;
// int gold[1001]; // 1001이 MAX?
// int silver[1001];
// int bronze[1001];
// int res = 0;
 
// int main() {
 
//     //입력
//     cin >> N >> K;
//     for (int i = 0; i < N; i++) {
//         int index;
//         cin >> index;
    
//         // 입력받을 때부터 index를 나라 id로 
//         cin >> gold[index] >> silver[index] >> bronze[index];
//     }
 
//     //1번 국가부터 N번 국가까지 K번 국가보다 더 잘한 국가일 경우 res++
//     for (int i = 1; i <= N; i++) {
//         if (gold[i] > gold[K]) {
//             res++;
//         }
//         else if (gold[i] == gold[K]) {
//             if (silver[i] > silver[K]) {
//                 res++;
//             }
//             else if (silver[i] == silver[K]) {
//                 if (bronze[i] > bronze[K]) {
//                     res++;
//                 }
//             }
//         }
//     }
 
//     //출력
//     cout << res + 1;
// }



// 모든 랭킹 구현 방법
// #define MAX 1000000
// #define ll long long

// int main(void){
//   ios_base::sync_with_stdio(false);
//   cin.tie(nullptr);
//   freopen("input.txt", "r", stdin);

//   int n, target;
//   cin >> n >> target;

//   vector < pair<ll, int> >  sc(n);
//   // <점수, 번호>
  
//   for (int i = 0; i < n;i++){
//     ll id, gold, silver, bronze;
//     cin >> id >> gold >> silver >> bronze;
//     ll total = gold*1000*MAX + silver*MAX + bronze; //흠...점수로....

//     sc[i] = make_pair(total, id);
//   }

//   sort(sc.rbegin(), sc.rend());  //내림차순 정렬!!!

//   vector <pair<ll, ll> > rank(1001);
//   // <등수, 번호>


//   int pivot = 1; // 랭킹
//   int cnt = 0; // 동점인 나라 수-1

//   rank[0].first = pivot;
//   rank[0].second = sc[0].second;

//   for (int i = 1; i < n; i++) {
//       int flag = 0;
//       if (sc[i - 1].first > sc[i].first) {  //기존
//           pivot++; // 랭킹++
//           pivot += cnt;  // +동점으로 건너뛴 랭킹
//           rank[i].first = pivot; 
//           cnt = 0; 
//       }
//       else {  // 이전거랑 동점인 경우
//           cnt++; // 동점인 나라수 ++
//           rank[i].first = pivot; //랭킹
//       }
//       rank[i].second = sc[i].second; //나라번호
//   }

//   for (int i = 0; i < n; i++) {
//       cout << rank[i].first << " " << rank[i].second <<"\n";
//       if (rank[i].second == target)
//           cout << rank[i].first << '\n';
//   }



  // vector<pair<int, int> > rank = check_rank(n, sc);
  // for (int i = n-1; i >=0 ;i--){
  //   cout << rank[i].first << " " << rank[i].second <<"\n";
  //   if (rank[i].first == target) {
  //     cout << rank[i].second << "\n";
  //   }
  // }

//   return 0;
// }


// vector<pair<int, int> > check_rank(int n, vector<pair<ll, int> > sc)
// {
//   vector<pair<int, int> > rank(n);
//   int ranking = 1;

//   for (int i = n-1; i >=0; i--){  
//     rank[i].first = sc[i].second;
//     rank[i].second = ranking;
    
//     if (i - 1 >= 0 && sc[i].first == sc[i + 1].first) {
//       rank[i].second = ranking-1; // 틀림 왜냐면 같은 등수인게 2개 일때만 작용.
//     }

//     ranking += 1;
//   }

//   return rank;
// }



//4.
#include <cstdio>

int main()
{
    int arr[1001][3]={0};
    int n=0,k=0;
    scanf("%d %d",&n,&k);
    int c;
    for(int i=0;i<n;i++)
    {
        scanf("%d",&c);
        scanf("%d %d %d",&arr[c][0],&arr[c][1],&arr[c][2]);
    }
    int cnt=0;
    for(int i=1;i<=n;i++)
    {
        if(arr[k][0]<arr[i][0] || arr[k][0]==arr[i][0] && arr[k][1]<arr[i][1] ||
           arr[k][0]==arr[i][0] && arr[k][1]==arr[i][1] &&arr[k][2]<arr[i][2]){
            cnt++;
        }

    }
    printf("%d",cnt+1);


    return 0;
}