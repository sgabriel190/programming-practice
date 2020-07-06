fun main(){
    val mapValues = mapOf<Int, String>(1 to "a", 2 to "b", 3 to "c")

    for((key, value) in mapValues){
        println("$key -> $value")
    }
}