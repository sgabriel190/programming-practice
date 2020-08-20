import abc


class Shape(metaclass=abc.ABCMeta):

    def __init__(self, x, y, color):
        self.X = int(x)
        self.Y = int(y)
        self.color = str(color)

    def __int__(self, shape):
        self.__dict__ = shape.__dict__

    @abc.abstractmethod
    def clone(self):
        pass
