from functools import reduce


def read_ints():
    return [int(elem) for elem in input().split(" ")]


def read_input():
    number_friends_input, height_fence_input = read_ints()
    height_list_input = read_ints()
    return number_friends_input, height_fence_input, height_list_input


if __name__ == "__main__":
    number_of_friends, fence_height, height_list = read_input()
    print(reduce(lambda p1, p2: p1 + p2, list(map(lambda x: 1 if x.__le__(fence_height) else 2, height_list))))
