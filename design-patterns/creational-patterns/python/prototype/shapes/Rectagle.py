import copy

from shapes.Shape import Shape


class Rectangle(Shape):

    def __init__(self, width, height, x, y, color):
        super().__init__(x, y, color)
        self.width = width
        self.height = height

    def clone(self):
        return copy.copy(self)
