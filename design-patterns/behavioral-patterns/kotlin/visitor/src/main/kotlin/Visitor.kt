interface Visitor {
    fun visitDot(d: Dot)
    fun visitCircle(c: Circle)
    fun visitRectangle(r: Rectangle)
    fun visitCompoundShape(cs: CompoundShape)
}