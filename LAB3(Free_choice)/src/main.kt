import mediator.ChatMediator
import mediator.ChatUser
import memento.CareTaker
import memento.Originator

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


    val originator = Originator("initial state")
    val careTaker = CareTaker()
    careTaker.saveState(originator.createMemento())

    originator.state = "State #1"
    originator.state = "State #2"
    careTaker.saveState(originator.createMemento())

    originator.state = "State #3"
    careTaker.saveState(originator.createMemento())

    originator.state = "State #4"
    println("Current State: " + originator.state)

    originator.restore(careTaker.restore(0))
    println("First saved State: " + originator.state)
    originator.restore(careTaker.restore(1))
    println("Second saved State: " + originator.state)
    originator.restore(careTaker.restore(2))
    println("Second saved State: " + originator.state)
}