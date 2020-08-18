import factories.MacFactory
import factories.WinFactory
import kotlin.random.Random

fun main() {
    val config = if(Random.nextBoolean()) "Windows" else "Mac"
    val factory = if(config == "Windows")  WinFactory() else  MacFactory()

    val button = factory.createButton()
    val checkbox = factory.createCheckbox()

    button.paint()
    checkbox.paint()
}