from builder.CarBuilder import CarBuilder
from builder.CarManualBuilder import CarManualBuilder
from director.Director import Director

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
