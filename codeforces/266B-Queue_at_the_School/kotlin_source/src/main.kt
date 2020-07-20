fun readInts():List<Int> = readLine()!!.split(" ").map { it.toInt() }.toList()
fun readQueue():String = readLine()!!.toString()
fun main(){
    val (n, t) = readInts()
    var queue = readQueue()
    for (time in 1..t){
        var token = 0
        while(token < n-1){
            var stringBuilder = ""
            if(queue[token] == 'B' && queue[token+1] == 'G')
            {
                stringBuilder += queue.subSequence(0,token)
                stringBuilder += queue[token+1]
                stringBuilder += queue[token]
                stringBuilder += queue.substring(token+2)
                queue = stringBuilder
                token++
            }
            token++;
        }
    }
    println(queue)
}


