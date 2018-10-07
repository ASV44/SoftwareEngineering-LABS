fun main(args: Array<String>) {
    val applePlantFactory = AbstractPlantFactory.createFactory<ApplePlant>()
    val orangePlantFactory = AbstractPlantFactory.createFactory<OrangePlant>()

    val applePlant = applePlantFactory.makePlant()
    val orangePlant = orangePlantFactory.makePlant()

    println("Created plant: $applePlant")
    println("Created plant: $orangePlant").also{println()}

    applePlant.showPlantDetails().also{println()}
    orangePlant.showPlantDetails()
}