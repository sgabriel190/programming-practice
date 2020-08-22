package implementations

abstract class Device {
    protected var enabled: Boolean = false
    protected var volume: Int = 0
    protected var channel: Int = 1

    abstract fun isEnabled(): Boolean
    abstract fun enable()
    abstract fun disable()
    abstract fun getterVolume(): Int
    abstract fun setterVolume(volume: Int)
    abstract fun getterChannel(): Int
    abstract fun setterChannel(channel: Int)
}