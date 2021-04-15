# 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
# 각각의 알파벳에 대해서, 
# 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
# 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

# 입력 : 단어 S
# 길이는 100이하 , 모두 소문자

# 출력 :
# 알파벳 a~z에 대해 처음 등장하는 인덱스나 -1을 출력
# 인덱스는 0부터 시작

import sys
word = sys.stdin.readline().strip()
letter = "abcdefghijklmnopqrstuvwxyz"
dic = dict.fromkeys(letter, -1)

# for i in range(len(word)):
#   if word[i] in letter and dic[word[i]] == -1 :
#     dic[word[i]] = i

for w in word:
  dic[w] = word.index(w)

val = dic.values()
print(' '.join(str(e) for e in val))


print(val)


# s = input()
# res = []
# for x in range(26):  # 아스키코드 사용 97~122
#   c = chr(ord('a') + x)
#   res.append(s.find(c))
# print(' '.join(str(x) for x in res))


#cpp
#include <iostream>
#include <string>
# using namespace std;
# int main() {
#   string word;
#   string letter = "abcdefghijklmnopqrstuvwxyz";
#   cin >> word;

#   for(int i = 0; i < letter.length(); i++)
#     cout << (int)word.find(letter[i]) << " ";
#   return 0;
# }