# 스택
#01.
import sys
n = int(input())
a = []
# for _ in range(n):
#   cmd = input().split()
#   if cmd[0] == "push"

for line in sys.stdin:
  x = line.strip().split() 
  if "push" in x:
    a.append(int(x[1]))
  elif "pop" in x:
    if len(a) == 0: 
      print(-1)
    else:
      print(a.pop(len(a)-1))
  elif "size" in x:
    print(len(a))
  elif "empty" in x:
    if len(a) == 0: 
      print(1)
    else:
      print(0)
  elif "top" in x:
    if len(a) == 0:
      print(-1)
    else:
      # print(a[len(a)-1])
      print(a[-1])


#02. class / 함수형으로
class Stack(list):
  def __init__(self):
    self.stack = []

  def push(self, data):
    self.stack.append(data)
  
  def pop(self):
    if self.is_empty():   #활용
      return -1
    return self.stack.pop()

  def peek(self): #top
    if self.is_empty():  
      return -1
    return self.stack[-1]
  
  def is_empty(self):
    # if len(self.stack) == 0:
    #   return 1
    # return 0

    # return 1 if self.size() else 0 
    return not self.stack

  def size(self):
    return len(self.stack)

stk = Stack()  

#03.
def push(n):
  a.append(n)
def pop():
  try:
    print(a.pop())
  except:
    print(-1)
def size():
  return len(a)
def empty():
  a = 1 if size()==0 else 0
  print(a)
def top():
  try:
    print(a[-1])
  except:
    print(-1)
  