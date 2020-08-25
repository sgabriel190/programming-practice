from DataSource import DataSource
from DataSourceDecorator import DataSourceDecorator


class EncryptionDecorator(DataSourceDecorator):

    def __init__(self, source: DataSource):
        super(EncryptionDecorator, self).__init__(source)

    def writeData(self, data: str) -> None:
        self._wrappee.writeData(data[::-1])

    def readData(self) -> str:
        return self._wrappee.readData()[::-1]
