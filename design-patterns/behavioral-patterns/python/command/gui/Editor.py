class Editor:

    text: str = None

    def __init__(self, text: str):
        self.text = text

    def getSelection(self) -> str:
        return self.text

    def deleteSelection(self) -> None:
        self.text = ""

    def replaceSelection(self, text: str) -> None:
        self.text = text
