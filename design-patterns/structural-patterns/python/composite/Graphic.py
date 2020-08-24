import abc


class Graphic(metaclass=abc.ABCMeta):

    @abc.abstractmethod
    def move(self, x, y):
        pass

    @abc.abstractmethod
    def draw(self):
        pass
