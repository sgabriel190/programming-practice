import abc


class DataSource(metaclass=abc.ABCMeta):

    @abc.abstractmethod
    def writeData(self, data: str) -> None:
        pass

    @abc.abstractmethod
    def readData(self) -> str:
        pass
