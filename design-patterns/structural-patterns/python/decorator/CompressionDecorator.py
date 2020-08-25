import re

from DataSource import DataSource
from DataSourceDecorator import DataSourceDecorator


class CompressionDecorator(DataSourceDecorator):

    def __init__(self, source: DataSource):
        super(CompressionDecorator, self).__init__(source)

    def writeData(self, data: str) -> None:
        self._wrappee.writeData(" ".join(list(map(lambda x: str(ord(x)), list(data)))))

    def readData(self) -> str:
        data = self._wrappee.readData()
        data = re.sub("[a-zA-Z!.]", "", data)
        data = data.strip(" ").strip("\n")
        return "".join(list(map(lambda x: chr(int(x)), data.split())))
