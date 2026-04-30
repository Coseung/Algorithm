def solution(s):
    answer = [-1]*len(s)
    dict = {}
    for i,k in enumerate(s):
        if dict.get(f"{k}") ==None:
            dict[f"{k}"] = i
        else:
            answer[i] = i - dict.get(f"{k}") 
            dict[f"{k}"] = i
            
    return answer
