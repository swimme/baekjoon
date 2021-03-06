# Heap

- 여러개의 값들 중 **최대값이나 최솟값을 빠르게 찾아내도록** 만들어진 자료구조
  - O(logn)
- **우선순위 큐** 구현을 위해 많이 쓰인다.
  - 루트 노드에 우선순위가 높은 데이터를 위치시킴
- **키 값의 대소가 부모-자식 노드** 사이에만 성립
- (왼쪽 노드부터 채워지는) 완전 이진트리의 일종
- 힙 트리에서는 중복된 값을 허용한다.
- Max heap, Min heap

- **구현**

  - 주로 배열로 구현
  - 구현을 쉽게 하기 위해 배열의 첫 인덱스인 0은 사용되지 않음
  - 힙에서의 부모 노드와 자식 노드의 관계
  - 왼쪽 자식의 인덱스 = (부모의 인덱스) \* 2
  - 오른쪽 자식의 인덱스 = (부모의 인덱스) \* 2 + 1
  - 부모의 인덱스 = (자식의 인덱스) / 2

    [https://www.fun-coding.org/Chapter11-heap.html](https://www.fun-coding.org/Chapter11-heap.html)

    ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/50610dd7-38e1-45ba-a730-e5a55ccf4a9a/_2021-01-12__3.29.12.png](https://images.velog.io/images/swimme/post/f46e9016-3c4a-40a1-aa7d-9d6528f3bd67/스크린샷%202021-01-12%20오후%209.16.46.png)

  ### 삽입

  1. 삽입하고자 하는 값을 트리의 가장 마지막 원소에 추가한다.
  2. 부모노드와의 대소관계를 비교하면서 만족할 때까지 자리 교환을 반복한다.

  ### 삭제

  - 힙에서는 루트 노드만 삭제가 가능

  1. 루트 노드를 제거한다.
  2. 가장 마지막 노드를 루트로 이동시킨다.
  3. 자식노드와 비교하여 max heap (or min heap)이 만족할 때까지 이동시킨다.

- 파이썬 **heapq module**

  - 리스트를 min heap처럼 다룰 수 있게 해준다.

  ```python
  import heapq

  heap = []
  # 노드 추가
  heapq.heappush(heap, 1)

  # 노드 삭제 (root 노드 return)
  heapq.heappop(heap)

  # 기존 리스트를 힙으로 변환
  heapq.heapify(tmp)
  ```

  - max heap 만들기

  ```python
  # y = -x 변환을 하면 최솟값 정렬이 최댓값 정렬로 바뀐다.
  # 힙에 원소를 추가할 때 (-item, item)의 튜플 형태로 넣어주면 튜플의 첫 번째 원소를 우선순위로 힙을 구성하게 된다.

  heap_items = [1,3,5,7,9]
  max_heap = []

  for item in heap_items:
    heapq.heappush(max_heap, (-item, item))

  # 실제 원소값은 인덱싱 [1]로 접근 가능하다.
  ```

- [모듈 없이 구현](./maxHeap.py)

> 해시는 효율적인 데이터 적재와 보안 등의 상황에서, 힙은 속도가 중요한 자료구조가 필요할 때 사용하곤 하는데 실무에서 이런 것들을 바닥부터 구현해서 쓸 일은 거의 없지만, 이 개념을 정확히 이해하면 프로그래밍 기본 실력에 큰 도움이 된다.

- 프로그래머스

  - [더 맵게](./prog01.py)

    > 형제 노드와의 대소관계는 관련 없음을 주의할 것. 따라서 최대/최소는 인덱싱 [0]또는 [1]로 가능하지만 두번째로 작은 수는 인덱싱으로 알 수 없다.

  - [디스크 컨트롤러](./prog02.py)

    > 시간이 흐름에 따라 재heapify해야 하는 문제<br/>
    > 시간 내 요청된 작업이 있는 경우, 없는 경우로 나눠서 처리하면 됨 <br/>
    >
    > - 시간 내 요청된 작업이 있는 경우<br/>
    >   : 그 작업들에 대해 **<i>처리시간을 기준으로</i>** heapify<br/>
    >   : 시간이 지남에 따라 작업들을 계속 갱신(heappush)해야함 <br/><br/>
    > - **시간 내 요청된 작업이 없는 경우**<br/>
    >   : 요청시점이 (햔재)시간이 돼도록 해야 함 <i>(처음에 놓친 부분)</i>

    ```python
    a = [[1, 2], [3, 4]]
    print(a.pop()[::-1]) #[4, 3]
    ```
