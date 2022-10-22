import entities.Build
import entities.GuitarSpec
import entities.Model
import entities.Type

class Inventory {

  private val guitars = mutableListOf<Guitar>()

  private fun addGuitar(serialNumber: String, price: Double, type: Type, model: Model, build: Build) {
    val guitarSpec = GuitarSpec(build, type, model)
    val newGuitar = Guitar(serialNumber, price, guitarSpec)
    guitars.add(newGuitar)
  }

  private fun getGuitar(serialNumber: String): Guitar? {
    for (guitar in guitars) {
      if (guitar.getSerialNumber() == serialNumber) return guitar
    }
    return null
  }

  private fun search(guitarSpec: GuitarSpec): MutableList<Guitar> {
    val matchingResults = mutableListOf<Guitar>()

    for (g in guitars) {
      if (g.getGuitarSpec() == guitarSpec) matchingResults.add(g)
    }
    return matchingResults
  }

}