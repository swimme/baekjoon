# **Deque**

- 양쪽 끝에서 삽입과 삭제가 가능한 자료구조 (double ended queue)

## 구현

- 원소 추가 O(1)
- 원소 제거 O(1)
- 제일 앞뒤 원소확인 O(1)

- **파이썬 구현**

  - import deque

  ```python
  from collections import deque

  # d = deque()
  d = [3,4,5]
  deque(d)

  #삽입
  d.append(1)
  d.appendleft(1)
  d.insert(index, item) # 중간에 요소 삽입
  d.extend([])

  # 제거
  d.pop()
  d.popleft()

  print(list(d))
  ```
