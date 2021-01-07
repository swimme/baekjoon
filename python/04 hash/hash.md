## Hash Table

- 키(Key)에 데이터 (Value)를 저장하는 데이터 구조
- 키를 통해 데이터를 받아올 수 있으므로 속도가 빠름
- 파이썬의 Dictionary 타입
- 관련 용어:

  - Hash: 임의 값을 고정 길이로 변환하는 것
  - Hashing 함수: key에 대해 산술 연산을 이용해 데이터 위치를 찾을 수 있는 함수
  - Hash Value (Address): key를 해싱 함수로 연산하여 해쉬 값을 알아냄

- 프로그래머스

  - [완주하지 못한 선수](./prog01.py)
  - [전화번호 목록](./prog02.py) : 해쉬로 안품

  - 알게 된 것:

    - 리스트 sort 의 유용함
    - zip: 동일한 개수로 이루어진 자료형을 묶어 주는 기능

      ```python
      for item1, item2 in zip(list1, list2):
      	...

      list(zip(list1, list2, list3))
      #[(item11, item21, item31), (item12, item22, item32), ...]

      dict(zip(list1, list2))
      #{item11: item21, item12: item22, ...}
      ```

    - hash 함수

      - 임의의 길이를 갖는 메시지를 입력받아 "고정된 길이"의 해시값을 출력하는 함수
      - 입력 값의 아주 일부만 변경되어도 전혀 다른 결과 값을 출력한다.
      - 특정 입력 대해 항상 같은 해시 값을 리턴한다
      - 활용:

      ```python
      dic = {}
      for item in items:
        dic[hash(item)] = item
        temp += int(hash(item))
      ```

    - collections: Counter 객체

      ```python
      import collections
      items = [ 'a','a','b' ]
      collections.Counter(items)
      # Counter({'a': 2, 'b': 1 })

      # Counter는 hash형 자료들의 값의 개수를 셀때 사용가능
      # 딕셔너리처럼 {'자료 이름' : '개수'} 형식으로 만들어진다
      # Counter객체끼리 "뺄셈가능"
      ```

      외장 라이브러리 없이 리스트를 딕셔너리처럼 변환하여 다음과 같이 구현할 수 도 있음

    - **리스트를 딕셔너리로 변환**

      ```python
      items = ['a','b','c']

      #1.
      # {'a':0, 'b':0, 'c':0}
      dic = {item: 0 for item in list}
      # {0:'a', 1:'b', 2:'c'}
      dic = {index : items[index] for index in range(len(items))}

      #2.
      dic = dict.fromkeys(items,0)

      #3.
      dic = dict(zip(items, items))
      ```
