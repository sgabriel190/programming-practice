fun readInts(): List<Int> = readLine()!!
    .split(" ")
    .map{it.toInt()}

fun main(){
    val (n, m) = readInts()
    val players = mapOf<Int, String>(1 to "Akshat", 0 to "Malvika")
    val value = if (n > m) m else n
    val winner = value % 2
    println(players[winner])
}