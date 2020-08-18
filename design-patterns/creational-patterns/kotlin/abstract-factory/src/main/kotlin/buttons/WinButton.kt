package buttons

class WinButton: Button {
    override fun paint() {
        println("Message from ${this.javaClass.name}.${this::paint.name} method!")
    }
}