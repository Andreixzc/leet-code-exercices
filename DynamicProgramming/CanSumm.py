def can_sum(target_sum, numbers, memo={}):
    if target_sum in memo:
        return memo[target_sum]

    if target_sum == 0:
        return True

    if target_sum < 0:
        return False

    for num in numbers:
        remainder = target_sum - num
        if can_sum(remainder, numbers, memo) == True:
            memo[target_sum] = True
            return True

    memo[target_sum] = False
    return False


can_sum(7, [2, 3], {})