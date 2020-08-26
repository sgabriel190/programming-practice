class TreeFactory {
    private val treeTypes: MutableList<TreeType> = mutableListOf()

    fun getTreeType(name: String, color: String, texture: String): TreeType{
        val type = treeTypes.find { it.name == name && it.color == color && it.texture == texture }
        if(type == null) {
            val newType = TreeType(name, color, texture)
            this.treeTypes.add(newType)
            return newType
        }
        return type
    }
}