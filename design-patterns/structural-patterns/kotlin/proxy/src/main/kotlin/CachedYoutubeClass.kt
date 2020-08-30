class CachedYoutubeClass: ThirdPartyYoutubeLib {
    private val service = ThirdPartyYoutubeClass()
    private var listCache = ""
    private var videoCache = ""
    private var needReset = false

    override fun listVideos(): String {
        if( listCache.isEmpty() || needReset ){
            listCache = service.listVideos()
        }
        return listCache
    }

    override fun getVideoInfo(id: Int): String {
        if (videoCache.isEmpty() || needReset){
            videoCache = service.getVideoInfo(id)
        }
        return videoCache
    }

    override fun donwloadVideo(id: Int) {
        service.donwloadVideo(id)
    }
}