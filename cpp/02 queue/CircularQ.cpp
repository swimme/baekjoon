//#include <bits/stdc++.h>
#include <iostream>
#include <string>
#include <map>
#include <set>
#include <queue>
#include <vector>
#include <functional>
#include <algorithm>
using namespace std;

const int MX = 1000005;
int dat[MX];
int head = 0;
int tail = 0; 

void push(int x) {
	
	//원래 full확인필요
	tail = (tail + 1) % MX;
	dat[tail] = x;

}

int pop() {

	//원래 empty확인필요

	head = (head + 1) % MX;
	return dat[head];

}

int front() {
	return dat[head];
}

int back() {
	return dat[tail - 1];
}

int empty() {
	if (head == tail) return 1;
	else return 0;
}

int full() {
	if ((tail + 1) % MX == head) return 1; //rere
	else return 0;
}

int main() {
	int n;
	int k;


	return 0;
}