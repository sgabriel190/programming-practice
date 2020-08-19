import abc


class Car(metaclass=abc.ABCMeta):
    def __init__(self):
        self.seat = False
        self.engine = False
        self.tripComputer = False
        self.GPS = False

    def run(self):
        print("Message from {} method!".format(Car.run.__qualname__))
        print("Fields:\n" + str(self.__dict__))
