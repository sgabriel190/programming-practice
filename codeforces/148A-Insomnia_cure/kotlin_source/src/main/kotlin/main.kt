fun readInt(): Int = readLine()!!.toInt()

fun main(){
    val k = readInt()
    val l = readInt()
    val m = readInt()
    val n = readInt()
    val d = readInt()

    val result = (1..d)
        .toList()
        .map { if(it % k == 0 || it % l == 0 || it % m == 0 || it % n == 0) 1 else 0 }
        .reduce { acc, i -> acc + i }

    println(result)
}