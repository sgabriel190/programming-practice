import kotlin.math.max
import kotlin.math.min

fun readInts(): List<Int> = readLine()!!.split(" ").map { it.toInt() }


fun main(){
    readInts()
    val contests = readInts()
    var result = 0
    loop@ for (idx in 1..contests.lastIndex){
        var mxm = contests[idx]
        var mnm = contests[idx]
        for ( pastContest in 0 until idx){
            if (contests[pastContest] == contests[idx]) continue@loop
            mxm = max(contests[pastContest], mxm)
            mnm = min(contests[pastContest], mnm)
        }
        if(mxm == contests[idx] || mnm == contests[idx]) result++
    }
    println(result)
}