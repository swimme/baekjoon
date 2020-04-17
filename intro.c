#include <stdio.h>


//서로 다른위치 두원소 합이 100이면 1 아니면 2
//0이상 100이하 
int func2(int arr[], int N) {
	for (int i = 0; i < N; i++) {
		for (int j = i+1; j < N; j++) {
			if (arr[i] + arr[j] == 100) return 1;
		}
	}
	return 0;
}

// N이 제곱수면 1을 반환
// 제곱수가 아니면 0을 반환
// 9 = 3*3, 16 = 4*4 , 25 = 5*5
// 루트함수 쓰려했는데 차라리
int func3(int N) {
	for (int i = 1; i*i <= N; i++)
		if (i*i == N) return 1;
	return 0;
}

// N이하의 수 중에서 가장 큰 2의 거듭제곱수 반환하는
int func4(int N) {
//	for (int i = 1; i<=N; i++)
//		if 
	// func(5)
	int val = 1;
	while (2 * val <= N) //2*1 <= 5 //2*2 <=5
		val *= 2; // 2 //4
	return val; //4

	//1로 시작하여 2,4,8 커지다가 N보다 작을때 stop

	//시간복잡도 O(logN ) re
}


int main(void) {
	int arr[] = { 1,52,48 };
	printf("%d \n", func2(arr,3));
	printf("%d \n", func3(9));
	return 0;
}

// - 정수형
// char 자료형 1byte = 8bit
// int 자료형 4byte
// long long

//integer overflow
// int가 long long보다 연산 속도와 메모리 모두 우수하지만 80번째 피보나치 수를 구하는 문제와 같이 int 자료형이 표현할 수 있는 범위를 넘어서는 수를 저장해야 하면 반드시 long long 자료형을 사용해야 합니다.
//char (-128~127 / 0~255(unsigned) )
// int (21억) = (2.1 * 10^9)

// - 실수형
// float 4byte (유효 6)
// double 8byte (유효 15)
// 실수 비교는 등호보다 , < 1e-12 (아주작은값보다 차가적다로 )

