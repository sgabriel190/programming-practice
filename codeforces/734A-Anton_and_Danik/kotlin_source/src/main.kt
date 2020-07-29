fun readInt() = readLine()!!.toInt()
fun readString() = readLine()!!.toString()
fun resolve(count: Int, stringSequence: String): String{
    var antonCount = 0
    var danikCount = 0
    stringSequence.forEach {
        if(it == 'A'){
            antonCount++
        }
        else
        {
            danikCount++
        }
    }
    return when {
        antonCount>danikCount -> {
            "Anton"
        }
        antonCount<danikCount -> {
            "Danik"
        }
        else -> {
            "Friendship"
        }
    }
}

fun main(){
    val n = readInt()
    val s = readString()
    println(resolve(n, s))
}