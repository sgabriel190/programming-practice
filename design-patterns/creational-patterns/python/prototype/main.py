from shapes.Circle import Circle
from shapes.Rectagle import Rectangle

"""
    PROTOTYPE PATTERN (Clone)
    -> Is a creational design pattern that lets you copy existing objects without making your code
    dependent on their classes.
    -> Use the Prototype pattern when your code shouldn't depend on the concrete classes of
    objects that you need to copy.
    -> Use the pattern when you want to reduce the number of subclasses that only differ in the way they initialize
    their respective objects. Somebody could have created these subclasses to be able to create objects with a specific
    configuration.
"""
if __name__ == "__main__":
    circle = Circle(10, 1, 1, "red")
    another_circle = circle.clone()
    print(circle.__dict__, another_circle.__dict__)

    rectangle = Rectangle(10, 10, 1, 1, "blue")
    another_rectangle = rectangle.clone()
    print(rectangle.__dict__, another_rectangle.__dict__)
