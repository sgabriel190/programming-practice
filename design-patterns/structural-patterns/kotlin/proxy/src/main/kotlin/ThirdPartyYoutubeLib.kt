interface ThirdPartyYoutubeLib {
    fun listVideos(): String
    fun getVideoInfo(id: Int): String
    fun donwloadVideo(id: Int)
}