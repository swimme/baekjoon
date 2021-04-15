/*
  요세푸스 문제는 다음과 같다.
  
  1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 
  양의 정수 K(≤ N)가 주어진다.

  이제 순서대로 K번째 사람을 제거한다. 
  한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.

  이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 
  원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 
  예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
  
  #4 
  N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
*/

#include <bits/stdc++.h>
using namespace std;

int main(void) {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);

  freopen("input.txt", "r", stdin);

  int n, k;
  cin >> n >> k;

  queue <int> Q;
	for (int i = 1; i <= n; i++) Q.push(i);  

	cout << '<';
	while (n--) {							
		for (int i = 1; i < k; i++) {
			int top = Q.front();    
			Q.push(top);
			Q.pop();
		}
		cout << Q.front();
		Q.pop();
		if (!Q.empty()) cout << ", ";		
	}
	cout << ">";

  return 0;
}