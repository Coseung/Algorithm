def solution(sizes):
    answer = 0
    maxX =0
    maxY =0
    for i in sizes:
        i.sort()
        
    for j in sizes:
        if j[0] > maxX:
            maxX = j[0]
        if j[1] > maxY:
            maxY = j[1]
    answer = maxX * maxY
    return answer