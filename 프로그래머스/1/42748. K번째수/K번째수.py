def solution(array, commands):
    answer = []
    sort_array=[]
    count = 0
    for i in commands:
         sort_array = sorted(array[i[0]-1:i[1]])
         answer.append(sort_array[i[2]-1])
         count +=1
        
    return answer