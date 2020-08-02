//미완
//#include <bits/stdc++.h>
#include <iostream>
#include <string>
#include <map>
#include <set>
#include <deque>
#include <vector>
#include <functional>
#include <algorithm>
#include <cstdlib>
using namespace std;

int main(void) {
	// N개의 원소포함하는 양방향 순환 큐 (앞에서만 뽑을수잇음)
	// 3가지 연산 수행
	// 1. 첫번째 원소 뽑는다.
	//    a1,,,,ak -> a2,,,,ak
	// 2. 왼쪽으로 한 칸 이동   (pop_front(1), push_back(1))
	//    a1,,,,ak -> a2,,,,,ak,a1
	// 3. 오른쪽으로 한 칸 이동 (pop_back(k), push_front(k)
	//    a1,,,,,ak -> ak, a1, ,,,ak-1

	//입력1 : 큐의 크기 N , 뽑으려는 수의 개수 M
	// N<=50, M<=N
	//입력2 : 뽑으려는 수의 위치가 순서대로
	// 출력:  그 원소를 주어진 순서대로 뽑아내는데 필요한 2번, 3번 연산의 최솟값 출력?

	//입력:
	// 10 3
	// 1 2 3
	// 출력: 0 (1번 연산만 하면 됨)

	int n;   //데이터 수
	int m;   //뽑는 원소 수 
	int cnt = 0; 

	cin >> n >> m;

	// n개의 원소담긴 덱형성
	deque <int> dq;

	//�̴� ���� ��ġ
	const int MX = 50;
	int arr[MX];
	for (int i = 0; i < m; i++) cin >> arr[i];

	//뽑는 원소 위치

	// 2 9 5 -----------------

	// 1 2 3 4 5 6 7 8 9 10 popfront*1
	// 2 3 4 5 6 7 8 9 10 1 pop 2

	// [3] 4 5 6 [7] 8 9 10 [1] popback*3    3-9 << 9-1 ( 6< 8
	// 9 10 1 3 4 5 6 7 8 pop 9

	// 10 1 3 4 5 6 7 8 popfront*4


	// 1 6 3 2 7 9 8 4 10 5----------

	// 1 2 3 4 [5] 6 7 8 9 10             pop 1

	// [2] 3 4 5 [6] 7 8 9 [10]               <popfront*4 (  6 = 6 ) / 2-6 = 4 == 10-6 = 3
	// 6 7 8 9 10 2 3 4 5                 pop 6

	// [7] 8 9 10 [2] 3 4 [5]                 >popback*3   ( 2<3)  / 7-3 = 4 >> 5-3 = 2
	// 3 4 5 7 8 9 10 2                   pop 3

	// [4] 5 7 [8] 9 10 [2]                   >popback*1  (8 > 2)  /  4-2 = 2 >>  2-2 = 0
	// 2 4 5 7 8 9 10                     pop 2
	
	// [4] 5 7 [8] 9 [10]                     <popfront*2  4-7 = 3 == 10-7 = 3
	// 7 8 9 10 4 5                       pop 7

	// [8] 9 [10] 4 [5]                      <popfront *1  8-9 << 5-9
	// 9 10 4 5 8                         pop 9 

	// 10 4 [5] 8                         >popback *1 10-8 >> 8-8
	// 8 10 4 5                          pop 8

	// 10 [4] 5                           >popfront*1 10-4 >> 5-4    
	// 4 5 10                              pop 4

	// 5 10                               popfront*1 
	// 10 5                               pop 10

	//5                                   pop 5 

 

	for (int i = 1; i <= n; i++) {
		dq.push_back(i);
	}


	// 중간값보다 앞에잇으면 오른쪽으로, 중간값보다 뒤에있으면 왼쪽으로
	for (int i = 0; i < m; i++) {

		while (dq.front() != arr[i]) {

			if (abs(arr[i] - dq.front()) <= abs(arr[i] - dq.back()) || dq[dq.size()/2] == arr[i] ) { 
			//if ((arr[i] - dq[dq.size() / 2]) < 0) { //2��
				int k = dq.front();
				dq.pop_front();
				dq.push_back(k);
			}
			else {
				int k = dq.back();
				dq.pop_back();
				dq.push_front(k);
			}
			cnt++;
			cout << arr[i] << "----" << endl;
			//cout << cnt << endl;
		}
		dq.pop_front();
		
		cout << arr[i] << "----" << endl;
		cout << cnt << endl;
	}

	cout << cnt << endl;

}


