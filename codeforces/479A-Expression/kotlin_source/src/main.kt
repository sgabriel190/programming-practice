import kotlin.math.max
import kotlin.math.min

/**
 * Petya studies in a school and he adores Maths. His class has been studying arithmetic expressions. On the last
 * class the teacher wrote three positive integers a, b, c on the blackboard. The task was to insert signs of
 * operations '+' and '*', and probably brackets between the numbers so that the value of the resulting expression is
 * as large as possible. Let's consider an example: assume that the teacher wrote numbers 1, 2 and 3 on the blackboard.
 * Here are some ways of placing signs and brackets:
 * 1+2*3=7
 * 1*(2+3)=5
 * 1*2*3=6
 * (1+2)*3=9
 * Note that you can insert operation signs only between a and b, and between b and c, that is, you cannot swap integers.
 * For instance, in the given sample you cannot get expression (1+3)*2.
 * It's easy to see that the maximum value that you can obtain is 9.
 * Your task is: given a, b and c print the maximum value that you can get.
 *
 * Input
 * The input contains three integers a, b and c, each on a single line (1 ≤ a, b, c ≤ 10).
 *
 * Output
 * Print the maximum value of the expression that you can obtain.
 */
fun readInt(): Int = readLine()!!.toInt()

fun readInputs():MutableList<Int> {
    val inputList:MutableList<Int> = mutableListOf()
    for (i in 0..2){
        inputList += listOf(readInt())
    }
    return inputList
}

fun maxExp(list: MutableList<Int>): Int {
    val expr1 = list[0] + list[1] + list[2]
    val expr2 = list[0] * list[1] * list[2]
    val expr3 = list[0] + list[1] * list[2]
    val expr4 = list[0] * list[1] + list[2]
    val expr5 = list[0] * (list[1] + list[2])
    val expr6 = (list[0] + list[1]) * list[2]
    return max(max(max(max(max(expr1, expr2), expr3), expr4), expr5), expr6)
}
/*
fun sum0and1(list: MutableList<Int>):List<Int>{
    if (list.contains(0)) {
        list.remove(0)
    }
    var counter = 0
    for (i in 0..2){
        if (list[i] == 1) counter++
    }
    return if(counter != 3) {
        if (list.contains(1)) {
            val index = list.indexOf(1)
            list.remove(1)
            if(index!=0 && index!=2) {
                val minValue = min(list[index], list[index - 1])
                if (minValue == list[index]) list[index]++ else list[index - 1]++
            }
            else if(index == 0){
                list[index]++
            }
            else{
                list[index-1]++
            }
        }
        list.toList()
    }
    else {
        listOf(list.reduce { acc: Int, i: Int -> acc + i }.toInt())
    }
}

fun maxResult(list: List<Int>): Int = list.reduce { acc, i -> acc * i }
*/

fun main(){
    val inputValues = readInputs().toMutableList()
    /*
    val filteredList = sum0and1(inputValues)
    val result = maxResult(filteredList)
    */
    println(maxExp(inputValues))
}