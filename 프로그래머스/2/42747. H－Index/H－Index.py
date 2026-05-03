def solution(citations):
    citations.sort(reverse=True)
    for i, cit in enumerate(citations):
        if cit < i + 1:
            return i
    return len(citations)