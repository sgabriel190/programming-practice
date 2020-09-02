def readInts(): return set(map(int, input().split()))


if __name__ == "__main__":
    values = readInts()
    print(4 - len(values))
