# 1.4 Rick's Guitar Studio Shop

## Introduction

Rick has a guitar shop which has multiple guitars. He had a manual system of writing it all down. But now wants to
computerize it all.

---

## Encapsulating the part that might potentially change in the future

1. For `search` right now, we are sending the whole `Guitar` object.
2. This is not required as the customer only wants to get the guitar by its specifications.
3. So we can keep a pointer to the guitar (serial number and price which are unique to the guitar) in one place and
   encapsulate the other specifications.
4. This also helps when in the future, Rick wants to add new specification, he only has to change the `guitarSpecs`
   file, thus reducing code duplication.

---

## Changes to be made

### Create Guitar Specs class and add it to Guitar entity

```kotlin
data class guitarSpecs(
    val build: Build,
    val model: Model,
    val type: Type,
)
```

### Update the search function

```kotlin
private fun search(guitarSpec: GuitarSpec): MutableList<Guitar>
```