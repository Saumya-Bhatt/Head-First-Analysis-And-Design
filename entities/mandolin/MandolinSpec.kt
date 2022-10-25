package entities.mandolin

import InstrumentSpec
import entities.Build
import entities.Model
import entities.Type

class MandolinSpec(
  build: Build,
  type: Type,
  model: Model,

  private val style: Style
) : InstrumentSpec(build, type, model) {
  fun getStyle() = this.style

  override fun match(otherSpec: InstrumentSpec): Boolean {
    if (!super.match(otherSpec)) return false
    if (otherSpec::class != this::class) return false

    val spec = otherSpec as MandolinSpec
    if (spec.style != this.style) return false
    return true
  }
}