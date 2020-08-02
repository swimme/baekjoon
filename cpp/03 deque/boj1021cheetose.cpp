#include<cstdio>
#include<queue>
#include<algorithm>
using namespace std;
int a[50];
int main() {
	int n, m;
	queue<int> q;
	scanf("%d%d", &n, &m);
	for (int i = 1; i <= n; i++)
		q.push(i);

	for (int i = 0; i < m; i++)
		scanf("%d", a + i);

	int ans = 0;
	
	for (int i = 0; i < m; i++)
	{
		int size = q.size();
		int cnt = 0;
		while (q.front() != a[i])
		{
			q.push(q.front());
			q.pop();
			cnt++;
		}
		ans += min(cnt, size - cnt);
		q.pop();
	}
	printf("%d", ans);
}