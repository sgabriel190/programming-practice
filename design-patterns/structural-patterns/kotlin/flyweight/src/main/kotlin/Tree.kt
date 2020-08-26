class Tree(
    private var x: Int,
    private var y: Int,
    private var type: TreeType
) {
    fun draw(canvas: String){
        type.draw(canvas, x, y)
    }

}