fun main(){
    /**
     * Kotlin specific way to find an object in a collection.
     */
    val emailList = listOf("abv@example.com", "1234@example.com", "aabbxx@example.com", "abc@example.com")
    val emailToBeSearched1 = "abc@example.com"
    val emailToBeSearched2 = "kdsjbfsa@example.com"

    if(emailToBeSearched1 in emailList){
        println("$emailToBeSearched1 has been found in the email list.")
    }
    else{
        println("$emailToBeSearched1 has not been found in the email list.")
    }

    if(emailToBeSearched2 in emailList){
        println("$emailToBeSearched2 has been found in the email list.")
    }
    else{
        println("$emailToBeSearched2 has not been found in the email list.")
    }
}