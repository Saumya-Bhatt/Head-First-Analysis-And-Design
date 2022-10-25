abstract class Instrument(
  private val serialNumber: String,
  private val price: Double,
  private val instrumentSpec: InstrumentSpec
) {
  fun getSerialNumber() = serialNumber
  fun getPrice() = price
  fun getSpec() = instrumentSpec
}