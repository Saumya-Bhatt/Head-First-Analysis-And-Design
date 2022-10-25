package entities.guitar

import InstrumentSpec
import entities.Build
import entities.Model
import entities.Type

class GuitarSpec(
  build: Build,
  type: Type,
  model: Model,

  private val numString: Int
) : InstrumentSpec(build, type, model) {
  fun getNumStrings() = this.numString

  override fun match(otherSpec: InstrumentSpec): Boolean {
    if (!super.match(otherSpec)) return false
    if (otherSpec::class != this::class) return false

    val spec = otherSpec as GuitarSpec
    if (spec.numString != this.numString) return false
    return true
  }
}