import itertools

# product()
# 중첩된 for loop에 해당하는 데카르트의 곱 tuple
# AA AB AC AD BA BB BC BD CA CB CC CD DA DB DC DD
for item in itertools.product(["A","B","C","D"], repeat=2):
  print(item)

# permutations()
# 길이 r tuple, 가능한 모든 순서, 서로 다른 수 조합 
# AB AC AD BA BC BD CA CB CD DA DB DC
itertools.permutations('ABCD', 2)

# combinations()
# 길이 r tuple, 정렬된 순서, 서로 다른 수 조합 
# AB AC AD BC BD CD
itertools.combinations("ABCD", 2)

# combinations_with_replacement() 
# 길이 r tuple, 정렬된 순서, 같은 수 조합 ㅇ
# AA AB AC AD BB BC BD CC CD DD
itertools.combinations_with_replacement('ABCD', 2)

