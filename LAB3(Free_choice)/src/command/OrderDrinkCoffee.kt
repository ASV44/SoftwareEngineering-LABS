package command

import User

class OrderDrinkCoffee(val user: User) : OrderCommand {
    override fun execute() = user.drinkCoffee()
}