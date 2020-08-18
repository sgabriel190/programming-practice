import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.random.Random

class Math(override val coroutineContext: CoroutineContext) : CoroutineScope{

    fun add(a: Int, b: Int) = launch {
        println(Thread.currentThread())
        println("Result add: ${a+b}")
    }

    fun sub(a: Int, b: Int) = launch {
        println(Thread.currentThread())
        println("Result sub: ${a-b}")
    }
}

fun main() = runBlocking<Unit> {
    val math = Math(Dispatchers.Default)
    for ( value in 1..10){
        math.add(Random.nextInt(0, 100), Random.nextInt(0, 100))
        math.sub(Random.nextInt(0, 100), Random.nextInt(0, 100))
    }
}