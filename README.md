# 2.4.1 Doug's Dog Doors

## Introduction

Doug makes remote controlled dog doors. Using the remote, the customer can open/close the dog doors.

## New usecase to be added

1. We want the door to recognize the bark of only the dog which are registered with us.
2. So in the main usecase, where we use the `BarkRecognizer` we would also need to store the bark of that dog.
3. This would involve a new usecase as the end goal of this one would be to store the bark.

## New Usecase would:

1. Store the bark into the `DogDoor`.
2. Use it as a comparison when the dog barks.

## Current Implementation:

Store the bark as a string
