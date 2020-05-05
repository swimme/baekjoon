//백준 17608
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

//N개의 막대기에 대한 높이정보 입력
// 오른쪽에서 몇개 보이는 지 출력
// = 맨앞 + 그외엔 맨앞보다 높이 높은 것

// top보다 낮은게 들어올때는 그냥 push
// top보다 (같거나) 높은게 들어올때는 낮은게 나올때까지 S.pop하고 넣기 - size return

int main(void) {
	int cnt = 1; //보이는 막대기 수
	int n; //막대기개수
	cin >> n;

	stack <int> S;

	while (n--) {
		int i; //데이터pushs
		cin >> i;
		
		while (!S.empty() &&S.top() <= i) {
			S.pop();
		}
		S.push(i);
	}

	cout << S.size();
	return 0;

}
