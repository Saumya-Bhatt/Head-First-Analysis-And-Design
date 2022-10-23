import java.util.Timer
import java.util.TimerTask
import kotlin.concurrent.timerTask

class Remote(
    private val door: DogDoor
) {
  fun pressButton() {
    if (door.isOpen()) return door.close()
    else {
      door.open()
    }
  }
}