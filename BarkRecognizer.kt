class BarkRecognizer(
    private val door: DogDoor
) {
  fun recognize(otherBark: Bark) {
    for (bark in door.getAllowedBarks()) {
      if (otherBark.equals(bark)) return door.open()
    }
  }
}