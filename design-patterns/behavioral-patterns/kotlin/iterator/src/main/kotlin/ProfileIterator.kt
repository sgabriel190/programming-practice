interface ProfileIterator {
    fun getNext(): Profile?
    fun hasMore(): Boolean
}