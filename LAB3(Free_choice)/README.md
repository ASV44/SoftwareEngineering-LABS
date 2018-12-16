## LAB Nr.3 Free choice of 4 patterns

In this laboratory work was used 3 Behavioral, "Command", "Mediator" and "Memento" patterns, and 1 Structural, 
"Decorator" pattern.

1. #### "Command

Command pattern is implemented in command directory, and its main class is "CommandProcessor" which has a list of "OrderCommands",
abstraction of commands to be executed. "CommandProcessor" can execute 2 actions, add to queue and process the added commands.
Process of added commands is performed by calling for each command execute method. For command pattern I've crated 3 implementation
of "OrderCommands" abstraction, which are "OrderNormalCoffee", "OrderEnhacedCoffee" and "OrderDrinkCoffee", which executes actions
of ordering normal coffee, ordering enhaced coffee and, action of drinking coffee by user.

2. #### Mediator
Mediator pattern is implemented by 2 classes "ChatMediator" and "ChatUser". Class "chatMediator" represents part which perform
communication between instances of "ChatUser" classes. Mediator contains a list of users between which communication is performed,
when some user user whant to send message to all other users, that instance calls "sendMessage" method of mediator, and all users
which are presented in list of mediator user are notifyed.

3. #### Memento
Memento is implemented by "Memento", "Originator" and "CareTaker" classes, "Memento" represents data class which only holds
information which should be saved at current state, "CareTaker" contains a hash-map of user to list of specific mementos, in
this way is stored each list of mementos for a specific user, also "CareTaker" is responsable for saving and restoring memento,
"Originator" is responsable for managing state and mementos for a specific user, in this way state from memento is restored to
User, also class "ChatUser" inherits from "Originator".

4. #### Decorator

 Decorator pattern is implemented by "CoffeeMachine" interface, "NormalCoffeeMachine" and "EnhancedCoffeeMachine" classes. 
 Interface "CoffeeMachine" represents basic functionality which should coffee machine implements, and this is basic "makeSmallCoffee" 
 and "makeLargeCoffee" functions. 
 Class "NormalCoffeeMachine" implements "CoffeeMachine" interface by implemanting basic behaviour for "makeSmallCoffee" and "makeLargeCoffee" 
 and just prints this infrmation in standart output.
 Class "EnhancedCoffeeMachine" represents decorator for "CoffeeMachine" objects, and it implements function "makeLargeCoffee"
 by adding new stage at coffee preparation and also uses basic behaviour of standart coffee machine, but it also introduce new 
 method "makeCoffeeWithMilk" which using standart bahaviour adds new behaviour to "makeSmallCoffee" method from "NormalCoffeeMachine"
