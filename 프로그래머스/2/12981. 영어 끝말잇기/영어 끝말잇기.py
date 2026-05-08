def solution(n, words):
    answer = []
    dict ={}
    number =0
    dict[words[0]] ="0"
    for i in range(1,len(words)):
        number = i%n + 1        
        if words[i][0] != words[i-1][-1] or dict.get(words[i]) is not None:
            answer.append(number)
            answer.append(i//n+1)
            break
        dict[words[i]] = "0"
        
        
    if len(answer) ==0:
        answer =[0,0]
                
    return answer

