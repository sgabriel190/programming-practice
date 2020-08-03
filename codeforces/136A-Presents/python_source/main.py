def read_input():
    n = int(input())
    friends_numbers = [[int(elem), index+1] for index, elem in enumerate(input().split(" "))]
    return n, friends_numbers


def resolve(order_list):
    order_list = sorted(order_list, key=lambda elem: elem[0])
    order_list = list(map(lambda elem: elem[1], order_list))
    print("".join("{} ".format(item) for item in order_list))


if __name__ == "__main__":
    number_of_friends, gifting_order = read_input()
    resolve(gifting_order)
