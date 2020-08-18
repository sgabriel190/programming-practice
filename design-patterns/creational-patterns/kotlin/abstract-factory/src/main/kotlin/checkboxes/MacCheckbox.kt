package checkboxes

class MacCheckbox: Checkbox {
    override fun paint() {
        println("Message from ${this.javaClass.name}.${this::paint.name} method!")
    }
}