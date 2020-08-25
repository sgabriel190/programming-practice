from builder.CarBuilder import CarBuilder
from builder.CarManualBuilder import CarManualBuilder
from director.Director import Director

"""
    BUILDER PATTERN
    -> Is a creational design pattern that lets you construct complex objects step by step. The pattern allows you
    to produce different types and representations of an object using the same construction code.
    -> Use the Builder pattern when you want your code to be able to create different representation of some product
    (for example, stone and wooden houses).
    -> Use the Builder to construct Composite trees or other complex objects.
"""
if __name__ == "__main__":
    director = Director()
    car_builder = CarBuilder()
    car_manual_builder = CarManualBuilder()

    director.setBuilder(car_builder)
    director.constructSportsCar()
    car = car_builder.getProduct()
    car.run()

    director.setBuilder(car_manual_builder)
    director.constructSportsCar()
    manual = car_manual_builder.getProduct()
    manual.run()
