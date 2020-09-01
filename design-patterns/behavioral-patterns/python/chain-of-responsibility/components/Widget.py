import abc


class Widget(metaclass=abc.ABCMeta):
    tooltipText: str = None
    _container = None

    @abc.abstractmethod
    def showHelp(self) -> None:
        pass

    @abc.abstractmethod
    def setContainer(self, container) -> None:
        pass
