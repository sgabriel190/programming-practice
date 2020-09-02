import abc

from gui.Editor import Editor


class Command(metaclass=abc.ABCMeta):

    _app = None
    _editor: Editor = None
    _backup: str = None

    def __init__(self, app, editor):
        self._app = app
        self._editor = editor

    def saveBackup(self) -> None:
        self._backup = self._editor.text

    def undo(self) -> None:
        self._editor.text = self._backup

    @abc.abstractmethod
    def execute(self) -> bool:
        pass
