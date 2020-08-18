package checkboxes

class WinCheckbox: Checkbox {
    override fun paint() {
        println("Message from ${this.javaClass.name}.${this::paint.name} method!")
    }
}