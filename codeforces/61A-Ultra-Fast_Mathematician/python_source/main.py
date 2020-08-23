def read_binary():
    number_string = input()
    return int(number_string, 2), len(number_string)


if __name__ == "__main__":
    a, n = read_binary()
    b, _ = read_binary()
    result = bin(a ^ b)[2:]
    print(result if len(result) == n else "{}{}".format("0" * (n - len(result)), result))
