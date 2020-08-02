#include <iostream>
#include <string>
using namespace std;

void under(int k){ for(int i = 0; i < k; i++) cout << "____"; }

void recur(int k, int cnt) {
  string s1 = "\"재귀함수가 뭔가요?\"\n";
  string s2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
  string s3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
  string s4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
  string s5 = "라고 답변하였지.\n";
  
  under(cnt); cout << s1;
  under(cnt); cout << s2;
  under(cnt); cout << s3;
  under(cnt); cout << s4;

  cnt++;
  if (k==1){
    under(cnt); cout << s1;
    under(cnt); printf("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
    under(cnt); cout << s5;
    return;
  }

  recur(k-1,cnt);
  under(cnt); cout << s5;
  return;
}

int main(void) {
  int n;
  cin >> n;
  printf("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
  recur(n,0);

  string s5 = "라고 답변하였지.";
  cout << s5 << endl;
  //cout << recur() << endl;  
}