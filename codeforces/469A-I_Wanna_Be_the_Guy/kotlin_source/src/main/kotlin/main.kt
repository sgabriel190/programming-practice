fun readInt(): Int = readLine()!!.toInt()
fun readInts(): List<Int> = readLine()!!.split(" ").map { it.toInt() }


fun main() {
    val numberOfLevels = readInt()
    val levelsXCanPass = readInts().drop(1)
    val levelsYCanPass = readInts().drop(1)
    val result = levelsXCanPass union levelsYCanPass
    if (result.containsAll((1..numberOfLevels).toSet())) println("I become the guy.") else println("Oh, my keyboard!")
}