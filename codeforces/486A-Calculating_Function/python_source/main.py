def read_int(): return int(input())


def solve():
    n = read_int()
    return n // 2 if n & 1 == 0 else (n - 1) // 2 - n


if __name__ == "__main__":
    print(solve())
