# 1.2 Rick's Guitar Studio Shop

## Introduction

Rick has a guitar shop which has multiple guitars. He had a manual system of writing it all down. But now wants to computerize it all.

---

## Problems with 1.1 approach

Searching is affected due to it not being type or value safe.

### Failure flow

1. Rick added a new guitar to his inventory

```kotlin
Inventory.addGuitar(
    serialNumber = "123",
    price = 150.00,
    type = "electric",
    model = "Fender",
    build = "Alder"
)
```
2. Erin wanted a guitar and searched for it as follows:

```kotlin
Inventory.search(
    Guitar(
        serialNumner = "",
        price = 0.00,
        type = "electric",
        model = "fender",
        build = "Alder"
    )
)
```

3. This query gave the following response:

```kotlin
null
```

### Reasons for failure

The model of guitar that Rick has is `Fender` while the one that Erin gave an input was `fender`.
There was a case mismatch.

---

## Possible Solutions

### Using String comparison

This will work for now. But is not a good solution for scalability.

### Using enums

This will ensure that only a particular entity is allowed to call (type here). 
In all other cases, it will refuse to compile. Hence, give us a value and type safety.

---

## Result

Now when Erin asks for `fender` it will return a compile error. Thus it enforces Erin to use the Enum `FENDER`. Thus making our program value safe.
