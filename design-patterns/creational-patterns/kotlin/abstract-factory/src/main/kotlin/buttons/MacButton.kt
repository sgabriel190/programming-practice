package buttons

class MacButton : Button {
    override fun paint() {
        println("Message from ${this.javaClass.name}.${this::paint.name} method!")
    }
}