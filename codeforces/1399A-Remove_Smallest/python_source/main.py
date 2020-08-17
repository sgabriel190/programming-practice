def read_int():
    return int(input())


def read_int_list():
    return list(map(int, input().split(" ")))


if __name__ == "__main__":
    for _ in range(read_int()):
        _ = read_int()
        list_input = sorted(read_int_list(), reverse=False)
        index = 0
        answer = True
        while index < len(list_input) - 1:
            answer &= abs(list_input[index] - list_input[index + 1]) <= 1
            if not answer:
                break
            index += 1
        print("YES" if answer else "NO")
