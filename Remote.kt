class Remote(
    private val door: DogDoor
) {
  fun pressButton() {
    if (door.isOpen()) return door.close()
    return door.open()
  }
}