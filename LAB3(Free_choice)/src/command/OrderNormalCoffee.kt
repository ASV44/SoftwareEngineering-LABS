package command

import decorator.NormalCoffeeMachine

class OrderNormalCoffee(val coffee: NormalCoffeeMachine) : OrderCommand {
    override fun execute() = coffee.makeSmallCoffee()
}