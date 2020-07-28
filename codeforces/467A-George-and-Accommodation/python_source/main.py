from functools import reduce


def read_input():
    n = int(input())
    input_list = list()
    for index_loop in range(n):
        input_list.append([int(elem) for elem in input().split(" ")])
    return n, input_list


def resolve(capacity_list):
    count_possibilities = 0
    for dormitory in capacity_list:
        if reduce(lambda x, y: y-x, dormitory) >= 2:
            count_possibilities += 1
    return count_possibilities


if __name__ == "__main__":
    _, dormitory_capacity_list = read_input()
    print(resolve(dormitory_capacity_list))
