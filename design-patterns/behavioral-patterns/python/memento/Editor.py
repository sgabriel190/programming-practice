from Snapshot import Snapshot


class Editor:
    __text: str = None
    __curX: int = None
    __curY: int = None
    __selectionWidth: int = None

    def __init__(self, text: str, x: int, y: int):
        self.__text = text
        self.__curX = x
        self.__curY = y
        self.__selectionWidth = 0

    def setText(self, text: str) -> None:
        self.__text = text

    def setState(self, state: dict):
        self.__dict__ = state

    def createSnapshot(self) -> Snapshot:
        return Snapshot(self, self.__dict__.copy())
