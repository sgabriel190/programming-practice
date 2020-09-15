interface Shape {
    fun move(x: Int, y: Int)
    fun draw()
    fun accept(visitor: Visitor)
}