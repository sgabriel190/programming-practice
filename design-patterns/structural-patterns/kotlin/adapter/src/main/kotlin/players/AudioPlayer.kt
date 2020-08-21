package players

import shared.Hello

class AudioPlayer: MediaPlayer, Hello() {
    override fun play() {
        this.helloFunction()
    }
}