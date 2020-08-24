from Circle import Circle
from CompoundGraphic import CompoundGraphic
from Dot import Dot
"""
    COMPOSITE PATTERN
    ->Use the pattern when you want the client to treat both simple and complex elements uniformly.
    ->Use the Composite pattern when you have to implement a tree-like object structure.
    ->A Decorator is like a Composite but only has one child component. Decorator adds additional responsibilities
    to the wrapped object, while Composite just "sums up" it's children's result.
"""
if __name__ == "__main__":
    cg = CompoundGraphic()
    cg2 = CompoundGraphic()
    cg.add(Dot(1, 1))
    cg.add(Dot(22, 342))
    cg.add(Circle(1, 5, 20))
    cg2.add(Dot(2, 2))
    cg.add(cg2)

    cg.draw()
