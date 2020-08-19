from Car import Car
from builder.Builder import Builder


class CarBuilder(Builder):

    def __init__(self):
        self.__car = None
        self.reset()

    def reset(self):
        self.__car = Car()

    def setSeats(self):
        self.__car.seat = True

    def setEngine(self):
        self.__car.engine = True

    def setTripComputer(self):
        self.__car.tripComputer = True

    def setGPS(self):
        self.__car.GPS = True

    def getProduct(self) -> Car:
        car = self.__car
        self.reset()
        return car
