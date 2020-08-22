import kotlin.math.min

fun readInts(): List<Int> = readLine()!!.split(" ").map{ it.toInt() }

fun main(){
    val (n, _) = readInts()
    var minim = Int.MAX_VALUE
    val piecesPuzzleList = readInts().sorted()
    for (index in 0 until piecesPuzzleList.size - n + 1){
        val value = piecesPuzzleList[index + n - 1] - piecesPuzzleList[index]
        minim = min(value, minim)
    }
    println(minim)
}