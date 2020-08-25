import factories.MacFactory
import factories.WinFactory
import kotlin.random.Random

/**
 * ABSTRACT FACTORY PATTERN
 * -> Is a creational design pattern that lets you produce families of related objects without
 *  specifying their concrete classes.
 *  -> Use the Abstract Factory when tour code needs to work with various families of related products,
 *  but you don't want it to depend on the concrete classes of those products-they might be unknown
 *  beforehand or you simply want to allow for future extensibility.
 *  -> Consider implementing the Abstract Factory when you have a class with a set of Factory Methods that
 *  blur its primary responsibility.
 */
fun main() {
    val config = if(Random.nextBoolean()) "Windows" else "Mac"
    val factory = if(config == "Windows")  WinFactory() else  MacFactory()

    val button = factory.createButton()
    val checkbox = factory.createCheckbox()

    button.paint()
    checkbox.paint()
}