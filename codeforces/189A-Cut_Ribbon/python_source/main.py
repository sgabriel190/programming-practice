def read_ints(): return list(map(int, input().split()))


if __name__ == "__main__":
    n, a, b, c = read_ints()
    tmp = [0 for _ in range(n+1)]
    if a <= n:
        tmp[a] = 1
    if b <= n:
        tmp[b] = 1
    if c <= n:
        tmp[c] = 1
    for i in range(1, n+1):
        if i >= a and tmp[i - a] != 0:
            tmp[i] = max(tmp[i], 1 + tmp[i - a])
        if i >= b and tmp[i - b] != 0:
            tmp[i] = max(tmp[i], 1 + tmp[i - b])
        if i >= c and tmp[i - c] != 0:
            tmp[i] = max(tmp[i], 1 + tmp[i - c])
    print(tmp[n])

