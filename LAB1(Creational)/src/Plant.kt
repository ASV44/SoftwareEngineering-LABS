open class Plant(var name: String = "",
            var species: String = "",
            var genus: String = "",
            var family: String = "",
            var order: String = "") {

    fun showName() = println("Plant name: $name")

    fun showSpecies() = println("Plant species: $species")

    fun showGenus() = println("Plant genus: $genus")

    fun showFamily() = println("Plant family: $family")

    fun showOrder() = println("Plant order: $order")

    fun showPlantDetails() {
        showName()
        showSpecies()
        showGenus()
        showFamily()
        showOrder()
    }

    //Builder:
    open class PlantBuilder(private var plant: Plant) {

        fun setName(name: String): PlantBuilder {
            plant.name = name
            return this
        }

        fun setSpecies(species: String): PlantBuilder {
            plant.species = species
            return this
        }

        fun setGenus(genus: String): PlantBuilder {
            plant.genus = genus
            return this
        }

        fun setFamily(family: String): PlantBuilder {
            plant.family = family
            return this
        }

        fun setOrder(order: String): PlantBuilder {
            plant.order = order
            return this
        }

        fun build(): Plant {
            return plant
        }

    }
}

class OrangePlant : Plant() {
    class OrangePlantBuilder: PlantBuilder(OrangePlant())
}

class ApplePlant : Plant() {
    class ApplePlantBuilder: PlantBuilder(ApplePlant())
}