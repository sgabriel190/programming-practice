class ConcreteStrategySubtract: Strategy {
    override fun execute(a: Int, b: Int) {
        println("Called method ${this::execute.name}(${a}, ${b}) from object ${this.javaClass.name}." +
                "\nResult: ${a - b}")
    }
}