package mediator

class ChatUser(val mediator: ChatMediator, val name: String){
    fun send(msg: String) {
        println("${name}: Sending Message= ${msg}")
        mediator.sendMessage(msg, this)
    }

    fun receive(msg: String) {
        println("${name}: Message received: ${msg}")
    }
}