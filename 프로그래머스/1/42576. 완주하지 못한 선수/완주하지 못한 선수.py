def solution(participant, completion):
    answer = ''
    dict ={}
    for i in participant:
        if dict.get(f"{i}") ==None:
            dict[f"{i}"] = 1
        else:
            dict[f"{i}"] +=1
    for j in completion:
        if dict[f"{j}"] ==1:
            del dict[f"{j}"]
        else:
            dict[f"{j}"] -=1
        
        
    for key in dict:
        answer =key
    
    return answer