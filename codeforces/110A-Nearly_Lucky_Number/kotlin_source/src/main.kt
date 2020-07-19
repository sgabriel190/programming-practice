fun readString():String = readLine()!!.toString()
fun main(){
    val searchedCharsList = listOf<Char>('7', '4')
    val input = readString()
    for (index in 0..input.length ){
        if(input[index] in searchedCharsList){
            var foundCheck = false
            val searchedChar = if(input[index]=='4') '7' else '4'
            for (token in index+1..input.length){
                if(input[token] !in searchedCharsList){
                    index = token
                    break
                }
            }
        }
    }
}