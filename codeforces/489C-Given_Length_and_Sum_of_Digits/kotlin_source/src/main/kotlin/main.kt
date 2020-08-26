import kotlin.math.max

fun readInts(): List<Int> = readLine()!!.split(" ").map{ it.toInt() }
fun findMin(m: Int, s: Int): String{
    val digits = (m-2 downTo 0).toMutableList()
    if (s > m * 9) return "-1"
    if(digits.size == 0) return "$s"
    val result = mutableListOf(max(1, s - 9*(m-1)))
    var auxS = s - result[0]
    var auxM = m - 1
    var index = 0
    while(auxM != 0 || auxS != 0){
        val value = max(0, auxS - 9 * digits[index])
        result.add(value)
        index ++
        auxS -= value
        auxM --
        if(auxM == 0) break
    }
    if(result.isEmpty() || auxM + auxS != 0){
        return "-1"
    }
    return result.joinToString(separator = "")
}
fun findMax(m: Int, s: Int): String{
    val digits = (9 downTo 0).toMutableList()
    var auxS = s
    var auxM = m
    val result = mutableListOf<Int>()
    var index = 0
    if( m == 1 && s <= 9)
    {
        return "$s"
    }
    while(auxM != 0 || auxS != 0){
        if(auxS - digits[index] >= 0){
            result.add(digits[index])
            auxS -= digits[index]
            auxM --
        }
        if(auxS < digits[index]){
            index ++
        }
        if(auxM == 0) break
    }
    if(result.isEmpty() || result.reduce{acc: Int, i: Int -> acc+i } == 0 || auxM + auxS != 0){
        return "-1"
    }
    return result.joinToString(separator = "")
}


fun main(){
    val (m, s) = readInts()

    println("${findMin(m, s)} ${findMax(m,s)}")
}