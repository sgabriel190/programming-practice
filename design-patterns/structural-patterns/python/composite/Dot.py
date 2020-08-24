from Graphic import Graphic


class Dot(Graphic):
    _x = None
    _y = None

    def __init__(self, x, y):
        self._x = x
        self._y = y

    def move(self, x, y):
        self._x += x
        self._y += y

    def draw(self):
        print("Message from {}. Draw dot at x:{} y:{}".format(self.__module__, self._x, self._y))
