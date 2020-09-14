class Context(
    private var strategy: Strategy
) {
    fun setStrategy(strategy: Strategy){
        this.strategy = strategy
    }

    fun executeStrategy(a: Int, b: Int){
        strategy.execute(a, b)
    }
}