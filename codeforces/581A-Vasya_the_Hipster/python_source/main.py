def read_ints(): return list(map(int, input().split()))


if __name__ == "__main__":
    a, b = read_ints()
    differentSocks = min(a, b)
    sameSocks = (max(a, b) - differentSocks) // 2
    print("{} {}".format(differentSocks, sameSocks))
