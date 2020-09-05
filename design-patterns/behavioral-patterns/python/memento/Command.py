from Snapshot import Snapshot


class Command:
    __backup: Snapshot = None

    def makeBackup(self, backup: Snapshot) -> None:
        print("[INFO]: {} saved a backup of {}.".format(self.__class__.__name__, backup.__class__.__name__))
        self.__backup = backup

    def undo(self) -> None:
        if self.__backup is not None:
            self.__backup.restore()
