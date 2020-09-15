/**
 * TEMPLATE METHOD PATTERN
 * -> Is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses
 * override specific steps of the algorithm without changing its structure.
 * -> The Template Method pattern suggests that you break down an algorithm into a series of steps turn these steps into
 * methods, and put a series of calls to these methods inside a single "template method".
 * -> Two types of steps: - abstract steps must be implemented by every subclass.
 *                        - optional steps already have some default implementation, but still can be overridden if needed.
 *                        - hooks: an optional step with an empty body. A template method would work even if a hook isn't
 *                        overridden. Usually, hooks are placed before and after crucial steps of algorithms, providing
 *                        subclasses with additional extensions points for an algorithm.
 * -> Use the Template Method pattern when you want to let clients extend only particular steps of an algorithm, but not
 * the whole algorithm or its structure.
 * -> Use the pattern when tou have several classes that contain almost identical algorithms with some minor differences.
 * As a result you might need to modify both classes when the algorithm changes.
 * ->
 */
fun main(){
    var ai: GameAI = OrcsAI()
    ai.turn()
    println()
    ai = MonsterAI()
    ai.turn()
}