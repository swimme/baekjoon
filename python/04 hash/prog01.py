# 프로그래머스 - 완주하지 못한 선수

# 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
# input: 마라톤에 참여한 선수들의 이름이 담긴: 문자열 배열 participant
#         완주한 선수들의 이름이 담긴: 문자열 배열 completion
# output: 완주하지 못한 선수의 이름:  문자열

# 조건: 선수의 수는 1명 이상 100,000명 이하입니다.
#      completion길이 = participant길이 - 1 
#      참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자
#    *** 참가자 중에는 동명이인이 있을 수 있습니다 ***

participant = ["mislav", "stanko", "mislav", "ana"]	
completion = ["ana", "mislav", "mislav"]	

# 리스트
def solution(participant, completion): 
  participant.sort() 
  completion.sort()
  for i in range(len(completion)): 
    if participant[i] != completion[i]:
      return participant[i] 
  return participant[i+1] #가장 마지막 sorted 선수가 답인 경우

# 라이브러리 없이 리스트를 딕셔너리로 변환
def solution2(participant, completion):
    dic = {par: 0 for par in participant}
    
    for par in participant:
      dic[par] += 1
    for com in completion:
      dic[com] -= 1
    for key in dic:
      if dic[key] > 0:
        return key



### 다른 풀이
# 3. zip이용 - 리스트로 푼 것과 같은 맥락
def solution3(participant, completion): 
    participant.sort()
    completion.sort()
    for par, com in zip(participant, completion) : #zip은 동일한 개수로 이루어진 자료형을 묶어 주는 역할
        if par != com :
            return par             # case 동명이인이 답인 경우
    return participant[-1]  # case 가장 마지막 sorted 선수가 답인 경우
# cf. dict(zip(l1,l2)) 가능
    
# 4. hash 값을 이용한 방법
def solution4(participant, completion):
    answer = ''
    temp = 0
    dic = {}
    for part in participant:
        dic[hash(part)] = part #{has(item): item로 사용
        temp += int(hash(part))
    for com in completion:
        temp -= hash(com)
    answer = dic[temp]
    return answer
# temp라는 변수에 hash값들을 더해준다.
# 그리고 완주자들의 이름을 for문을 돌리면서 완주자들의 이름의 해시값들을 temp에서 빼준다. 
# 이렇게 되면 temp는 오직 하나의 이름에 대한 해시값을 갖게 된다.  
# 완주하지 못한 선수가 한명이라 가능한 방법


# 5. collections라이브러리 사용: Counter
import collections
def solution5(participant, completion):
    # print(collections.Counter(participant))
    # print(collections.Counter(completion))
    answer = collections.Counter(participant) - collections.Counter(completion)
    return list(answer.keys())[0]
# Counter는 hash형 자료들의 값의 개수를 셀때 사용
# 딕셔너리처럼 {'자료 이름' : '개수'} 형식으로 만들어진다
# Counter객체끼리 뺄셈가능



