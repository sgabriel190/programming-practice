class XMLExportVisitor: Visitor {
    override fun visitDot(d: Dot) {
        println("Call ${this::visitDot.name}(${d.javaClass.name}) method from ${this.javaClass.name} object.")
    }

    override fun visitCircle(c: Circle) {
        println("Call ${this::visitDot.name}(${c.javaClass.name}) method from ${this.javaClass.name} object.")
    }

    override fun visitRectangle(r: Rectangle) {
        println("Call ${this::visitDot.name}(${r.javaClass.name}) method from ${this.javaClass.name} object.")
    }

    override fun visitCompoundShape(cs: CompoundShape) {
        println("Call ${this::visitDot.name}(${cs.javaClass.name}) method from ${this.javaClass.name} object.")
    }

}