fun readInt(): Int = readLine()!!.toInt()
fun isBeautiful(year: Int): Boolean {
    val resultList = year.toString().flatMap {
        listOf(it to 1)
    }
    val resultSet = resultList.toSet()
    if(resultSet.size == resultList.size)
    {
        return true
    }
    return false
}
fun findNumber(startYear: Int): Int{
    var copyStartYear = startYear + 1
    while (!isBeautiful(copyStartYear)){
        copyStartYear++
    }
    return copyStartYear
}

fun main(){
    val inputValue = readInt()
    print(findNumber(inputValue))
}