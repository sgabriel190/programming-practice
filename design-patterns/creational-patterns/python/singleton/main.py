from Singleton import Singleton
"""
    SINGLETON PATTERN
    -> Is a creational design pattern that lets you ensure that a class has only one instance,
    while providing a global access point to this instance.
    -> Use the Singleton pattern when a class in your program should have just a single instance available
    to all clients; for example, a single database object shared by different parts of the program.
    -> Use the Singleton pattern when tou need stricter control over global variables.
"""
if __name__ == "__main__":
    obj1 = Singleton()
    obj1.print()
    obj2 = Singleton()
    obj2.print()
