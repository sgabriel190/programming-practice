from Singleton import Singleton

if __name__ == "__main__":
    obj1 = Singleton("singleton1")
    print(obj1, obj1.val)
    obj2 = Singleton("singleton2")
    print(obj2, obj2.val)
