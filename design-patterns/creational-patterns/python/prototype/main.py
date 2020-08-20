from shapes.Circle import Circle
from shapes.Rectagle import Rectangle

if __name__ == "__main__":
    circle = Circle(10, 1, 1, "red")
    another_circle = circle.clone()
    print(circle.__dict__, another_circle.__dict__)

    rectangle = Rectangle(10, 10, 1, 1, "blue")
    another_rectangle = rectangle.clone()
    print(rectangle.__dict__, another_rectangle.__dict__)
