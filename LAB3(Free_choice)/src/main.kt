import command.CommandProcessor
import command.OrderNormalCoffee
import command.OrderDrinkCoffee
import command.OrderEnhacedCoffee
import decorator.EnhancedCoffeeMachine
import decorator.NormalCoffeeMachine
import mediator.ChatMediator
import mediator.ChatUser
import memento.CareTaker

fun main() {
    val careTaker = CareTaker()

    val mediator = ChatMediator()

    val john = ChatUser(mediator, careTaker, "John")
    val mary = ChatUser(mediator, careTaker, "Mary")

    with(mediator) {
        addUser(john)
        addUser(mary)
    }

    john.send("Hi everyone!")
    mary.send("Hi John!")
    john.saveState()

    john.send("New message #1")
    john.send("New message #2")
    mary.send("New message #1")
    john.saveState()
    mary.saveState()

    mary.send("New message #2")
    mary.send("New message #3")
    mary.saveState()

    john.restore(0)
    john.restore(1)
    mary.restore(0)
    mary.restore(1)

    val normalMachine = NormalCoffeeMachine()
    val enhancedMachine = EnhancedCoffeeMachine(normalMachine)

    CommandProcessor()
        .addToQueue(OrderNormalCoffee(normalMachine))
        .addToQueue(OrderEnhacedCoffee(enhancedMachine))
        .addToQueue(OrderDrinkCoffee(john))
        .addToQueue(OrderDrinkCoffee(mary))
        .processCommands()
}