// 2750번

//입력
// 철째줄에 수의 개수 N
// 둘째 줄부터는 N개의 수


// 출력
// 첫쨰줄부터 N개 줄에 오름차순으로 정렬한 결과


#include <bits/stdc++.h>
using namespace std;
#define MAX_SIZE 1000000


int a[MAX_SIZE];
int tmp[MAX_SIZE];

void mergesort(int S, int E)
{
  if (S==E)
    return;
  int M = (S + E) / 2; //평균

  mergesort(S, M);
  mergesort(M + 1, E);

  for (int i = S; i <= E; i++)
    tmp[i] = a[i];

  int l = S, r = M + 1, now = S;
  
  while(l<=M && r<=E){
		if(tmp[l]<tmp[r]){
			a[now]=tmp[l];
			l++;
		} else{
			a[now]=tmp[r];
			r++;
		}
		now++;
	}

  // 나머지
	while(l<=M){
		a[now]=tmp[l];
		now++,l++;
	}

	while(r<=E){
		a[now]=tmp[r];
		now++,r++;
	}
}

int main(void) {  

  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);

  int N;
  cin >> N;

  for(int i=0;i<N;i++){
    cin >>a[i];  
  }
    
  mergesort(0,N-1);
  for(int i = 0; i < N; i++){
    cout << a[i] << "\n";
  }
}  


