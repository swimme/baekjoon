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

const int MX = 1000005;
int dat[MX]; //배열 
int pos = 0; //index

void push(int x) {
    dat[pos++] = x;
}
void pop(){
    pos--;
}
int top() { //top확인
    return dat[pos-1]; //pos위치주의
}
void test() {
    push(1); push(3); push(50);
    cout << top() << '\n'; //50
    pop(); pop();
    cout << top() << '\n'; //1
}

int main(void) {
    test();
}