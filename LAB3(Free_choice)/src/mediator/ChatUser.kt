package mediator

import memento.Memento
import memento.Originator
import User
import memento.CareTaker

class ChatUser(val mediator: ChatMediator, careTaker: CareTaker, override val name: String): Originator(careTaker), User {

    private var memento: Memento
        get() = createMemento()

    init {
        memento = createMemento()
    }

    fun send(msg: String) {
        state = msg
        println("${name}: Sending Message= ${msg}")
        mediator.sendMessage(msg, this)
    }

    fun receive(msg: String) {
        println("${name}: Message received: ${msg}")
    }

    fun restore(index: Int) {
        restore(careTaker.restore(this, index))
        println("${name}: Rollback to message: ${state}")
    }

    fun saveState() {
        careTaker.saveState(this, memento)
    }

    override fun drinkCoffee() {
        println("${name} drinks coffee")
    }
}