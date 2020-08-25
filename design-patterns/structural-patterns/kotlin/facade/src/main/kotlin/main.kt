/**
 * FACADE PATTERN
 * -> Is a structural design pattern that provides a simplified interface to a library, a framework,
 * or any other complex set of classes.
 * -> Use the Facade pattern when you need to have a limited but straightforward interface to a complex subsystem.
 * -> Use the Facade when you want to structure a subsystem into layers.(Create facades to define entry points to each
 * level of a subsystem. You can reduce coupling between multiple subsystems by requiring them to communicate only
 * through facades)
 */
fun main(){
    val converter = VideoConverter()
    converter.convert("youtubevideo.ogg", "mp4")
}