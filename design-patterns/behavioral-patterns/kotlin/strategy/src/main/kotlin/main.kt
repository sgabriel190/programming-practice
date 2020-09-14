import kotlin.random.Random

/**
 * STRATEGY PATTERN
 * -> Is a behavioral design pattern that lets you define a family of algorithms, put each od them into a separate
 * class, and make their objects interchangeable.
 * -> Use the Strategy pattern when you want to use different variants of an algorithm within an object and be able to
 * switch from one algorithm to another during runtime.
 * -> Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.
 * -> Use the pattern to isolate the business login of ta class from the implementation details of algorithms that may
 * not be as important in the context of that logic.
 * -> Use the pattern when your class has a massive conditional operator that switches between different variants of
 * the same algorithm.
 */
fun main(){
    val a = Random.nextInt(0, 100)
    val b = Random.nextInt(0, 100)
    val ctx = Context(ConcreteStrategyAdd())
    ctx.executeStrategy(a, b)
    ctx.setStrategy(ConcreteStrategySubtract())
    ctx.executeStrategy(a, b)
    ctx.setStrategy(ConcreteStrategyMultiply())
    ctx.executeStrategy(a, b)
}