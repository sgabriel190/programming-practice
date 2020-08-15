from collections import Counter


def read_int():
    return int(input())


def read_int_list():
    return list(map(int, input().split(" ")))


def resolve():
    for _ in range(read_int()):
        _ = read_int()
        participants_weight_list = sorted(read_int_list(), reverse=False)
        result = [0]*101
        frequency = Counter(participants_weight_list)
        for index1 in frequency:
            for index2 in frequency:
                result[index1+index2] += min(frequency[index1], frequency[index2])
        print(max(result) // 2)


if __name__ == "__main__":
    resolve()
