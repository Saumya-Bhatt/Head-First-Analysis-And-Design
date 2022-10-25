# 2.4.2 Doug's Dog Doors

## Introduction

Doug makes remote controlled dog doors. Using the remote, the customer can open/close the dog doors.

## Problem with the previous solution

1. Using a string to represent Bark makes our system tightly coupled.
2. If when we want to give more details to the bark, we would have to make changes to the `BarkRecognizer` and
   the `DogDoor`.

## Using object and delegation

Would be better if we came up with an object representing the Bark

```kotlin
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
```
