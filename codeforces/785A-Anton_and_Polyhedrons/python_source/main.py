from functools import reduce

polyhedrons = {
    "Tetrahedron": 4,
    "Cube": 6,
    "Octahedron": 8,
    "Dodecahedron": 12,
    "Icosahedron": 20
}


def readInput():
    return [input() for _ in range(int(input()))]


if __name__ == "__main__":
    valueResult = reduce(lambda a, b: a + b, list(map(lambda x: polyhedrons[x], readInput())))
    print(valueResult)
