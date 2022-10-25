package entities.mandolin

import Instrument

class Mandolin(
  serialNumber: String,
  price: Double,
  spec: MandolinSpec
) : Instrument(serialNumber, price, spec) {
}