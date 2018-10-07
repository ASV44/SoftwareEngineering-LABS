abstract class PlantFactory {
    abstract fun makePlant(): Plant
}

class AppleFactory : PlantFactory() {
    override fun makePlant(): Plant =
            ApplePlant.ApplePlantBuilder()
                    .setName("Apple")
                    .setSpecies("Malus pumila")
                    .setGenus("Malus")
                    .setFamily("Rosaceae")
                    .setOrder("Rosales")
                    .build()
}

class OrangeFactory : PlantFactory() {
    override fun makePlant(): Plant = OrangePlant.OrangePlantBuilder()
            .setName("Orange")
            .setSpecies("Citrus × sinensis")
            .setGenus("Citrus")
            .setFamily("Rutaceae")
            .setOrder("Sapindales")
            .build()
}