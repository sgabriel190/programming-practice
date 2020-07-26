def read_input():
    return input()


def resolve(word):
    lowercase_counter = 0
    uppercase_counter = 0
    for character in word:
        if character.isupper():
            uppercase_counter += 1
        else:
            lowercase_counter += 1
    if uppercase_counter > lowercase_counter:
        return word.upper()
    else:
        return word.lower()


if __name__ == "__main__":
    word_string = read_input()
    print(resolve(word_string))
