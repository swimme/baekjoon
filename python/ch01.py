#1
#  1부터 n까지 연속한 숫자의 제곱의 합을 구하는 프로그램을 for 반복문으로 만들어 보세요(예를 들어 n = 10이라면 12 + 22 +32 + … + 102 = 385를 계산하는 프로그램입니다).
sum = 0
n = 10
for i in range(1,n+1):
  sum += i*i
print(sum)

#2
a = [ 17,92,18,33]
n = len(a)
max_v = a[0]
for i in range(1,n):
  if a[i]>max_v:
    max_v = a[i]

#3
name = ["Tom","Jerry","Tom"]
new = set()
for n in name:
  if n not in new and name.count(n) > 1: 
    # O(n)+O(n)
    new.add(n)

print(new)

#3-1
names = ["Tom","Jerry","Mike"]
for i in range(0,len(names)-1):
  for j in range(i+1,len(names)):
    print(names[i],names[j])

new = []
for n in names:
  new.append(n)
  if len(new) == 2:
    print(new)
    new.pop(-1)
  
  