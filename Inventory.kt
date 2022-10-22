/**
 * Inventory
 *
 * @constructor Create empty Inventory
 */
class Inventory {

  private val guitars = mutableListOf<Guitar>()

  private fun addGuitar(serialNumber: String, price: Double, type: String, model: String, build: String) {
    val newGuitar = Guitar(serialNumber, price, type, model, build)
    guitars.add(newGuitar)
  }

  private fun getGuitar(serialNumber: String): Guitar? {
    for (guitar in guitars) {
      if (guitar.getSerialNumber() == serialNumber) return guitar
    }
    return null
  }

  private fun search(guitar: Guitar): Guitar? {
    for (g in guitars) {
      if (g.getBuild() == guitar.getBuild() &&
          g.getType() == guitar.getType() &&
          g.getModel() == guitar.getModel()) return g
    }
    return null
  }

}