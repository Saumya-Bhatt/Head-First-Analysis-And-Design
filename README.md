# 2.1 Doug's Dog Doors

## Introduction

Doug makes remote controlled dog doors. Using the remote, the customer can open/close the dog doors.

## Functional Requirements

1. The remote can be used to open and close the dog door.
2. The remote should return the current state of the dog door.

## Entities and Usecases

1. DogDoor
```kotlin
class DogDoor(
    val open:Boolean
) {
  fun open()
  fun close()
  fun isOpen()
}
```
2. Remote
```kotlin
class Remote(
    val door:DogDoor
) {
  fun pressButton() // to toggle door
}
```
