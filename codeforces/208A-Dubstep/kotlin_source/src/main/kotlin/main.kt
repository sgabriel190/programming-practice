fun readString(): String = readLine()!!.toString()

fun main(){
    val input = readString()
    val result = input
        .replace("(WUB)+".toRegex(), " ")
        .trim()

    println(result)
}