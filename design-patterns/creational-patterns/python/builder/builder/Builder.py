import abc


class Builder(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def reset(self):
        pass

    @abc.abstractmethod
    def setSeats(self):
        pass

    @abc.abstractmethod
    def setEngine(self):
        pass

    @abc.abstractmethod
    def setTripComputer(self):
        pass

    @abc.abstractmethod
    def setGPS(self):
        pass
