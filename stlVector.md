# stlVector 활용하기

vector: linked list를 이미 구현해둔 하나의 컨테이너

- 장점

1. linked list를 배열처럼 사용가능
   : linked list의 순차탐색 단점 극복

```C++
for(int i=0; i<size; i++){
       vData[i].x = i;
}
```

2. 삽입, 삭제연산등을 따로 구현 필요x

```C++
vData.push_back(data);
```

- 구현 예시

```C++
#include <vector>
using namespace std;

```
