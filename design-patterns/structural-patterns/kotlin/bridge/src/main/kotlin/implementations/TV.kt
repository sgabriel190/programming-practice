package implementations


class TV: Device() {
    init {
        println("Hello from ${this.javaClass.name}")
    }
    override fun isEnabled(): Boolean = this.enabled

    override fun enable() {
        this.enabled = true
    }

    override fun disable() {
        this.enabled = false
    }

    override fun getterVolume(): Int = this.volume
    override fun setterVolume(volume: Int) {
        this.volume = volume
    }

    override fun getterChannel(): Int = this.channel
    override fun setterChannel(channel: Int) {
        this.channel = channel
    }
}