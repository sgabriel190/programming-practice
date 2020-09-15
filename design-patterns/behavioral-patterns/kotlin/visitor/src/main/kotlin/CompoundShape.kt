class CompoundShape: Shape {
    override fun move(x: Int, y: Int) {
        println("Call ${this::draw.name}(${x}, ${y}) method from ${this.javaClass.name} object.")
    }

    override fun draw() {
        println("Call ${this::draw.name}() method from ${this.javaClass.name} object.")
    }

    override fun accept(visitor: Visitor) {
        visitor.visitCompoundShape(this)
    }
}