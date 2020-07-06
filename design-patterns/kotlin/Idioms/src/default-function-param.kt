fun sum(a: Int = 10, b: Int = 10) = a + b

fun main(){
    /**
     * How to use predefined values with kotlin.
     */
    println("Sum function result with two predefined parameters (10 ,10): "+sum())
    println("Sum function result with two inputed parameters (22 ,3): "+sum(a=22,b=3))
}