from Manual import Manual
from builder.Builder import Builder


class CarManualBuilder(Builder):

    def __init__(self):
        self.__manual = None
        self.reset()

    def reset(self):
        self.__manual = Manual()

    def setSeats(self):
        self.__manual.seat = True

    def setEngine(self):
        self.__manual.engine = True

    def setTripComputer(self):
        self.__manual.tripComputer = True

    def setGPS(self):
        self.__manual.GPS = True

    def getProduct(self) -> Manual:
        manual = self.__manual
        self.reset()
        return manual
