def solution(s):
    sort = sorted(s, reverse = True)
    answer = ''.join(sort)
    return answer