#include <iostream>
#include <vector>
using namespace std;

//자연수 N과 M이 주어졌을때 아래 조건을 만족하는 
//길이가 M인 수열을 모두 구하는 프로그램을 작성하시오
// - 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
// 1<=M<=N<=8
// nPm

//입력 3 1
// : 길이가 1인 1~3까지 자연수중 중복없이 1개를 고른 수열

//출력 
// 123 

// 4 4  4P4 = 4!/0!
// 1 2 3 4
// 1 2 4 3
// 1 3 2 4
// 1 3 4 2
// ...

//백트래킹
//비어있는 리스트에서 시작해 수를, 하나씩 추가하며 길이가 M인 수열을 만들어 해당수열을 출력
//현재 상태에서 수를 추가하려면 어떤 수가 수열에 이미 쓰였고 
// 어떤수가 아직 쓰이지않았는지를 저장해야함

int n, m; //tip 전역변수로 두면 함수인자일 필요x - 변하는값아니므로

void func(vector<int>& arr, vector<bool>& isused, int k){   

  //init k=0 에서 시작하여
  // k==m일때 return

  // k=0: for i0=0 : arr[0] = 1; issued[0] = 1
  //    재귀 k=1일때: for i1=1: arr[1] = 1+1; issued[1] = 1
  //      재귀 k=2일때: k=2이므로 return
  //                   (1,2) 
  //    k=1;i1=1; issued[1] = 0 //두번째수를 2(1+1)로 정한 경우에 대해 확인했으니 다시 back
  //    k=1: i1=2: arr[1] = 2+1; issued[2] =1
  //        재귀 k=2 일때: k =2이므로 return
  //                    (1,3)
  //     k=1: i1=2; issued[2] = 0
  //     i1<3이므로 loop탈출 -> k=1재귀끝
  // k = 0:i0=0: issued[0] = 0 //첫번째수를 1(0+1)로 정한 경우에 대해 확인했으니 다시 back
  // k = 0: i0 =1: arr[0] = 2; issued[0] =1;


  //전체 loop: 1~n까지 탐색
  //재귀인자: k
  // 첫번째수에대한 loop에 재귀를 통해 두번째수 loop, n번째수 loop까지

}
  

int main(void) {
  cin >> n >> m;
  // int arr[m] = {}; //This will work if use g++
  // bool isused[n] = {}; // 모두 아직 사용되지 않았다고 초기화

  vector <int> v;
  vector <bool> issued;
  int k = 0;

  vector<int>::iterator iter = v.begin(); 

  for (int i=0; i<m; i++) {
    //init 순서대로 넣음
    v[i] = i+1;
    issued[i] = 1;
    k++; //-> 재귀 인자로

    //길이 m일때 출력
    if (k==m) {
      for (iter; iter != v.end(); iter++)
		    cout << *iter << ' ';
      cout << endl;
    }

    //맨뒤에꺼 빼기 - 재귀끝난후로
    issued[m-1] = 0;
    k--;

    //1 과 2는 사용중이고 3은 이미 넣어봤으므로 4를 넣는다. -> 순서대로
    for (int j=0;j<n;j++) { //1~N중에 탐색
      if (issued[j] == 1) continue; //1과 2는 1이므로 pass
      v[i] = j+1;
      issued[j] = 1;
      k++; //재귀로
      break;
    }
    // issued[4]가 1이됨 
    //issued의 index+1이 arr에들어가는것.

    //1,2는 사용중 3,4는 이미 넣어봤으므로 한칸 더 뒤로
    k-=2;
    //두번째index에 1사용중, 2는 넣어봤으므로 3넣기

  }

  return 0;
}
