# 전화번호 목록
# 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인

# input: 전화번호를 담은 문자열 배열: phone_book
# output: 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false / 그렇지 않으면 true 
# 조건: 
  # phone_book의 길이는 1 이상 1,000,000 이하
  # 각 전화번호의 길이는 1 이상 20 이하

case1 = ["119", "97674223", "1195524421"]	 #false
case2 = ["123","456","781239"]	#true
case3 = ["12", "123", "1235", "567", "88"]  #false
case4 = ["123","456","789"]	#true


# 시간초과
def solution(phone_book):
    answer = True   # 초기화 없이 return 바로해주면 시간초과없이 통과는 함..
    phone_book.sort(key=len)
    for i in range(len(phone_book)):
      for j in range(i + 1, len(phone_book)):
        if phone_book[j].find(phone_book[i]) == 0:  #내장함수
        # prefix = phone_book[i]
        # if phone_book[j][:len(prefix)] == prefix:  #내장함수 없이
          answer = False
      
    return answer


# 효율성 풀이
# *** sort -> "가장 비슷한 순서대로 정렬되므로" 가장 비슷한 것만 비교하면됨****
# 하나라도 맞으면 True이기 때문에
def solution3(phoneBook):
    answer = True
    phoneBook = sorted(phoneBook)
    for p1, p2 in zip(phoneBook, phoneBook[1:]):
        if p2.startswith(p1):
            answer = False
        
    return answer
# print(list(zip(phoneBook, phoneBook[1:])))
# #[('12', '123'), ('123', '1235'), ('1235', '567'), ('567', '88')]


# 같은 맥락 zip없이 해봄
def solution4(phone_book):
    answer = True
    phone_book = sorted(phone_book)

    for i in range(0, len(phone_book) - 1):
        if phone_book[i + 1].startswith(phone_book[i]):
            answer = False

    return answer


# 역으로 쪼개서 검사
def solution5(phone_book):
    answer = True
    # dic ={} 
    # for pNumber in phone_book:
    #     dic[pNumber] = 1  #key:폰번호 value:1
    # 굳이 할 필요없다고 생각
        
    for pNumber in phone_book:
        temp=""
        for num in pNumber: #폰번호를 한글자로 쪼개서 반복문 "243"이면 "2" "4" "3"
            temp +=num #쪼갠 숫자를 반복문이 돌아갈 때마다 붙음  "2", "24", "243"
            if temp in phone_book and temp!= pNumber: # 존재하는지 검사
                answer = False
    return answer

