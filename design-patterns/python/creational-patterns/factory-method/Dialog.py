import abc

from Button import Button


class Dialog(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def create_button(self) -> Button:
        pass

    def render(self):
        ok_button = self.create_button()
        ok_button.on_click("close_dialog")
        ok_button.render()
