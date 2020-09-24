fun readInts(): List<Int> = readLine()!!.split(" ", limit=2).map{ it.toInt() }


fun main(){
    val (n, k) = readInts()
    val time = 4 * 60 - k
    var tmp = n
    while (true){
        if((1..tmp).sum() * 5 <= time){
            break
        }
        tmp --
    }
    print(tmp)
}