import kotlin.system.exitProcess

fun readInts(): List<Int> = readLine()!!
    .split(" ")
    .map { it.toInt() }

fun main(){
    val (initialStrength, dragonsToFight) = readInts()
    var incrementalStrength = initialStrength
    val listOfDragons = mutableListOf<List<Int>>()
    for( index in 0 until dragonsToFight){
        listOfDragons += readInts()
    }
    listOfDragons.sortWith(compareBy({ it[0] }, { -it[1] }))
    listOfDragons.forEach {
        if ( incrementalStrength <= it[0]){
            println("NO")
            exitProcess(0)
        }
        incrementalStrength += it[1]
    }
    println("YES")
}