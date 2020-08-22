import abstractions.AdvancedRemoteControl
import abstractions.RemoteControl
import implementations.TV

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