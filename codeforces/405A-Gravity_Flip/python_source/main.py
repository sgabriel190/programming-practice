def read_int(): return int(input())
def read_ints(): return list(map(int, input().split()))


if __name__ == "__main__":
    _ = read_int()
    values = sorted(read_ints(), reverse=False)
    print("".join("{} ".format(elem) for elem in values).strip(" "))
