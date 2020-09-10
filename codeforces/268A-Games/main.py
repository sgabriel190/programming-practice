import itertools


def read_ints(): return list(map(int, input().split()))


if __name__ == "__main__":
    team_colors_home = []
    team_colors_away = []
    for _ in range(int(input())):
        value = read_ints()
        team_colors_home.append(value[0])
        team_colors_away.append(value[1])
    result = list(filter(lambda elem: elem[0] == elem[1], list(itertools.product(team_colors_away, team_colors_home))))
    print(len(result))
