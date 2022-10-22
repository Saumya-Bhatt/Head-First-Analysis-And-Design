package entities

class GuitarSpec(
    private val build: Build,
    private val type: Type,
    private val model: Model
) {
  fun getType(): Type = type
  fun getModel(): Model = model
  fun getBuild(): Build = build
}
