interface SocialNetwork {
    fun createFriendsIterator(profileId: Int): ProfileIterator
    fun createCoworkersIterator(profileId: Int): ProfileIterator
}