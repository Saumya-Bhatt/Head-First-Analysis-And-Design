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

      /*
      Schedule a task which will run after 500 milliseconds
      The task will close the door and cancel the timer so that we don't go in a loop
       */
      val timer = Timer()
      timer.schedule(timerTask {
        door.close()
        timer.cancel()
      }, 5000)
    }
  }
}