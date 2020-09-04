class AuthenticationDialog(
    private var title: String
): Mediator {
    var loginOrRegisterChkBx: Checkbox = Checkbox(this)
    private val loginUsername: Textbox = Textbox(this)
    private val loginPassword: Textbox = Textbox(this)
    private val registrationUserName: Textbox = Textbox(this)
    private val registrationPassword: Textbox = Textbox(this)
    private val registrationEmail: Textbox = Textbox(this)
    var okBtn: Button = Button(this)
    private val cancelBtn: Button = Button(this)

    override fun notify(sender: Component, event: String) {
        println("Event receive from ${sender.javaClass.name}; \t Event type:$event\n")
        if(sender == loginOrRegisterChkBx && event == "check"){
            title = if (loginOrRegisterChkBx.checked) {
                "Log in"
            } else{
                "Register"
            }
            println("Changed values: title=$title\n\n")
        }
        if(sender == okBtn && event == "click"){
            if(loginOrRegisterChkBx.checked){
                println("Ok button pressed and login action!\n\n")
            }
            else
            {
                println("Ok button pressed and register action!\n\n")
            }
        }

    }

}