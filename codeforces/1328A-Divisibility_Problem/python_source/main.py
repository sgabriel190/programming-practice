def readInput():
    aux = []
    for _ in range(int(input())):
        aux.append(list(map(int, input().split())))
    return aux


if __name__ == "__main__":
    values = readInput()
    values = list(map(lambda elem: elem[1] - (elem[0] % elem[1]) if elem[0] % elem[1] != 0 else elem[0] % elem[1]
                      , values))
    print("\n".join(str(elem) for elem in values))
