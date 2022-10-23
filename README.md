# 2.1 Doug's Dog Doors

## Introduction

Doug makes remote controlled dog doors. Using the remote, the customer can open/close the dog doors.

## Problems with the initial solution

1. Customers only press the door once for the dog to come and go.
2. This led to the door being left open even when the dog is inside.
3. This led to various other animals like rabbits entering the house as well.

## Things to Note

1. Although there's nothing really wrong with our implementation, we failed to exactly capture the customer's requirements.
2. We need to think about alternate paths that the customer might take to test all edge cases.

>> Usecse - describes __What__ the system needs to accomplish to achieve a __specific goal__ in a __specific scenario__.

## Usecases

1. __Clear Value__ : what it does to add value to the system
2. __Start and Stop__ : something to indicate when the process starts and stops
3. __External Initiator__ : something outside the system which initiates the usecase

## Requirements after noting down the usecase

1. Customer want just one button to open and close door - toggle (already met requirement)
2. The door should close automatically when open after some time
