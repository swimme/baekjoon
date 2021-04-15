# 두 단어 A와 B가 주어졌을 때, 
# A에 속하는 알파벳의 순서를 바꾸어서 B를 만들 수 있다면, 
# //// ===알파벳의 개수와 종류 모두 같다면! ////
# A와 B를 애너그램이라고 한다.

# 두 단어가 애너그램인지 아닌지 구하는 프로그램을 작성하시오.

# 입력 
# 첫째 줄에 테스트 케이스의 개수(<100)가 주어진다. 

# 각 테스트 케이스는 한 줄로 이루어져 있고, 
# 길이가 100을 넘지 않는 단어가 공백으로 구분되어서 주어진다. 
# 단어는 알파벳 소문자로만 이루어져 있다.

# 3
# blather reblath
# maryland landam
# bizarre brazier

# 출력
# blather & reblath are anagrams.
# maryland & landam are NOT anagrams.
# bizarre & brazier are anagrams.

# //// 알파벳의 개수와 종류 모두 같다면 애너그램 ////
import sys
n = int(input())
arr = []
# words = []

# def compare(word1, word2):
#   if len(word1) != len(word2):
#     return "NOT "

#   for j in range(len(word1)):
#     if word2.count(word1[j]) != word1.count(word1[j]):
#       return "NOT "
#   return ""

for i in range(n):
  a, b = sys.stdin.readline().split()
  char_a = sorted(a)
  char_b = sorted(b)

  if (char_a == char_b):
    print("%s & %s are anagrams." % (a, b))
  else:
    print("%s & %s are NOT anagrams." % (a, b))

  # words.append(sys.stdin.readline().split())
  # arr.append(compare(words[i][0], words[i][1]))

# for i in range(n): 
#   print("%s & %s are %sanagrams." % (words[i][0], words[i][1], arr[i]))


# print(arr)

  # I eat %d apples." % 3