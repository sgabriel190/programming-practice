from Graphic import Graphic
from typing import List


class CompoundGraphic(Graphic):

    __children: List[Graphic] = None

    def __init__(self):
        self.__children = []

    def add(self, child):
        self.__children.append(child)

    def remove(self, child):
        self.__children.remove(child)

    def move(self, x, y):
        for elem in self.__children:
            elem.move(x, y)

    def draw(self):
        for elem in self.__children:
            elem.draw()
