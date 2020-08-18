fun main(){
    /**
     * Use kotlin's specific methods to filter a collection.
     */
    val numberList = listOf(-2, 3, 10,200,-2103, 0, 23)
    val filterPositiveList = numberList.filter { it > 0  } // { x-> x>0} using lambda

    println("Initial list: $numberList")
    println("List filtered by positive numbers: $filterPositiveList")
}