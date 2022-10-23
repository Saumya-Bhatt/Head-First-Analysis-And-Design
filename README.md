# 2.1 Doug's Dog Doors

## Introduction

Doug makes remote controlled dog doors. Using the remote, the customer can open/close the dog doors.

## Requirements Updated

1. We now have to recognize when the dog barks.
2. Depending on that, we have to open the door.
3. This will be the primary flow from now on.

## Usecase

Note we can go directly from 6-7. The substeps between them is not an alternate flow. It is an edge case.

| Happy / Main Flow                                    | Alternate Flow                             |
|------------------------------------------------------|--------------------------------------------|
| 1. Dog barks                                         |                                            |
| 2. Bark recognizer hears a bark                      | 2.1 User hears a bark                      |
| 3. Bark recognizer sends request to open the door    | 3.1 User presses button to open the door   |
| 4. Dog door open                                     |                                            |
| 5. Dog goes outside                                  |                                            |
| 6. Dog does his business                             |                                            |
| _6.1 Door shuts automatically_                       |                                            |
| _6.2 Dog barks to be let in_                         |                                            |
| _6.3 Bark recognizer hears the bark_                 | 6.3.1 User hears the bark                  |
| _6.4 Bark recognizer sends request to open the door_ | 6.4.1 User presses button to open the door |
| _6.5 Dog door opens again_                           | |
| 7. Dog goes back inside                              |                                            |
| 8. Dog door shuts close                              |                                            |

## Testing

```kotlin
fun main() {
  val door = DogDoor()
  val remote = Remote(door)
  val barkRecognizer = BarkRecognizer(door)
}
```
