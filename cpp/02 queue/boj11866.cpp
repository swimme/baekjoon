//#include <bits/stdc++.h>
#include <iostream>
#include <string>
#include <map>
#include <set>
#include <queue>
#include <vector>
#include <functional>
#include <algorithm>

using namespace std;

//요세푸스문제
// 1~N명의 사람이 원을 이룸
// 양의 정수 K 가주어짐 (k<=n)
// k번째 사람 제거

//한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정 계속

//원에서 사람이제거되는 순서를 "요세푸스 순열 (N, k)" 이라고함
// (7,3)이면 요세푸스 순열은 <3,6,2,7,5,1,4>

//1,2,34567 - 124,5,67 - 1,2457,- 14,5,7 - 1,4,5 - 1,4, - 4 
int main(void) {
	int n;
	int k;

	queue <int> Q;
	for (int i = 0; i < n; i++) Q.push(i);

	//7 3
	cout << '<';
	while (n--) {							//while(!Q.empty())도 가능
		for (int i = 1; i < k; i++) {
			//int top = Q.front();    //수정
			Q.push(Q.front());
			Q.pop();
			//Q.push(top);
		}
		//int num = Q.front();  
		//cout << num << ', ';
		cout << Q.front();
		Q.pop();
		if (!Q.empty()) cout << ", ";
		
	}
	//cout << '\b' << '\b' << endl; 
	//틀린 요인: '\b'는 하나의 문자일 뿐, 정말로 출력했던 문자를 도로 지우는 문자가 아닙니다. 
	//단지 화면에 내보낼 때만 지운 것처럼 보이게 할 뿐입니다. 출력했던 문자는 지울 수 없습니다.
		cout << ">";

	return 0;
}

// 1 2 3 4 5 6 7 
// 3 6
// 9 > 7 이면 9 - 7 = 2 
// 

