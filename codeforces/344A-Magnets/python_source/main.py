def read_input():
    number_magnets_input = int(input())
    list_input = []
    counter = 0
    while number_magnets_input > 0:
        value = 1 if input() == "10" else 0
        if len(list_input) == 0:
            list_input.append(value)
        if value != list_input[len(list_input)-1]:
            counter += 1
            list_input.append(value)
        number_magnets_input -= 1
    return counter + 1


if __name__ == "__main__":
    print(read_input())
