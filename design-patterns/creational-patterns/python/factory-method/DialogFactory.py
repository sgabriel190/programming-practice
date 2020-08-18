from WebDialog import WebDialog
from WindowsDialog import WindowsDialog
import abc


class DialogFactory(metaclass=abc.ABCMeta):

    @staticmethod
    def create(config):
        return WindowsDialog() if config == "Windows" \
            else WebDialog() if config == "Web" \
            else None
