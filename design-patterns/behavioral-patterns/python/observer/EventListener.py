import abc


class EventListener(metaclass=abc.ABCMeta):

    @abc.abstractmethod
    def update(self, filename):
        pass
