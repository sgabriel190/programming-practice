abstract class GameAI {
    fun turn(){ // this method is final so it can't be overridden
        collectResources()
        buildStructures()
        buildUnits()
        sendScouts()
        sendWarriors()
        attack()
    }

    open fun collectResources(){
        println("Called ${this::collectResources.name} from ${GameAI::class.java.name}.")
    }

    abstract fun buildStructures()
    abstract fun buildUnits()

    open fun attack(){
        println("Called ${this::attack.name} from ${GameAI::class.java.name}.")
    }
    abstract fun sendScouts()
    abstract fun sendWarriors()
}
