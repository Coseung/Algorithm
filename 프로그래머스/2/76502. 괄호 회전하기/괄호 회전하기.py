def solution(s):
    pair = {')': '(', ']': '[', '}': '{'}

    def check(rotated):
        stack = []

        for ch in rotated:
            if ch in "([{":
                stack.append(ch)
            else:
                if not stack or stack.pop() != pair[ch]:
                    return False

        return not stack

    answer = 0

    for x in range(len(s)):
        rotated = s[x:] + s[:x]

        if check(rotated):
            answer += 1

    return answer