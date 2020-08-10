import sys
n = int(input())
cnt = 0

for _ in range(n):
  line = sys.stdin.readline().rstrip()
  stack = ['']
  # for i in range(len(line)):
  for word in line:
    # word = line[i]
    # if item != stack[len(stack)-1]:  
    if word != stack[-1]:
      stack.append(word)
    else: 
      stack.pop()
  if len(stack) == 1:
    cnt+=1

print(cnt)


#2. stack말고 다른 sol
import sys

n = int(input())

for i in range(n):
    word = sys.stdin.readline().strip()

    while word.count('AA') > 0 or word.count('BB') > 0:

        if word.count('AA') > 0:
            word = word.replace('AA', '')

        if word.count('BB') > 0:
            word = word.replace('BB', '')

    if word:
      n -= 1

print(n)


