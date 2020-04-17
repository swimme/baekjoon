#include <iostream>
#include <string>

using namespace std;

int mamin(void) {
	int size;
	cin >> size;

	int * dyary;
	dyary = new int[size];

	int cnt = 1;

	//입력
	for (int i = 0; i < size; i++) {
		cin >> dyary[i];
	}

	//탐색
	for (int i = 0; i < size; i++) {
		if (dyary[size - 1] < dyary[i]) cnt++;
	}

	cout << cnt;
	return 0;
}