class OrcsAI: GameAI() {
    override fun buildStructures() {
        println("Called ${this::buildStructures.name} from ${OrcsAI::class.java.name}.")
    }

    override fun buildUnits() {
        println("Called ${this::buildUnits.name} from ${OrcsAI::class.java.name}.")
    }

    override fun sendScouts() {
        println("Called ${this::sendScouts.name} from ${OrcsAI::class.java.name}.")
    }

    override fun sendWarriors() {
        println("Called ${this::sendWarriors.name} from ${OrcsAI::class.java.name}.")
    }
}