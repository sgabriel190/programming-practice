class Facebook: SocialNetwork {
    private val cacheFriends = mutableListOf(
        Profile(1),
        Profile(222),
        Profile(1001),
        Profile(302),
        Profile(2041),
        Profile(5440),
        Profile(32555)
    )

    private val cacheCoworkers = mutableListOf(
        Profile(1),
        Profile(2),
        Profile(100),
        Profile(30),
        Profile(20),
        Profile(50),
        Profile(32)
    )
    override fun createFriendsIterator(profileId: Int): ProfileIterator {
        return FacebookIterator(this, profileId, "friends", cacheFriends)
    }

    override fun createCoworkersIterator(profileId: Int): ProfileIterator {
        return FacebookIterator(this, profileId, "coworkers", cacheCoworkers)
    }

}