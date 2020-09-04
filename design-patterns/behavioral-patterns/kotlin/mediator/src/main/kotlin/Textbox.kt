class Textbox(dialog: Mediator): Component(dialog) {
    override fun click() {
        dialog.notify(this, "click")
    }

    override fun keypress() {
        dialog.notify(this, "keypress")
    }
}