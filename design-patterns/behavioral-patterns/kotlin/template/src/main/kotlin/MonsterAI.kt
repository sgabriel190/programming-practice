class MonsterAI: GameAI() {
    override fun buildStructures() {
        println("Called ${this::buildStructures.name} from ${MonsterAI::class.java.name}.")
    }

    override fun collectResources() {
        println("Called ${this::collectResources.name} from ${MonsterAI::class.java.name}.")
    }

    override fun buildUnits() {
        println("Called ${this::buildUnits.name} from ${MonsterAI::class.java.name}.")
    }

    override fun sendScouts() {
        println("Called ${this::sendScouts.name} from ${MonsterAI::class.java.name}.")
    }

    override fun sendWarriors() {
        println("Called ${this::sendWarriors.name} from ${MonsterAI::class.java.name}.")
    }
}