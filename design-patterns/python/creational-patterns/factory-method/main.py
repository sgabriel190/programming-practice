from DialogFactory import DialogFactory


if __name__ == "__main__":
    config = "Web"

    dialog = DialogFactory.create(config)
    button = dialog.create_button()
    button.render()
    button.on_click("Close")
