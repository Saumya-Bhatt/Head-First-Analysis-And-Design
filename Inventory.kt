import entities.Build
import entities.Model
import entities.Type
import entities.guitar.Guitar
import entities.guitar.GuitarSpec
import entities.mandolin.Mandolin
import entities.mandolin.MandolinSpec
import java.lang.Exception

class Inventory(
        private val instruments: MutableList<Instrument> = mutableListOf<Instrument>()
) {

    fun addInstrument(serialNumber: String, price: Double, spec: InstrumentSpec) = when (spec::class) {
        Guitar::class -> Guitar(serialNumber, price, spec as GuitarSpec)
        Mandolin::class -> Mandolin(serialNumber, price, spec as MandolinSpec)
        else -> throw Exception("No such specifications exist!")
    }.let { this.instruments.add(it) }

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