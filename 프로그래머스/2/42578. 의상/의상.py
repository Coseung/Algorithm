def solution(clothes):
    answer = 1
    dict ={}
    for i in clothes:
        if dict.get(f"{i[1]}") ==None:
            dict[f"{i[1]}"] =1
        else: 
            dict[f"{i[1]}"] +=1
    
    for value in dict.values():
        answer *=(value+1)
        

    return answer -1