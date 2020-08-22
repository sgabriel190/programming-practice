package abstractions

import implementations.Device

class AdvancedRemoteControl(device: Device):
    RemoteControl(device = device) {
    init {
        println("Hello from ${this.javaClass.name}")
    }
    fun mute(){
        device.setterVolume(0)
    }
}