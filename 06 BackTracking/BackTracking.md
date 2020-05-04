# 백트래킹 (Backtracking)

: 문제의 답을 구하기 위해 현재 상태에서 가능한 모든 후보군을 따라 들어가며 탐색하는 알고리즘
!image[bt](https://t1.daumcdn.net/cfile/tistory/998D57415C3721AE2E)

### 예시 - BOJ N과M 시리즈

- boj15649: N과 M(1)
- 백트래킹을 이용해 비어있는 리스트에서 시작해 수를 하나씩 추가하면서 길이가 M인 수열을 만들면 해당 수열을 출력하면 됩니다.
  !image[boj15649](https://t1.daumcdn.net/cfile/tistory/99B1AA3A5C3721B02D)
- 수를 추가할땐 어떤 수가 수열에 이미쓰였고 어떤 수가 쓰이지 않았는지 따로 저장하고 있어야함
  !image[boj15649_2](https://t1.daumcdn.net/cfile/tistory/99227B3A5C3721B128)

- 구현
- issued 배열: 각 수가 수열에 쓰였는지 확인하는변수
- k: 리스트에 들어있는 수의 개수
- arr 리스트: 리스트에 들어있는 수 (arr[1~k])

- backtracking

1. 초기 리스트 비어있는 상태
   !image[bt1](https://t1.daumcdn.net/cfile/tistory/99598D3A5C3721B125)

- arr : empty
- issued : 모두 False로 초기화
- k: 0

2. 원소추가 및 출력
   !image[bt2](https://t1.daumcdn.net/cfile/tistory/9934423A5C3721B327)

- arr에 추가
- issued 해당 인덱스 T로
- k++
- k=m일때 순열출력

3. 출력 후 이전경우로 back
   !image[bt3](https://t1.daumcdn.net/cfile/tistory/99E5B63A5C3721B41F)

- issued[n-1] false로 변경 , k--
- arr[n-1]은 이미 의미없으므로 굳이변경필요x

4. 다시 n번째 원소 정하기 - 3번반복
5. 모든 경우해본경우 한칸더 뒤로 가기
   !image[bt5](https://t1.daumcdn.net/cfile/tistory/9964123A5C3721B630)

- arr과 issued를 vector로 두어도되고, 함수인자 대신 전역변수로 선언해도 됨
