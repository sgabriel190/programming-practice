from typing import List


def read_ints() -> List[int]: return list(map(int, input().split()))


if __name__ == "__main__":
    _, length = read_ints()
    lanterns_position = sorted(read_ints())
    lanterns_position[0] /= 1
    max_d = lanterns_position[0]
    for index in range(len(lanterns_position) - 1):
        max_d = max(max_d, (lanterns_position[index + 1] - lanterns_position[index])/2)
    max_d = max(max_d, length - lanterns_position.pop())
    print("{:.10f}".format(max_d))
