class Director:

    def __init__(self):
        self.__builder = None

    def setBuilder(self, builder):
        self.__builder = builder

    def constructSportsCar(self):
        self.__builder.setSeats()
        self.__builder.setEngine()
        self.__builder.setTripComputer()
        self.__builder.setGPS()

    def constructSUV(self):
        self.__builder.setEngine()
        self.__builder.setSeats()
        self.__builder.setGPS()
