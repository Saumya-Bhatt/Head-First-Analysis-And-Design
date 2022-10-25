class Bark(
    private val bark: String
) {
  fun getSound() = bark

  fun equals(otherBark: Bark): Boolean {
    if (otherBark.javaClass == this.javaClass) {
      return otherBark.bark.lowercase() == this.bark.lowercase()
    }
    return false
  }
}