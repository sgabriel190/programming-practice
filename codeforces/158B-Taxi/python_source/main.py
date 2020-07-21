import collections


def read_input():
    number_of_groups = int(input())
    groups = list(map(int, input().split(" ", maxsplit=number_of_groups)))
    return number_of_groups, groups


# method 2-> OK
def max_taxi_number2(sequence):
    """
    This method is an implementation based on the pairs of numbers summed together to obtain an minimum number of
    groups which summed up are equal to 4.
    Its time complexity is O(1) because it doesn't contain any loop.
    It uses the Counter class to count the elements from the sequence
    :param sequence: the sequence of groups
    :return: the total number of taxis needed to transport the groups(one taxi can take up to 4 people)
    """
    total_taxis = 0
    counter = collections.Counter(sequence)

    # Check the value 4 because it can't pair with anything
    total_taxis += counter[4]
    counter[4] = 0

    # Check if there are pairs of value 1 and 3
    if counter[1] > 0 and counter[3] > 0:
        minim = min(counter[1], counter[3])
        total_taxis += minim
        counter[1] -= minim
        counter[3] -= minim
    if counter[3] is not 0:
        total_taxis += counter[3]
        counter[3] = 0

    # Check the pairs of 2
    if counter[2] > 1:
        total_taxis += int(counter[2] / 2)
        counter[2] = int(counter[2] % 2)

    # Check the 2 and 1 pairs: the result will be added in counter[3]
    if counter[2] > 0 and counter[1] > 0:
        minim = min(counter[1], counter[2])
        counter[3] += minim
        counter[2] -= minim
        counter[1] -= minim
    if counter[2] is not 0:
        total_taxis += counter[2]
        counter[2] = 0

    # Check again the pairs of 3 and 1 created from pairs of 2 and 1
    if counter[1] > 0 and counter[3] > 0:
        minim = min(counter[1], counter[3])
        total_taxis += minim
        counter[1] -= minim
        counter[3] -= minim
    if counter[3] is not 0:
        total_taxis += counter[3]
        counter[3] = 0

    # Check the pairs of 1
    if counter[1] > 0:
        total_taxis += int(counter[1] / 4)
        if counter[1] % 4 is not 0:
            total_taxis += 1
        counter[1] = 0

    return total_taxis


# method 1-> Time exceeded
def max_taxi_number(n, sequence):
    """
    This method is time consuming because its time complexity can get very big for a big sequence of pairs.
    Its time complexity is O(n*p) where n=number of pairs and p = number of tries to sum number to 4
    :param n: number of groups in sequence
    :param sequence: the sequence of groups
    :return: the total number of taxis needed to transport the groups(one taxi can take up to 4 people)
    """
    total_taxis = 0
    sequence.sort()
    while n != 0:
        taxi = 0
        if 1 in sequence and 3 in sequence:
            sequence.remove(1)
            sequence.remove(3)
            n -= 2
        else:
            while taxi < 4 and n != 0:
                if taxi + sequence[0] > 4:
                    break
                else:
                    taxi += sequence[0]
                    sequence.pop(0)
                    n -= 1
        total_taxis += 1
    return total_taxis


if __name__ == "__main__":
    groups_number, sequence_groups = read_input()
    print(max_taxi_number2(sequence_groups))
