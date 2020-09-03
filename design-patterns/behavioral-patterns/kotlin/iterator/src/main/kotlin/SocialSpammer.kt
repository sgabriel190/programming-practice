class SocialSpammer {
    fun send(iterator: ProfileIterator, message: String){
        while(iterator.hasMore()){
            val profile = iterator.getNext()
            println("Message $message was sent to ${profile!!.javaClass}")
        }
    }
}