## LAB Nr.1 Creational Patterns

In this laboratory work was used 3 creational patterns 'Abstract Factory',
'Factory', 'Builder'.

1. #### Abstract Factory

 Abstract factory pattern is implemented by 'AbstractPlantFactory' class, and
it has a static method 'createFactory', which is embedded in companion object,
because 'Kotlin' doesn't support static class members, and replace it by
companion object.

 Method 'createFactory' returns a specific concrete factory depending of generic
parameter 'T' by checking class type of run-time passed parameter. Determining
which concrete factory will be returned is performed in the 'when' selection control mechanism which is 'Kotlin' analogue of switch.

2. #### Concrete Factory

 Concrete factory is defined by 'PlantFactory' abstract class and is implemented
by 'AppleFactory' and 'OrangeFactory' which override 'makePlant' method behavior.
Method 'makePlant' returns instance of Plant class which is created using 'PlantBuilder'.

3. #### Builder

 Builder pattern is implemented by 'PlantBuilder' inner class of 'Plant' class, it
 set values of 'Plant' and gives possibility to model Plant object. After Plant
 object is created, there is no direct access to modify it values.
