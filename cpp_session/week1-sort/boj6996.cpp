/*
두 단어 A와 B가 주어졌을 때, 
A에 속하는 알파벳의 순서를 바꾸어서 B를 만들 수 있다면, 
//// ===알파벳의 개수와 종류 모두 같다면! ////
A와 B를 애너그램이라고 한다.

두 단어가 애너그램인지 아닌지 구하는 프로그램을 작성하시오.

입력 
첫째 줄에 테스트 케이스의 개수(<100)가 주어진다. 

각 테스트 케이스는 한 줄로 이루어져 있고, 
길이가 100을 넘지 않는 단어가 공백으로 구분되어서 주어진다. 
단어는 알파벳 소문자로만 이루어져 있다.

3
blather reblath
maryland landam
bizarre brazier

출력
blather & reblath are anagrams.
maryland & landam are NOT anagrams.
bizarre & brazier are anagrams.
*/


//// 알파벳의 개수와 종류 모두 같다면 애너그램 or  sort 함수!!! ////

#include <bits/stdc++.h>
using namespace std;
int ac[128], bc[128];

string compare(pair<string, string> p)
{
  if (p.first.size() != p.second.size()) {
    return "NOT ";
  }

  for (int i = 0; i < p.first.size(); i++) {
    ac[p.first[i]]++;
    bc[p.second[i]]++; 
  } 
  
  for (int i = 0; i < p.first.size(); i++) { 
    if (ac[p.first[i]] != bc[p.first[i]]) {
      return "NOT ";
    }
  }

  return "";
}

// int main(void){
//   ios_base::sync_with_stdio(false);
//   cin.tie(nullptr);

//   freopen("input.txt", "r", stdin); 

//   int N;
//   cin >> N;

//   for (int i = 0; i < N; i++){
//     pair<string, string> p;
//     string is_anagram;
    
//     cin >> p.first >> p.second;
//     is_anagram = compare(p);

//     cout << p.first << " & " << p.second << " are " << is_anagram << "anagrams.\n"; 
//   }

//   return 0;
// }


/* sort 사용 !!!! */

string sort(string word) {
  for (int i = 0; i < word.length()-1; i++) { 
    for ( int j = 0 ; j < word.length() ; j ++ ){
      char tmp = word[j];
      if ( word[j] < word[j+1] ){
        word[j] = word[j+1];
        word[j+1] = tmp;
      }
    }
  }
  return word;
} 

int main(){
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);

  freopen("input.txt", "r", stdin); 

  int n; 
  cin >> n; 

  for (int i = 0; i < n; i++) {
    string a, b;    
    cin >> a >> b;

    if (a.size() != b.size()){
      cout << a << " & " << b << " are NOT anagrams.\n";
      continue;
    }

    string sorted_a = sort(a);
    string sorted_b = sort(b);

    if (sorted_a == sorted_b){
      cout << a << " & " << b << " are anagrams.\n"; 
    } else{
      cout << a << " & " << b << " are NOT anagrams.\n"; 
    }
  }
  return 0;
}
