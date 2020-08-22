package abstractions

import implementations.Device

open class RemoteControl(protected val device: Device) {

    init {
        println("Hello from ${this.javaClass.name}")
    }
    fun togglePower(){
        if(device.isEnabled()) device.disable() else device.enable()
    }
    fun volumeDown(value: Int){
        device.setterVolume(device.getterVolume() - value)
    }
    fun volumeUp(value: Int){
        device.setterVolume(device.getterVolume() + value)
    }
    fun channelDown(value: Int){
        device.setterChannel(device.getterChannel() - value)
    }
    fun channelUp(value: Int){
        device.setterChannel(device.getterChannel() + value)
    }
}