abstract class Component(
    protected val dialog: Mediator
) {
    abstract fun click()
    abstract fun keypress()
}