# 큐 (queue)

가장 먼저 저장된 데이터가 가장 먼저 꺼내지는 자료구조 _FIFO ; First In, First Out 구조

: 한 쪽(rear)에서 데이터가 들어가고 반대쪽(front)에서 데이터가 나온다

: 배열 기반으로도 할 수 있고 연결리스트 기반(Node라는 구조체 사용)기반으로도 할 수 있다

### 기능 및 특징
- 원소 추가 (rear에서)
- 원소 제거 (front에서)
- 제일 앞뒤 원소확인 
- 시간 복잡도 모두 O(1)

![queue](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FtIB0q%2FbtqCBxHVCbe%2F8Q9zKNhaDEgPp3qvSKuqpk%2Fimg.png)

- head(front): 가장 앞 원소 index
- tail(rear): 가장 뒤 원소 index +1

- push 할땐 tail증가 / pop할땐 head가 증가

- 선형배열의 큐는 데이터 삽입/삭제가 반복되면 front 와 rear가 점점 뒤로 이동해서 큐 안에 빈 공간이 있음에도 full로 인식될 수 있다. 

### 원형 큐
: 원형큐는 rear가 맨 끝에 도달했을 때 새로운 데이터가 추가되면 rear가 맨앞으로 돌아간다. 

예를 들어 enqueue는,
```
rear = rear+1 <br>
rear = rear % QUEUE_SIZE 
```


### 구현
```
const int MX = 1000005;
int dat[MX];
int head = 0, tail = 0;
```

- push 
dat[tail++] = x

- pop 
head++ 
(데이터 굳이 변경필요x)

- front/back
dat[head]
dat[tail-1]

![front/back](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FbfvvNI%2FbtqCFxzXzPV%2F5Cf7uYGxZ9IaScP4Ky7odk%2Fimg.png)

#### C++: STL Queue
- queue는 BFS, FloodFill에서 자주 활용

```queue <int> Q; ```
- push, pop, front, back
- queue가 empty일때 확인필요


#### 파이썬에서 queue 구현하기
- 리스트형으로 .append와 .pop(0) 활용해서 구현
- 파이썬 queue모듈
```python
import sys
q = queue.Queue()       # 큐 객체생성, 사이즈설정

자료넣으려면
q.put()                # 데이터차있으면대기
q.put_nowait()         # 데이터차있으면 full이라 뜬다

자료꺼내려면
q.get() 
q.get_nowait()

상태알려주는메소드
q.qsize()
q.empty()
q.full()

초기화
q.__init__()

+큐는 search안되는 특징있지만 파이썬에선 리스트처럼 전체확인 가능하다
q.queue                 # deque([])
```
