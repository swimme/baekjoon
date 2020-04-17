# 03 덱 (Deque)

: 양쪽 끝에서 삽입과 삭제가 가능한 자료구조
(double ended queue)


##### 기능 및 특징
- 원소 추가
- 원소 제거
- 제일 앞뒤 원소확인 
- 모두 시간 복잡성 O(1)

- cf. stl deque는 인덱스로 원소 접근가능

##### 구현
'''
const int MX = 1000005;
int dat[2*MX+1];    //배열의 크기
int head = MX, tail = MX;  //시작을 배열의 중간으로 두어야 함
'''
- push_front
dat[--head] = x;
// head앞으로 옮겨 공간확보

- push_back
dat[tail++] = x;
// tail빈공간에 넣고 tail뒤로

- pop_front
head++;

- pop_back
tail--;

- front
dat[head];

- back
dat[tail-1];

![deque](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FbesnXT%2FbtqCF7WTabb%2FpLsE40mTwpq0d7LMBrGiA0%2Fimg.png)


###### STL d10 3eque
- vector와 비슷?
cf. vector와 달리 deque은 모든 원소들이 메모리 상에 연속하게 배치되어 있지 않습니다
cf. 앞쪽과 뒷쪽에서의 추가와 제거가 모두 필요하면 당연히 STL deque을 사용하는게 효율적이지만 굳이 앞쪽에서의 추가와 제거가 필요하지 않고 배열과 같은 느낌으로 쓰고싶을 땐 STL deque말고 STL vector를 쓰면 됨


'''
deque<int> DQ;

DQ.push_front(10); // 10
DQ.push_back(50);  // 10 50
DQ.push_front(24); // 24 10 50

for (auto x: DQ) cout << x;

DQ.size();
DQ.empty();

DQ.pop_front(); //10 50
DQ.pop_back();  //10

DQ.back() //10

'''

'''
DQ.insert( DQ.begin() +1, 33); // 10 33
DQ.insert( DQ.begin() +2, 22); // 10 33 22

DQ[2] = 17; // 10 33 17  //index접근가능

DQ.erase( DQ.begin() ); 33 22

DQ.clear(); //모든 원소제거
''' 
