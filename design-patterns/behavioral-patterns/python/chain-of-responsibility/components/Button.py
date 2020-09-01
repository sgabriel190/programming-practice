from components.Component import Component


class Button(Component):
    __x: int = None
    __y: int = None
    __w: int = None
    __h: int = None

    def __init__(self, w: int, h: int, x: int, y: int):
        super().__init__()
        self.__x = x
        self.__y = y
        self.__w = w
        self.__h = h
