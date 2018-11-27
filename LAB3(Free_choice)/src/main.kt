fun main() {
    val mediator = ChatMediator()
    val john = ChatUser(mediator, "John")

    with(mediator) {
        addUser(ChatUser(this, "User1"))
        addUser(ChatUser(this, "User2"))
        addUser(ChatUser(this, "User3"))
        addUser(john)
    }

    john.send("Hi everyone!")
}