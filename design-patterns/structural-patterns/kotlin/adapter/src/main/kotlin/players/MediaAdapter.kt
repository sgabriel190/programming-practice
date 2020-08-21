package players

import advancedplayer.AdvancedMediaPlayer
import shared.Hello

class MediaAdapter(private val player: AdvancedMediaPlayer) : MediaPlayer, Hello() {

    override fun play() {
        player.playMP4()
        player.playVLC()
    }
}