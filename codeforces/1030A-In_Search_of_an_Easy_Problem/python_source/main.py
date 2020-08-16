from functools import reduce


def read_int_list():
    return list(map(int, input().split(" ")))


if __name__ == "__main__":
    _ = input()
    input_list = read_int_list()
    print("EASY" if reduce(lambda x, y: x + y, input_list) == 0 else "HARD")
