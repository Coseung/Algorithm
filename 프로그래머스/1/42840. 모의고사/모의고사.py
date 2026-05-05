def solution(answers):
    first_supo = [1, 2, 3, 4, 5]
    second_supo =[2, 1, 2, 3, 2, 4, 2, 5]
    th_supo = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    plus =0
    count ={1:0,2:0,3:0}
    for i in answers:
        if first_supo[plus % 5] == i:
            count[1] +=1
        if second_supo[plus % 8] ==i:
            count[2] +=1
        if th_supo[plus % 10] == i:
            count[3] +=1
        plus+=1

    max_val = max(count.values())

    answer = [k for k, v in count.items() if v == max_val]
    return answer