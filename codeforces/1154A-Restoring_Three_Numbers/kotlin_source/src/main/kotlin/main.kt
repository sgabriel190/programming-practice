fun readInts(): Array<Int> = readLine()!!.split(" ", limit=4).map{ it.toInt() }.sorted().toTypedArray()

fun main(){
    val input = readInts()
    val val1 = input[3] - input[0]
    val val2 = input[1] - val1
    val val3 = input[2] - val1
    println("$val1 $val2 $val3")
}