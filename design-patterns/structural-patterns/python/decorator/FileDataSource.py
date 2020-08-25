from DataSource import DataSource


class FileDataSource(DataSource):

    __filename = None

    def __init__(self, filename: str):
        self.__filename = filename
        open(self.__filename, "w").close()

    def writeData(self, data: str) -> None:
        file = open(self.__filename, "a+")
        file.write(data + "\n")
        file.close()

    def readData(self) -> str:
        file = open(self.__filename, "r")
        data = file.read()
        file.close()
        return data.strip("\n")
