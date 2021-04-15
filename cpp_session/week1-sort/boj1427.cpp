// 배열을 정렬하는 것은 쉽다.
// 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

// 입력
// 첫째 줄에 정렬하고자하는 수 N이 주어진다.
// N은 1,000,000,000보다 작거나 같은 자연수이다.
// 2143

// 출력
// 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
// 4321

#include <bits/stdc++.h>
using namespace std;

string sort(string word) {
  for (int i = 0; i < word.length()-1; i++) { 
    for ( int j = 0 ; j < word.length() ; j ++ ){
      char tmp = word[j];
      if ( word[j] < word[j+1] ){
        word[j] = word[j+1];
        word[j+1] = tmp;
      }
    }
  }

  return word;
} 


int main(void) {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);

  string n;
  cin >> n;

  n = sort(n);

  cout << n;

  return 0;
}


// #define _CRT_SECURE_NO_WARNINGS
// #include <stdio.h>
// #include <stdlib.h>
// #include <string.h>

// int compare(const void * a, const void * b)
// {
// 	return (*(char*)a - *(char*)b);
// }

// int main(void)
// {
// 	char ary[10];
// 	scanf("%s", ary);
// 	qsort(ary, strlen(ary), sizeof(char), compare);
// 	for (int i = strlen(ary) - 1; i >= 0; i--)
// 	{
// 		printf("%c", ary[i]);
// 	}
// 	return 0;
// }


// #include<stdio.h>
// #include<string.h>
// #pragma warning(disable:4996)

// int main(void) {
// 	char num[11] = { 0, };
// 	scanf("%s", num);

// 	int tmp;

// 	for (int i = 0; i < strlen(num); i++) {
// 		for (int j = 0; j < strlen(num); j++) {
// 			if (num[i] > num[j]) {
// 				tmp = num[i];
// 				num[i] = num[j];
// 				num[j] = tmp;
// 			}
// 		}
// 	}

// 	printf("%s", num);

// 	return 0;

// }