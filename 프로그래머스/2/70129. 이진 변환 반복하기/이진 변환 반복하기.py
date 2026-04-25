def solution(s): 
    count_transform = 0  
    count_zeros = 0
    while s!="1":
        count_transform +=1
        zeros_in_this_step = s.count("0")
        count_zeros += zeros_in_this_step
        length =  len(s) - zeros_in_this_step
        s = format(length,'b')
    answer = [count_transform,count_zeros]
    
    return answer

