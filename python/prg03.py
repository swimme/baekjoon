# # 124나라 - 미완
# # 1,2,4로 수표현 (4==3)

# # 4 = 11 = 1*3(자리수)+1*1
# # 5 = 12 = 1*3 + 2*1
# # 6 = 14 = 1*3 + 3*1

# # 7 = 21 = 2*3 + 1*1
# # 8 = 22 = 2*3 + 2*1
# # 9 = 24 = 2*3 + 3*1 : 

# # 10 = 41 = 3*3 +1*1
# # 11 = 42 = 3*3 + 1*2
# # 12 = 44 = 3*3 + 1*4

# # 13 = 111 = 9*1 + 3*1 + 1*1
# # 14 = 112 = 9*1 + 3*1 + 2*1
# #  
# # 3진법?
# # n = 3
# # left = []
# # # print(str(left))

# n = 3
# left=[]
# while n > 0:
#   n-=1
#   left.append(str(n%3))
#   n = n//3

# left.reverse()
# s = "".join(left).replace("2","4").replace("1","2").replace("0","1")
# print(s)


# 1,2,3
# 0이 없기 때문에 1의자리부터 무조건 1이상 채워야 한다. 
# (n=10일 때, 
# 일반적인 3진법이라면 101(= 3^2*1 + 3^1*0 + 3^0*1) 이지만, 
# 이 경우에는 31(= 3^1*3 + 3^0*1))
