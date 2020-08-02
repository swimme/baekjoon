#01.
ans = False
n = ["봄","여울","봄봄"]  

n.sort(key=len, reverse= True)
print(n)
s = ""
for i in n:
  if i in s:
    ans = True
  s += ","+i

print(n)
print(s)
print(ans)
######02.
# base 합집합 other (중복제거)
# A = [1,2,3,4,3,5]
# B= [1,2,3]

# def sum(base,other):
#   new = toSet(base + other)
#   return new

# def toSet(arr):
#   new = []
#   for i in arr:
#     if i not in new:
#       new.append(i)
#   return new

# def comp(base,other):
#   new = [i for i in base if i not in other]
#   return new

# def inter(base, other):
#   # new = [i for i in base if i in other]
#   new = [i for i in base if other.count(i)]
#   for i in base:
#     print(i,"base")
#     if i in other:
#       print(i,"other")
#   return new

# def sol(a,b):
#   a = toSet(a)
#   b = toSet(b)
#   ans = [len(a), len(b), len(sum(a,b)), len(comp(a,b)), len(inter(a,b))]
#   return ans

# print(sol(A,B))

