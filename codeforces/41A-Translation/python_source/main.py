def read_input():
    return [input(), input()]


def resolve(list_arg):
    return "YES" if list_arg[0] == list_arg[1][::-1] else "NO"


if __name__ == "__main__":
    input_list = read_input()
    print(resolve(input_list))
