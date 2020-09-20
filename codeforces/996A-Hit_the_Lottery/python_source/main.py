def read_int() -> int: return int(input())


if __name__ == "__main__":
    value = read_int()
    dollar_bills = [1, 5, 10, 20, 100]
    result = 0
    idx_bill = 4
    while value != 0:
        if value >= dollar_bills[idx_bill]:
            result += value // dollar_bills[idx_bill]
            value = value % dollar_bills[idx_bill]
        else:
            idx_bill -= 1
    print(result)
