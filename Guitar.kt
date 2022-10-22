import entities.Build
import entities.Model
import entities.Type

class Guitar(
    private val serialNumber: String,
    private val price: Double,
    private val type: Type,
    private val model: Model,
    private val build: Build,
) {
  fun getSerialNumber(): String = serialNumber
  fun getPrice(): Double = price
  fun getType(): Type = type
  fun getModel(): Model = model
  fun getBuild(): Build = build
}