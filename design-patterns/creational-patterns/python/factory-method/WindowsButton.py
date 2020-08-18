from abc import ABC

from Button import Button


class WindowsButton(Button, ABC):
    def render(self):
        print("Message from WindowsButton.render() class!")

    def on_click(self, f):
        print("Message from WindowsButton.on_click({}) class!".format(f))
