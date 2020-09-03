class FacebookIterator(
    private val facebook: Facebook,
    private val profileId: Int,
    private val type: String,
    private val cache: MutableList<Profile>
): ProfileIterator {

    private var currentPosition: Int = -1

    override fun getNext(): Profile? {
        if(hasMore()){
            currentPosition++
            return cache[currentPosition]

        }
        return null
    }

    override fun hasMore(): Boolean = cache.size - 1 > currentPosition

}