from Button import Button


class HTMLButton(Button):
    def render(self):
        print("Message from HTMLButton.render()!")

    def on_click(self, f):
        print("Message from HTMLButton.on_click({})".format(f))
