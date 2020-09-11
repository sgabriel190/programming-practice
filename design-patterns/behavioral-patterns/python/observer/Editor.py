from EventManager import EventManager


class Editor:
    events: EventManager = None
    __fileName: str = None

    def __init__(self, editor, fileName):
        self.events = editor
        self.__fileName = fileName

    def openFile(self):
        self.events.notify("open", self.__fileName)

    def saveFile(self):
        self.events.notify("save", self.__fileName)
