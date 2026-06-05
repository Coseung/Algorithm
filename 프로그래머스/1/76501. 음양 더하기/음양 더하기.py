def solution(absolutes, signs):
    answer = 0
    for index, value in enumerate(signs):
        if value==True:
            continue
        else:
            absolutes[index] *= -1
    
    for i in absolutes:
        answer +=i
    
    return answer