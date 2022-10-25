import java.util.*
import kotlin.concurrent.timerTask

class DogDoor(
    private var open: Boolean = false,

    private var allowedBark: Bark
) {

  fun setAllowedBark(bark: Bark) {
    this.allowedBark = bark
  }

  fun getAllowedBark() = this.allowedBark

  fun open() {
    this.open = true

    /*
    Schedule a task which will run after 500 milliseconds
    The task will close the door and cancel the timer so that we don't go in a loop.
    The door will now always close
     */
    val timer = Timer()
    timer.schedule(timerTask {
      close()  // even if we add new device, the door will always close
      timer.cancel()
    }, 5000)
  }

  fun close() {
    this.open = false
  }

  fun isOpen() = this.open
}