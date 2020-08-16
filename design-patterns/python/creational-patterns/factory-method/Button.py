import abc


class Button(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def render(self):
        pass

    @abc.abstractmethod
    def on_click(self, f):
        pass
