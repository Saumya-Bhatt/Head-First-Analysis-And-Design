class BarkRecognizer(
    private val door: DogDoor
) {
  fun recognize(bark: String) {
    if (door.getAllowedBark().equals(bark)) door.open()
  }
}