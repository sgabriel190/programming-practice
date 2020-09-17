if __name__ == "__main__":
    for _ in range(int(input())):
        candies = int(input())
        if candies < 3:
            print(0)
        else:
            print(candies//2) if candies & 1 == 1 else print(candies//2 - 1)
