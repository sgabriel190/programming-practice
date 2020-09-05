class Snapshot:

    __editor = None
    __state: dict = None

    def __init__(self, editor, state: dict):
        self.__editor = editor
        self.__state = state

    def restore(self) -> None:
        self.__editor.setState(self.__state)
