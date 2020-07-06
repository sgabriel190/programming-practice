import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow

fun sub(a: Int, b: Int): Flow<Int> = flow {
    val list = listOf(a, b)
    emit(list.reduce { acc, i -> acc - i })
}

fun add(a: Int, b: Int): Flow<Int> = flow {
    val list = listOf(a, b)
    emit(list.reduce { acc, i -> acc + i })
}


fun main() = runBlocking<Unit>{

    val subFlow = sub(1,3)
    val addFlow = add(1,3)

    subFlow.collect {
        println("Sub flow result: $it")
    }
    addFlow.collect {
        println("Add flow result: $it")
    }
}