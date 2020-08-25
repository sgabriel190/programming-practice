import videoframework.codec.CodecFactory
import videoframework.codec.MPEG4CompressionCodec
import videoframework.codec.OggCompressionCodec
import videoframework.file.AudioMixer
import videoframework.file.BitrateReader
import videoframework.file.VideoFile

class VideoConverter {
    fun convert(filename: String, format: String){
        val videoFile = VideoFile(filename)
        val sourceCodec =  CodecFactory().extract(videoFile)
        val destinationCodec = if(format == "mp4") MPEG4CompressionCodec() else OggCompressionCodec()

        val buffer = BitrateReader().read(filename)
        var result = BitrateReader().convert(buffer, destinationCodec.javaClass.name)
        AudioMixer().fix(result)
    }
}