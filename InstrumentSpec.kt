import entities.Build
import entities.Model
import entities.Type

abstract class InstrumentSpec(
  private val build: Build,
  private val type: Type,
  private val model: Model
) {
  fun getType(): Type = type
  fun getModel(): Model = model
  fun getBuild(): Build = build

  open fun match(otherSpec: InstrumentSpec): Boolean {
    return (otherSpec.build != this.build || otherSpec.type != this.type || otherSpec.model != this.model)
  }

}