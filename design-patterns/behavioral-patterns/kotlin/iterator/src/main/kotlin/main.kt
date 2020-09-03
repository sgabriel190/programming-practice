/**
 * ITERATOR PATTERN
 * -> Is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying
 * representation (list, stack tree, etc).
 * -> The main idea of the iterator pattern is to extract the traversal behavior of a collection into a separate
 * object called an iterator.
 * -> Use the Iterator pattern when your collection has a complex data structure under the hood, but you want
 * to hide its complexity from clients (either for convenience or security reasons).
 * -> Use the pattern to reduce duplication of the traversal code across your app.
 * -> Use the Iterator when you want your code to be able to traverse different data structures or when types of
 * these structures are unknown beforehand.
 */
fun main(){
    val network: SocialNetwork = Facebook()
    val spammer = SocialSpammer()
    val iteratorFriends = network.createFriendsIterator(100)
    val iteratorCoworkers = network.createCoworkersIterator(101)

    spammer.send(iteratorCoworkers, "dummy")
    spammer.send(iteratorFriends, "dumi")
}