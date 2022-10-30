import entities.InstrumentType

class Instrument(
  private val serialNumber: String,
  private val price: Double,
  private val instrumentSpec: InstrumentSpec,
  private val instrumentType: InstrumentType
) {
  fun getSerialNumber() = serialNumber
  fun getPrice() = price
  fun getSpec() = instrumentSpec
  fun getInstrumentType() = instrumentType
}