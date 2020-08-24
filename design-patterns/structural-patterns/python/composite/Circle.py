from Dot import Dot


class Circle(Dot):

    __radius = None

    def __init__(self, x, y, radius):
        super().__init__(x, y)
        self.__radius = radius

    def draw(self):
        print("Message from {}. Draw circle at x:{}, y:{}, radius:{}".format(self.__module__, self._x, self._y,
                                                                             self.__radius))
