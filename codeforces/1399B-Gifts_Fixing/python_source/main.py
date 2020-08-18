from functools import reduce


def read_int():
    return int(input())


def read_int_list():
    return list(map(int, input().split(" ")))


def transform_function(elem):
    return max(elem[1], elem[0])


def solve():
    for _ in range(read_int()):
        _ = read_int()

        candies_list = read_int_list()
        oranges_list = read_int_list()

        candies_list = list(map(lambda a, b=min(candies_list): a - b, candies_list))
        oranges_list = list(map(lambda a, b=min(oranges_list): a - b, oranges_list))

        result = reduce(lambda a, b: a + b, list(map(transform_function, list(zip(candies_list, oranges_list)))))

        print(result)


if __name__ == "__main__":
    solve()
