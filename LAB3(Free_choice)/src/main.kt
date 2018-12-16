import command.CommandProcessor
import command.OrderAddCommand
import command.OrderPayCommand
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

    // non-overridden behaviour
    enhancedMachine.makeSmallCoffee()
    // overriding behaviour
    enhancedMachine.makeLargeCoffee()
    // extended behaviour
    enhancedMachine.makeCoffeeWithMilk()

    CommandProcessor()
        .addToQueue(OrderAddCommand(1L))
        .addToQueue(OrderAddCommand(2L))
        .addToQueue(OrderPayCommand(2L))
        .addToQueue(OrderPayCommand(1L))
        .processCommands()
}