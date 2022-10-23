# 2.1 Doug's Dog Doors

## Introduction

Doug makes remote controlled dog doors. Using the remote, the customer can open/close the dog doors.

## Problem with the previous solution

The door when opened with the bark recognizer will continue to remain open and not close.

## Possible solutions

1. Repeat the code that we used for the remote (add timer) to the bark recognizer.
2. But we want to prevent code duplication. Closing of door should be a property of the door and not of anything else.
