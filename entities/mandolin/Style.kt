package entities.mandolin

enum class Style {
  A,
  B;

  override fun toString(): String = when (this) {
    A -> "A"
    B -> "B"
  }
}