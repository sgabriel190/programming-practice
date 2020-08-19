import abc


class Manual(metaclass=abc.ABCMeta):
    def __init__(self):
        self.seat = False
        self.engine = False
        self.tripComputer = False
        self.GPS = False

    def run(self):
        print("Message from {} method!".format(Manual.run.__qualname__))
        print("Fields:\n" + str(self.__dict__))
