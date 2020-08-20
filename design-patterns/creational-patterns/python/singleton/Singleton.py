class Singleton:
    __instance = None

    def __new__(cls, val):
        if cls.__instance is None:
            cls.__instance = object.__new__(cls)
        cls.__instance.val = val
        return cls.__instance
