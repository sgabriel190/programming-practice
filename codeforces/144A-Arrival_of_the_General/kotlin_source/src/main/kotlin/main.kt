fun readInt(): Int = readLine()!!.toInt()
fun readInts(): List<Int> = readLine()!!.split(" ").map { it.toInt() }

fun main(){
    readInt()
    val heightsValues = readInts()
    var maxVal = Int.MIN_VALUE
    var minVal = Int.MAX_VALUE
    for (i in heightsValues.indices){
        if (heightsValues[i] >= maxVal) maxVal = heightsValues[i]
        if (heightsValues[i] <= minVal) minVal = heightsValues[i]
    }
    val maxValIndex = heightsValues.indexOf(maxVal)
    val minValIndex = heightsValues.lastIndexOf(minVal)
    if (maxValIndex > minValIndex) println(maxValIndex + (heightsValues.size - 1 - minValIndex) - 1) else
        println(maxValIndex + (heightsValues.size - 1 - minValIndex))
}