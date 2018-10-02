fun main(args: Array<String>) {
    val plantFactory = PlantFactory.createFactory<OrangePlant>()
    val plant = plantFactory.makePlant()
    println("Created plant: $plant")
}