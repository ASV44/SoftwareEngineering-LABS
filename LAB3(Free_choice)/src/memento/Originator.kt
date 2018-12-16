package memento

open class Originator(val careTaker: CareTaker) {

    open var state: String = ""

    fun createMemento(): Memento {
        return Memento(state)
    }

    open fun restore(memento: Memento) {
        state = memento.state
    }
}

