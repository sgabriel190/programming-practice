fun readInt(): Int = readLine()!!.toInt()
fun readStrings(numberStrings: Int): List<String> {
    var auxCount = numberStrings
    val resultList = mutableListOf<String>()
    while (auxCount > 0){
        resultList.add(readLine()!!.toString())
        auxCount--
    }
    return resultList.toList()
}
fun resolve(inputList: List<String>){
    val inputMap = inputList.toSet().map {
        it to 0
    }.toMap().toMutableMap()
    inputList.forEach {
        if (inputMap[it] == 0){
            println("OK")
        }
        else{
            println(it+inputMap[it])
        }
        val value = inputMap[it]!!.toInt()
        inputMap.replace(it, value + 1)
    }
}

fun main(){
    val n = readInt()
    val inputs = readStrings(n)


    resolve(inputs)
}