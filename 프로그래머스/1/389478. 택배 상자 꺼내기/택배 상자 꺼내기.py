def solution(n, w, num):
    def get_pos(k, w):
        row = (k - 1) // w
        col = (k - 1) % w
        if row % 2 == 1:
            col = (w - 1) - col
        return row, col
    target_row, target_col = get_pos(num, w)
    max_row, _ = get_pos(n, w)  
    count = 0
    for r in range(target_row, max_row + 1):
        if r % 2 == 0:
            curr_num = (r * w) + target_col + 1
        else:
            curr_num = (r * w) + (w - 1 - target_col) + 1        
        if curr_num <= n:
            count += 1      
    return count