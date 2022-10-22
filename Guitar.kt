class Guitar(
    private val serialNumber: String,
    private val price: Double,
    private val type: String,
    private val model: String,
    private val build: String,
) {
  fun getSerialNumber(): String = serialNumber
  fun getPrice(): Double = price
  fun getType(): String = type
  fun getModel(): String = model
  fun getBuild(): String = build
}