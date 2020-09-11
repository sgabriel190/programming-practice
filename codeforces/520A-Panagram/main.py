def read_int(): return int(input())


if __name__ == "__main__":
    _ = read_int()
    string_input = input()
    result = set(map(lambda char: char.lower(), string_input))
    print("YES") if len(result) == 26 else print("NO")
