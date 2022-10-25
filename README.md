# 1.1 Rick's Guitar Studio Shop

## Introduction

Rick has a guitar shop which has multiple guitars. He had a manual system of writing it all down. But now wants to computerize it all.

## Functional Requirements

1. Ability to add and get guitars
2. Search for a guitar based on its description

## Entities

1. Guitar:
    1. serialNumber (string)
    2. price (string)
    3. model (string)
    4. type (string)
    5. build (string)

## Usecases to implement

1. addGuitar(serialNumber, price, model, type, build)
2. getGuitar(serialNumber)
3. search(Guitar)
