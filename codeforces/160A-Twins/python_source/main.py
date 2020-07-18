"""
Imagine that you have a twin brother or sister. Having another person that looks exactly like you seems very unusual.
It's hard to say if having something of an alter ego is good or bad. And if you do have a twin, then you very well
know what it's like.

Now let's imagine a typical morning in your family. You haven't woken up yet, and Mom is already going to work.
She has been so hasty that she has nearly forgotten to leave the two of her darling children some money to buy lunches
in the school cafeteria. She fished in the purse and found some number of coins, or to be exact, n coins of arbitrary
values a 1, a 2, ..., a n. But as Mom was running out of time, she didn't split the coins for you two.
So she scribbled a note asking you to split the money equally.

As you woke up, you found Mom's coins and read her note. "But why split the money equally?" — you thought. After all,
your twin is sleeping and he won't know anything. So you decided to act like that: pick for yourself some subset of
coins so that the sum of values of your coins is strictly larger than the sum of values of the remaining coins that
your twin will have. However, you correctly thought that if you take too many coins, the twin will suspect the deception.
So, you've decided to stick to the following strategy to avoid suspicions: you take the minimum number of coins, whose
sum of values is strictly more than the sum of values of the remaining coins. On this basis, determine what minimum
number of coins you need to take to divide them in the described manner.

Input
The first line contains integer n (1 ≤ n ≤ 100) — the number of coins. The second line contains a sequence of n
integers a 1, a 2, ..., a n (1 ≤ a i ≤ 100) — the coins' values. All numbers are separated with spaces.

Output
In the single line print the single number — the minimum needed number of coins.
"""


def read_inputs():
    number_of_coins = int(input())
    list_of_values = [int(value) for value in input().split(" ")]
    list_of_values.sort(reverse=True)
    return number_of_coins, list_of_values


def obtain_min_coins(number_coins, list_coins):
    max_sum = 0
    while len(list_coins) != 0:
        max_sum += list_coins[0]
        list_coins.remove(list_coins[0])
        if max_sum > sum(list_coins):
            break
    return number_coins - len(list_coins)


if __name__ == "__main__":
    (coins_number, value_list) = read_inputs()
    print(obtain_min_coins(coins_number, value_list))
