import advancedplayer.VlcPlayer
import players.AudioPlayer
import players.MediaAdapter
import players.MediaPlayer

fun main(){
    val mediaPlayer: MediaPlayer = AudioPlayer()
    val adaptorMediaPlayer = MediaAdapter(VlcPlayer())

    mediaPlayer.play()
    adaptorMediaPlayer.play()
}