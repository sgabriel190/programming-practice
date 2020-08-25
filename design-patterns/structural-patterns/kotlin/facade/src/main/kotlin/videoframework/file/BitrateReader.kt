package videoframework.file

class BitrateReader {
    fun read(file: String): String{
        println("${this.javaClass.name}-> read the bitrate of ${file}.")
        return "mk4"
    }

    fun convert(buffer: String, newBitrate: String): String{
        println("${this.javaClass.name}-> converted the bitrate of $buffer to ${newBitrate}.")
        return newBitrate
    }
}