package entities.guitar

import Instrument

class Guitar(
  serialNumber: String,
  price: Double,
  spec: GuitarSpec
) : Instrument(serialNumber, price, spec) {
}