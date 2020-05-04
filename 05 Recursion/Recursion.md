# 재귀 (Recursion)

: 하나의 함수에서 자기 자신을 다시 호출

- 자기자신을 다시 호출할 때 현재 함수입력값보다 더 작은 값을 인자로 넘겨주어야 함
- 입력값이 일정크기 이하일땐 더이상 자신호출하지 않고 값을 바로 반환 (base condition)

### 구현

- 예시:

```C
#include <bits/stdc++.h>
using namespace std;

void func(int n) {
  if (n==1 ) return 1; // base condition
  return func n*(n-1);
}
int main() {
  cout << func(5);
}
```

- 입력에 대해 어디까지 연산수행하고 어떤 입력값을 자신에게 다시 넘겨주어야 할지 잘 정해야 함

- 재귀와 반복문 : 재귀는 코드 더 간결하지만 메모리/시간에서 손해 볼 수 있으므로 유리한 경우 잘 구별해야 함
  ex. 피보나치 수열은 재귀로 해결하면 x \n
  (시간 복잡도 매우 커질 수 있음)

### 예시 문제

#### < a^b mod m >

!image[abmodm](https://t1.daumcdn.net/cfile/tistory/9957503E5C3229B616)

- squaresEx.cpp [squaresEx](squaresEx.cpp)

#### < 하노이의 탑>

!image[hanoi](https://t1.daumcdn.net/cfile/tistory/997022395C3229BA0A)

- hanoiEx.cpp [hanoiEx](hanoiEx.cpp)
