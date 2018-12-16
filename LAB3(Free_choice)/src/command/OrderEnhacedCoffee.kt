package command

import decorator.EnhancedCoffeeMachine

class OrderEnhacedCoffee(val coffee: EnhancedCoffeeMachine) : OrderCommand {
    override fun execute() = coffee.makeCoffeeWithMilk()
}