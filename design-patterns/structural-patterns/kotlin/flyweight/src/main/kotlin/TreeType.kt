class TreeType(
    val name: String,
    val color: String,
    val texture: String,
) {
    fun draw(canvas: String, x: Int, y: Int){
      println("Message from ${this.javaClass.name}.draw()! canvas=$canvas x:$x y:$y")
    }
}