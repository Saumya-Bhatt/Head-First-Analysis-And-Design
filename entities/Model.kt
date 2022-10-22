package entities

enum class Model {
  FENDER,
  MARTIN,
  GIBSON;

  override fun toString() = when (this) {
    FENDER -> "Fender"
    MARTIN -> "Martin"
    GIBSON -> "Gibson"
  }
}