//다시
//#include <bits/stdc++.h>
// #include <iostream>
// #include <string>
// #include <map>
// #include <set>
// #include <queue>
// #include <vector>
// #include <functional>
// #include <algorithm>
// using namespace std;

// 1. front의 중요도를 확인
// 2. 나머지중 top보다 중요도높은거 잇으면
//     인쇄x, queue의 가장뒤에 재배치

// 문서수와 중요도가 주어지면 어떤문서가 몇번째로 인쇄되는지
// 첫 줄에 test case

//입력
// test case 수
// N 각 case에 대해서 문서의 수  // M 몇번째로 인쇄됏는지 궁금한 문서가 queue 어딧는지 위치
// 중요도  (중요도 높은게 더 빨리)

// n =4, m=0(a문서가 궁금) 
// 중요도는 2143

// 3
// n=1 m=0 
// 5                  -> 첫번째
  
// 4 2 (c문서)
// 1 2 3 4           -> 두번째 (index m짜리가 몇번째로 나오는지 )
// a b c d
// 0 1 2 3 

// max가 나올때까지 poppush pop push

// 6 0 (a문서) -> index 0짜리가 몇번째로 나오는지
// 1 1 9 1 1 1        ->  다섯번째
// a b c d e f 
// 0 1 2 3 4 5
// [4] 5 0 1 2 3
// c - d - e - f - a - b

// 4 1 (b문서)
// 2 1 9 2 3 1
// 0 1 2 3 4 5

// 우선순위 큐 stl 사용?
// pq.pop() 

// 1 1 9 1 1 1 
// a b c d e f 

// 우선순위 큐와 큐 비교
// 0 1 2 3 4 5 pop push (0 != 2)
// 1 2 3 4 5 0 pop push 
// 2 3 4 5 0 1 pop 2 cnt++
// 3 4 5 0 1 pop 3
// 5 0 1 pop 4
// 0 1 pop 5
// pop 0 (until m == q.top)

// 1 1 9 1 1 1
// 0 1 2 3 4 5 

// 2 3 4 5 0 1 (우선순위큐 빼기 - 뺀 값의 index확인 불가?)

// int main(void) {

// 	int test;
// 	int n, m; //n개만큼 큐에 push //m 원하는 문서의 index

// 	cin >> test;

// 	cin >> n >> m; 

// //중요도를 배열&큐로 받아 max 함수써서 
// 	// 중요도큐 front == max이면 pop? 
// 	// 아니면 front pop&push
// 	// 배열에서 m의 중요도 몇인지 확인 [0]==1

// 	// [1] 1 9 1 1 1  
// 	// 1 9 1 1 1 [1] 
// 	// 9 1 1 1 [1] 1 

// 	//max를 기준으로 정렬?

// 	// queue할때
// 	queue <int> q;
// 	for (int i = 0; i < n; i++) { //n개만큼 q에 push
// 		int dat;
// 		cin >> dat;
// 		q.push(dat);

// 	}

// 	return 0;
// }


#include <iostream>
#include <queue>
using namespace std;
int main() {
	int count = 0;
	int test_case;
	cin >> test_case;
	int n, m, imp; //문서의 개수, 문서 위치, 중요도

	for (int i = 0; i < test_case; ++i) {
		count = 0;
		cin >> n >> m;

		queue<pair<int, int>> q;
		priority_queue<int> pq; // 우선순위 큐

		for (int j = 0; j < n; ++j) {
			cin >> imp;
			q.push({ j, imp }); // pair (index, imp)
			pq.push(imp);
		}

		while (!q.empty()) {
			int index = q.front().first;
			int val = q.front().second;

			q.pop();

			if (pq.top() == val) { // 가장높은 중요도 나오면 pop
				pq.pop();
				count++;

				if (index == m) { // 그 중요도가 원하는 문서면 cout
					cout << count << endl;
					break;
				}
			}
			else q.push({ index,val });
		}
	}