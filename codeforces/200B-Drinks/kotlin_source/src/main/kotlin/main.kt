fun readInt(): Int = readLine()!!.toInt()
fun readInts(): Collection<Double> = readLine()!!.split(" ").map { it.toDouble() }


fun main(){
    readInt()
    val values = readInts()
    val totalFraction = values.size.toDouble()
    val fractionJuice = values
        .reduce { acc, l -> acc+l }
    val result = fractionJuice/totalFraction

    println("%.12f".format(result))
}