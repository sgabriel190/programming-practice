package advancedplayer

import shared.Hello

class VlcPlayer: AdvancedMediaPlayer, Hello() {
    override fun playVLC() {
        this.helloFunction()
    }

    override fun playMP4() {
        this.helloFunction()
    }
}