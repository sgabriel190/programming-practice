from Button import Button
from Dialog import Dialog
from HTMLButton import HTMLButton


class WebDialog(Dialog):
    def create_button(self) -> Button:
        return HTMLButton()
