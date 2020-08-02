//#include <bits/stdc++.h>
#include <iostream>
#include <string>
#include <map>
#include <set>
#include <deque>
#include <vector>
#include <functional>
#include <algorithm>
using namespace std;

int main(void) {
	int n; 
	cin >> n;

	deque <int> dq;

	while (n--) {
		string s;
		cin >> s;

		if (s == "push_front") {
			int i;
			cin >> i;
			dq.push_front(i);
		}
		if (s == "push_back") {
			int i;
			cin >> i;
			dq.push_back(i);
		}
		if (s == "pop_front") { 
			if (dq.empty()) cout << -1 << endl;
			else {
				cout << dq.front() << endl;
				dq.pop_front();
			}
		}
		if (s == "pop_back") { 
			if (dq.empty()) cout << -1 << endl;
			else {
				cout << dq.back() << endl;
				dq.pop_back();
			}
		}
		if (s == "size") {
			cout << dq.size() << endl;

		}
		if (s == "empty") { 
			cout << dq.empty() << endl;
		}
		if (s == "front") { 
			if (dq.empty()) cout << -1 << endl;
			else cout << dq.front() << endl;
		}
		if (s == "back") {
			if (dq.empty()) cout << -1 << endl;
			else cout << dq.back() << endl;
		}
	}

	return 0;
}