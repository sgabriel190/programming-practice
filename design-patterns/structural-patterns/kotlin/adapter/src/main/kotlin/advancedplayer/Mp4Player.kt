package advancedplayer

import shared.Hello

class Mp4Player: AdvancedMediaPlayer, Hello() {
    override fun playVLC() {
        this.helloFunction()
    }

    override fun playMP4() {
        this.helloFunction()
    }
}