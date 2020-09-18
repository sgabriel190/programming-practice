fun readInts(): List<Int> = readLine()!!.split(" ", limit=2).map{ it.toInt() }

fun main(){
    val (n, m) = readInts()
    var mode = 1
    for(line in 0 until n){
        if (line and 1 == 0) {
            println("#".repeat(m))
        }else{
            if(mode == 1){
                println(".".repeat(m-1) + "#")
            }else{
                println("#" + ".".repeat(m-1))
            }
            mode = 3 - mode
        }
    }
}