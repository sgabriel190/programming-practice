package videoframework.file

class VideoFile(private val filename: String) {
    init {
        println("${this.javaClass.name}-> class has been created.")
    }
}