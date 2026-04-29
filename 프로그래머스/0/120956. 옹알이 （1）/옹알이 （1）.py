def solution(babbling):
    answer = 0
    words=["aya", "ye", "woo", "ma"]
    
    for i in range(len(babbling)):
        for word in words:
            babbling[i] = babbling[i].replace(word, "0")
        babbling[i] = babbling[i].replace("0","")
    
    return babbling.count("")