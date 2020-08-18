from Button import Button
from Dialog import Dialog
from WindowsButton import WindowsButton


class WindowsDialog(Dialog):
    def create_button(self) -> Button:
        return WindowsButton()
