# 3.2 Rick's Stringed Instruments

## Introduction

Rick's guitar shop now also wants to sell different types of musical instruments (Mandolin for example).

## Problems with the previous solution

1. Need to create a search method for every different type of instrument when added.
2. `Guitar` and `Mandolin` classes are only empty constructors providing nothing. Plus have to create such class for
   every new instrument we add.
3. Have to modify `addInstrument()` method for any new instrument we add.

### Things to note

`search()` method takes in `GuitarSpec`, `MandolinSpec` and not `InstrumentSpec`. We __should be coding to interface and
not implementation__

> `Instrument` was earlier made abstract because each instrument type was represented by its own subclass (They shared a common property).

> But generally, subclasses are created because their __behaviour__ is different from their super class! Guitars and Mandolins have different properties but not behaviours!

---

## Solution 1

Make `InstrumentSpec` not Abstract. That way, we can pass it as an argument in the `search()` method.

### Advantages

1. `search()` is now being coded to interface and not implementation.
2. Can return different instruments (Guitars and Mandolins) if the specs match.

### Disadvantages

1. `addInstrument()` is still being coded to implementation. So would have to update it whenever we add a new
   instrument.
