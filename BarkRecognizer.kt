class BarkRecognizer(
    private val door: DogDoor
) {
  fun recognize(bark: String) = door.open()
}