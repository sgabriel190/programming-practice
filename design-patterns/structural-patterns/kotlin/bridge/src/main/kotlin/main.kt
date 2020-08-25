import abstractions.AdvancedRemoteControl
import abstractions.RemoteControl
import implementations.TV

/**
 * BRIDGE PATTERN
 * -> Is a structural design pattern that lets you split a large class or a set of closely related classes into two
 * separate hierarchies-abstraction and implementation-which can be developed independently.
 * ->It can be split up into: Abstraction(the interface given to an user) and Implementation(the actual low level
 * implementation)
 * ->Use the Bridge pattern when you want to divide and organize a monolithic class that has several variants
 * of some functionality (for example, if the class can work with various database servers).
 * ->Use the pattern when you need to extend a class in several orthogonal (independent) dimensions.
 * ->Use the Bridge if you need to be able to switch implementations at runtime.
 */
fun main(){
    val device = TV()
    val remoteControl = RemoteControl(device)

    remoteControl.togglePower()
    remoteControl.channelUp(10)
    remoteControl.channelDown(100)
    remoteControl.volumeDown(20)
    remoteControl.volumeUp(20)
    println(device.getterChannel().toString() + " " + device.getterVolume())

    val advancedRemoteControl = AdvancedRemoteControl(device)
    advancedRemoteControl.mute()
}