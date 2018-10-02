interface Plant

class OrangePlant : Plant

class ApplePlant : Plant

abstract class PlantFactory {
    abstract fun makePlant(): Plant
}

class AppleFactory : PlantFactory() {
    override fun makePlant(): Plant = ApplePlant()
}

class OrangeFactory : PlantFactory() {
    override fun makePlant(): Plant = OrangePlant()
}