class ChatMediator {
    private val users: MutableList<ChatUser> = ArrayList()

    fun sendMessage(msg: String, user: ChatUser) {
        users.forEach {
            if (it !== user) {
                it.receive(msg)
            }
        }
    }

    fun addUser(user: ChatUser) {
        users.add(user)
    }
}