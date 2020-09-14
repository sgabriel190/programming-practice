def read_ints(): return list(map(int, input().split()))


if __name__ == "__main__":
    n, _ = read_ints()
    tasks = read_ints()
    accumulator = tasks[0] - 1
    for index in range(1, len(tasks)):
        if tasks[index - 1] > tasks[index]:
            accumulator += tasks[index] + (n - tasks[index - 1])
        else:
            accumulator += tasks[index] - tasks[index - 1]
    print(accumulator)

