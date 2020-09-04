fun readInput(): Collection<String> = readLine()!!.removePrefix("{")
    .removeSuffix("}")
    .split(", ")
    .filter {
        it != ""
    }
    .toSet()

fun main(){
    val input = readInput()
    println(input.size)
}