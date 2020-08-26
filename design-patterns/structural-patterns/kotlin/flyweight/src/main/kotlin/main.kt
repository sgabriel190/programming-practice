/**
 * FLYWEIGHT PATTERN (Cache)
 * -> Is a structural design pattern that lets you fit more objects into the available amount of
 * RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each
 * object
 * -> Use the Flyweight pattern only when your program must support a huge number of objects which
 * barely fit into available RAM.
 * -> The pattern can mimic a caching system.
 */
fun main(){
    val forest = Forest()
    forest.plantTree(10, 10, "brad", "verde", "aspru")
    forest.plantTree(20, 10, "brad", "verde", "aspru")
    forest.plantTree(10, 11, "nuc", "galben", "tare")
    forest.plantTree(21321, 32131, "mar", "verde", "moale")
    forest.draw("JWTCanvas")
}