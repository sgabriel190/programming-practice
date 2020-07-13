"""
Petya loves lucky numbers. Everybody knows that lucky numbers are positive integers whose decimal representation
contains only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.

Petya calls a number almost lucky if it could be evenly divided by some lucky number. Help him find out if the given
number n is almost lucky.

Input
The single line contains an integer n (1 ≤ n ≤ 1000) — the number that needs to be checked.

Output
In the only line print "YES" (without the quotes), if number n is almost lucky. Otherwise, print "NO" (without the quotes).
"""
import re

if __name__ == "__main__":
    inputedNumber = int(input())
    result = re.match("[4|7]*", str(inputedNumber))
    start, stop = result.span()
    if stop - start == len(str(inputedNumber)):
        print("YES")
        exit(0)
    for i in range(2, int(inputedNumber/2)+1):
        if inputedNumber % i == 0:
            result = re.match("[4|7]*", str(i))
            start, stop = result.span()
            if stop - start == len(str(i)):
                print("YES")
                exit(0)
    print("NO")
