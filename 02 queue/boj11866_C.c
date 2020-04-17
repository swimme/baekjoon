//미완
#include <stdio.h>
#include <stdlib.h>    // malloc, free 함수가 선언된 헤더 파일

int main(void) {
	int n;
	int m;
	
	scanf("%d %d", &n, &m);
	
	int *arr = (int *) malloc(sizeof(int)*n);
	int * ptr = arr;

	for (int i = 0; i < n; i++)
		arr[i] = i + 1;

	for (int i = 1; i < n; i++) {
		if (m*i > n) {
			m = m*i - n;
		}
		ptr = ptr + m - 1;

		// 123 1234567
		// 456 //12457
		// 712 
		// 
	}

	return 0;

}