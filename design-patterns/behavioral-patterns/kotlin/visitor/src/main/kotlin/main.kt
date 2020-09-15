import kotlin.random.Random

/**
 * VISITOR PATTERN
 * -> Is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.
 * -> The Visitor pattern suggests that you place the new behavior into a separate class called visitor, instead of
 * trying to integrate it into existing classes.
 * -> Use the Visitor when tou need to perform an operation on all elements of a complex object structure (for example,
 * an object tree).
 * -> Use the Visitor to clean up the business logic of auxiliary behaviors.
 * -> Use the pattern when a behavior makes sense only in some classes of a class hierarchy, but not in others.
 */
fun main(args: Array<String>){
    val shapes = listOf(Circle(), Circle(), Rectangle(), CompoundShape(), Dot())
    val export = XMLExportVisitor()
    val random = {x: Int, y: Int -> Random.nextInt(x, y)}
    shapes.forEach {
        it.draw()
        it.move(random(1, 10), random(1, 10))
        it.accept(export)
        println()
    }
}