def read_int(): return int(input())
def read_ints(): return list(map(int, input().split(" ")))


if __name__ == "__main__":
    for _ in range(read_int()):
        input_list = read_ints()
        values = list(map(lambda x: x & 1, input_list))
        if sum(values) == 0 or sum(values) == 1:
            print("Yes")
            continue
        if min(input_list[:3]).__ge__(1):
            print("No") if (sum(values[:3]).__eq__(1) and sum(values[3:]).__eq__(1)) \
                           or (sum(values[:3]).__eq__(2) and sum(values[3:]).__eq__(0)) else print("Yes")
        else:
            print("No")
