# Queue

- 가장 먼저 저장된 데이터가 가장 먼저 꺼내지는 자료구조

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/aadb4e0e-51b6-477a-8f66-eb81e10bd930/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/aadb4e0e-51b6-477a-8f66-eb81e10bd930/Untitled.png)

- FIFO ; First In, First Out 구조
- 한 쪽(rear)에서 데이터가 들어가고 반대쪽(front)에서 데이터가 나온다
- 배열 기반으로도 할 수 있고 연결리스트 기반(Node라는 구조체 사용)기반으로도 할 수 있다
- queue는 **BFS**, **Flood Fill**에서 자주 활용

## 구현

- 원소 추가 (rear에서) O(1)
- 원소 제거 (front에서) O(1)
- 제일 앞 뒤 원소확인 O(1)
  - head(front): 가장 앞 원소 index
  - tail(rear): 가장 뒤 원소 index +1
- 선형배열의 큐는 데이터 삽입/삭제가 반복되면 front 와 rear가 점점 뒤로 이동해서 큐 안에 빈 공간이 있음에도 full로 인식될 수 있다.

### **파이썬 queue 구현하기**

- 리스트형으로 .append와 .pop(0) 활용해서 구현
- **파이썬 queue모듈**

  ```python
  import sys
  q = queue.Queue()       # 큐 객체생성, 사이즈설정

  # 자료넣으려면
  q.put()                 # 데이터차있으면대기
  q.put_nowait()          # 데이터차있으면 full이라 뜬다

  # 자료꺼내려면
  q.get()
  q.get_nowait()

  # 상태알려주는메소드
  q.qsize()
  q.empty()
  q.full()

  # 초기화
  q.__init__()

  # 큐는 search안되는 특징있지만 파이썬에선 리스트처럼 전체확인 가능하다
  q.queue
  ```

## **원형 큐**

- 원형큐는 rear가 맨 끝에 도달했을 때 새로운 데이터가 추가되면 rear가 맨앞으로 돌아간다.

예를 들어 enqueue는,

```cpp
rear = rear+1
rear = rear % QUEUE_SIZE
```
