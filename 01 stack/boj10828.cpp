//#include <bits/stdc++.h>
#include <iostream>
#include <string>
#include <map>
#include <set>
#include <stack>
#include <vector>
#include <functional>
#include <algorithm>
using namespace std;

//STL stack -boj10828
int main(void) {
	int n;  //명령수
	cin >> n;

	stack<int> S;
	
	while (n--) {
		string c;
		cin >> c;
		
		if (c == "push") {
			int i;
			cin >> i;
			S.push(i);
		}
		if (c == "top") {
			if(S.empty()) {  //비어있는지 확인
				cout << -1 << endl;
			}
			else {
				cout << S.top() << endl;
			}
		}
		if (c == "size") {
			cout << S.size() << endl;
		}

		if (c == "empty") {
			cout << S.empty() << endl; //비어있으면 1 아니면 0
		}
		
		if (c == "pop") {
			if (S.empty()) { //비어있는지 확인
				cout << -1 << endl;
			}
			else {
				cout << S.top() << endl;
				S.pop();
			}
		}

	}
	return 0;
}