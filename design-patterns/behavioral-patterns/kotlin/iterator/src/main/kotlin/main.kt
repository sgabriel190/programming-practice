/**
 * ITERATOR PATTERN
 * -> Is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying
 * representation (list, stack tree, etc).
 * -> The main idea of the iterator pattern is to extract the traversal behavior of a collection into a separate
 * object called an iterator.
 */
fun main(){
    val network: SocialNetwork = Facebook()
    val spammer = SocialSpammer()
    val iteratorFriends = network.createFriendsIterator(100)
    val iteratorCoworkers = network.createCoworkersIterator(101)

    spammer.send(iteratorCoworkers, "dummy")
    spammer.send(iteratorFriends, "dumi")
}