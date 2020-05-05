# stlVector 활용하기

vector: linked list를 이미 구현해둔 하나의 컨테이너

- 특징
  : 가변적인 크기
  : 배열특성이므로 랜덤접근 가능

  ```C++
  for(int i=0; i<size; i++){
      vData[i].x = i;
  }
  ```

: 중간에 데이터 삽입/삭제에 용이하지x
: 저장데이터수 많은 경우 검색 용이x

- 주요 함수들

  - 생성자
    vector v
    vector v(n) : n개의 요소가 있는 v
    vector v(n, data) : data로 초기화된 n개의 원소를 가지는 v
    vector v(v2) : v에 v2를 복사하여 생성

  - v.assign(n,m) : n개의 요소에 m값 초기화
  - it = v.rbegin(): v의 역순차 첫요소 it
  - v.reserve(n) : n개의 원소 저장공간을 예약 (미리 동적할당 해두는 것)
  - v.resize(n) : v의 크기를 n개만큼 변경하고 확장된 공간의 값을 0으로 초기화 (capacity는 그대로)
  - v.capacity() : v의 요소가 할당된 공간의 크기
  - v.swap(v1): v1과 v를 서로 바꿈
  - v.insert(p, n, x): p가 가리키는 위치에 n개의 x값을 삽입
  - q = v.insert(p,x)
  - q = v.erase(p) : p가 가리키는 원소를 제거하고 q는 다음원소를 가리킴
  - v.clear()
  - 멤버 형식
    iterator
    reverse_iterator
    value type

- stlVector.cpp [stlVector](stlvector.cpp)
