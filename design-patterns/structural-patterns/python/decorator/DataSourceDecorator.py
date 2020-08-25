from DataSource import DataSource


class DataSourceDecorator(DataSource):
    _wrappee: DataSource = None

    def __init__(self, source: DataSource):
        self._wrappee = source

    def writeData(self, data: str) -> None:
        self._wrappee.writeData(data)

    def readData(self) -> str:
        return self._wrappee.readData()
