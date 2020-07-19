fun readString():String = readLine()!!.toString()
fun main(){
    val input = readString()
    val matchingSequencesList = input.split("[^47]".toRegex()).filter { it != "" }
    val numberOfLuckyNumbers = matchingSequencesList.joinToString(separator = "").length
    if(numberOfLuckyNumbers.toString().matches("[47]+".toRegex())){
        println("YES")
    }else{
        println("NO")
    }
}