package entities

enum class Type {
  ACOUSTIC,
  ELECTRIC;

  override fun toString(): String = when (this) {
    ACOUSTIC -> "Acoustic"
    ELECTRIC -> "Electric"
  }
}