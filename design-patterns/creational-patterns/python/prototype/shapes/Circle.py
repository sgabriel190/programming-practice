import copy

from shapes.Shape import Shape


class Circle(Shape):
    def __init__(self, radius, x, y, color):
        super().__init__(x, y, color)
        self.radius = radius

    def clone(self):
        return copy.copy(self)
