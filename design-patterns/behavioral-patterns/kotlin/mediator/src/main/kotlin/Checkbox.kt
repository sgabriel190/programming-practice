class Checkbox(dialog: Mediator): Component(dialog) {
    var checked = false

    override fun click() {
        dialog.notify(this, "click")
    }

    override fun keypress() {
        dialog.notify(this, "keypress")
    }

    fun check(){
        checked = !checked
        dialog.notify(this, "check")
    }
}