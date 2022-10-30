import entities.InstrumentType

class Inventory(
        private val instruments: MutableList<Instrument> = mutableListOf<Instrument>()
) {

    fun addInstrument(serialNumber: String, price: Double, spec: InstrumentSpec, type: InstrumentType) =
        Instrument(
                serialNumber = serialNumber,
                price = price,
                instrumentSpec = spec,
                instrumentType = type
        ).let { this.instruments.add(it) }

    fun get(serialNumber: String): Instrument? {
        for (inst in this.instruments) {
            if (inst.getSerialNumber() == serialNumber) return inst
        }
        return null
    }

    fun search(spec: InstrumentSpec): MutableList<Instrument> {
        val matchingInstrument = mutableListOf<Instrument>()

        for (inst in this.instruments) {
            if (spec.match(inst.getSpec())) matchingInstrument.add(inst)
        }
        return matchingInstrument
    }

}