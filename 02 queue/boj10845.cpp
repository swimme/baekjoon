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

//stlQueue
int main(void) {
	int n; //명령어수
	cin >> n;

	queue <int> Q;

	while (n--) {
		string s;
		cin >> s;

		if (s == "push") {
			int i;
			cin >> i;
			Q.push(i);
		}
		if (s == "pop") { 
			if (Q.empty()) cout << -1<< endl;
			else {
				cout << Q.front() << endl;
				Q.pop();
			}
		}
		if (s == "size") {
			cout << Q.size() << endl;
		
		}
		if (s == "empty") { 
			cout << Q.empty() << endl;
		}
		if (s == "front") { //가장앞없으면 -1
			if (Q.empty()) cout << -1 << endl;
			else cout << Q.front() << endl;
		}
		if (s == "back") {
			if (Q.empty()) cout << -1 << endl;
			else cout << Q.back() << endl;
		}
	}

	return 0;
}