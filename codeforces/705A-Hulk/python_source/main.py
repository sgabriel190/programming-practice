def read_int(): return int(input())


def solve():
    choice_dict = {
        0: "I love ",
        1: "I hate "
    }
    answer = ""
    layer = read_int()
    for index in range(1, layer + 1):
        answer += choice_dict[index % 2].__add__("it" if index == layer else "that ")
    print(answer)


if __name__ == "__main__":
    solve()
