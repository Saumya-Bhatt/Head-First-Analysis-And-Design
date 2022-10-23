class DogDoor(
    private var open: Boolean = false
) {
  fun open() {
    this.open = true
  }

  fun close() {
    this.open = false
  }

  fun isOpen() = this.open
}