package entities

enum class InstrumentType {
    GUITAR,
    MANDOLIN;

    override fun toString(): String = when (this) {
        GUITAR -> "Guitar"
        MANDOLIN -> "Mandolin"
    }
}