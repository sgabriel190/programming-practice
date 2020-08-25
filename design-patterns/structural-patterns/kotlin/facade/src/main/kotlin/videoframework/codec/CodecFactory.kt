package videoframework.codec

import videoframework.file.VideoFile

class CodecFactory {
    fun extract(file: VideoFile): String{
        println("${this.javaClass.name}-> extract the video codec of the file.")
        return "mkv"
    }
}