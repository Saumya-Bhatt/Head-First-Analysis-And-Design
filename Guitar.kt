import entities.Build
import entities.GuitarSpec
import entities.Model
import entities.Type

class Guitar(
    private val serialNumber: String,
    private val price: Double,
    private val guitarSpec: GuitarSpec
) {
  fun getSerialNumber(): String = serialNumber
  fun getPrice(): Double = price
  fun getGuitarSpec(): GuitarSpec = guitarSpec
}