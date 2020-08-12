def read_input():
    number_of_days = int(input())
    sequence_input = [int(elem) for elem in input().split(" ")]
    return number_of_days, sequence_input


def check_max_value(value1, value2):
    return value1 if value1 > value2 else value2


if __name__ == "__main__":
    days, sequence = read_input()
    counter = 1
    max_counter = 1
    for index, element in enumerate(sequence):
        if index == 0:
            continue
        else:
            if element >= sequence[index-1]:
                counter += 1
            else:
                max_counter = check_max_value(counter, max_counter)
                counter = 1
    max_counter = check_max_value(counter, max_counter)
    print(max_counter)
