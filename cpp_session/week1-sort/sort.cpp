// 2750번

//입력
// 철째줄에 수의 개수 N
// 둘째 줄부터는 N개의 수


// 출력
// 첫쨰줄부터 N개 줄에 오름차순으로 정렬한 결과

//bubble sort
#include <bits/stdc++.h>
using namespace std;
#define MAX_SIZE 1000

int main(void) {  
  int N;
  int arr[MAX_SIZE];
  cin >> N;

	for (int i = 0; i < N; i++) {
    cin >> arr[i];
  }
  
  for(int i = 0; i < N; i++){
      for(int j = 0; j < N - i - 1; j++){
        int temp = arr[j+1];
        //swap
        if(arr[j] > arr[j+1]){              
            arr[j+1] = arr[j];
            arr[j] = temp;
        }
      }
  } 

  for(int i = 0; i < N; i++){
      cout << arr[i] << "\n";
  }
}  


