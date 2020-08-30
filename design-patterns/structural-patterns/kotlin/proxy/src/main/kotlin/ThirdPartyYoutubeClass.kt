class ThirdPartyYoutubeClass: ThirdPartyYoutubeLib {
    override fun listVideos(): String {
        println("[INFO]: Message from ${this.javaClass.name}.listVideos() method.")
        return "Dummy list"
    }

    override fun getVideoInfo(id: Int): String {
        println("[INFO]: Message from ${this.javaClass.name}.getVideoInfo($id: ${id.javaClass.name}) method.")
        return "Dummy video"
    }

    override fun donwloadVideo(id: Int) {
        println("[INFO]: Message from ${this.javaClass.name}.downloadVideo($id: ${id.javaClass.name}) method.")
    }
}