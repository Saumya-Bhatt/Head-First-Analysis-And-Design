package entities

enum class Build {
  WOOD,
  PLASTIC;

  override fun toString(): String = when (this) {
    WOOD -> "Wood"
    PLASTIC -> "Plastic"
  }
}