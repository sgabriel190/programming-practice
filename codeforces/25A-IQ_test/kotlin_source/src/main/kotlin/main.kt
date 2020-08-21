fun readInt(): Int = readLine()!!.toInt()
fun readInts(): List<Int> = readLine()!!.split(" ").map { it.toInt() }

fun main(){
    readInt()
    val values = readInts().mapIndexed { index, i -> listOf(i, index + 1) }

    val evenValues = values.filter { it[0] and 1 == 0 }
    if(evenValues.size == 1){
        println(evenValues[0][1])
        return
    }

    val oddValues = values.filter { it[0] and 1 == 1 }
    if(oddValues.size == 1){
        println(oddValues[0][1])
        return
    }
}