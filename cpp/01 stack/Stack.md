# 스택 stack

: 가장 나중에 저장된 데이터를 가장 먼저 꺼낼 수 있는 자료구조
  LIFO; Last In, First Out 구조
  (= 데이터의 삽입과 제거가 한쪽 끝에서만 일어난다. 말그대로 데이터를 쌓아놓은 더미 )
  
: 배열 기반으로도 할 수 있고 연결리스트 기반(Node라는 구조체 사용)기반으로도 할 수 있다

### 기능 및 특징
- 원소 추가
- 원소 제거
- 제일 상단의 원소 확인
- 시간복잡도 모두 O(1)

- 구현하기 쉽고 간단하고 시간지역성을 활용할 수 있는 분야에서 사용된다
  (시간지역성=최근에 참조된 자료가 다시 참조될 확률이 높은 거)

- 스택 활용: 수식의 괄호 쌍이랑 전위/중위/후위 표기법, DFS, Flood Fill 등
단, 전위/중위/후위 표기법은 코딩테스트에 나올 확률이 0에 가깝다고 판단

- 장단점

 :배열 기반- 데이터의 변경이 적고 데이터 접근이 빈번할 때 유용
          - 스택의 용량(배열의 크기)를 정해두고 데이터를 쌓아야 한다
          
 :연결리스트 기반- 데이터의 접근이 적고 변경이 빈번할 때 유용
                - 중간에 데이터를 삽입가능/한번에 원하는 데이터의 접근이 불가능
                - 데이터 변경이 좀 더 복잡해져 시간이 오래 걸릴 수 있다.


### 구현
![stack](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2Fb5m0ma%2FbtqCxQOj9Zw%2FpM13PqCm2NEn8qkKMpXexK%2Fimg.png)

````
const int MX = 1000005;
int dat[MX];
int pos = 0;
````

- push
넣고 pos 1증가
dat[pos++] = x

- pop
pos 1줄이기만 하면 됨 (덮어써질거라서)
pos--;

- top
제일 위원소 확인
dat[pos-1]


#### C++ : STL stack
push
pop
top
empty
size



참고: https://blog.encrypted.gg/933?category=773649


 
