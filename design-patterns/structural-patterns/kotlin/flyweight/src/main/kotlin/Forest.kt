class Forest {
    private val trees: MutableList<Tree> = mutableListOf()
    private val factory = TreeFactory()

    fun plantTree(x: Int, y: Int, name: String, color: String, texture: String){
        val type = factory.getTreeType(name, color, texture)
        trees.add(Tree(x, y, type))
    }

    fun draw(canvas: String){
        trees.forEach{
            it.draw(canvas)
        }
    }
}