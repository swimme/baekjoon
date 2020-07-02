#여러개의 매개변수 (가변인수함수)
# *붙이기

def add_many(*args):
  result = 0
  for i in args:
    result = result+i
  return result

# *리스트/ *튜플 == 언패킹 

# 키워드 파라미터 
# 매개변수가 딕셔너리가됨 : **붙이기
def print_kwargs(**kwargs):
  print(kwargs)

print_kwargs(a=1) #{'a':1}
print_kwargs(name='foo', age=3) #{'age':3, 'name':'foo'}


# 하나의 결과값
def add_and_mul(a,b): 
  return a+b, a*b
  # 튜플로 return됨 (a+b, a*b)