# 3.3 Rick's Stringed Instruments

## Introduction

Rick's guitar shop now also wants to sell different types of musical instruments (Mandolin for example).

## Problems with the previous solution

1. `Instrument` should be abstract class. As making it a concrete class **and** have subclasses would mean Guitars and Mandolins have different behaviour from Instruments.

## Solution: Get rid of instrument subclasses

1. Subclasses `Guitar` and `Mandolin` offer nothing. Their behaviour is not different from Instrument.
2. So make `Instrument` concrete class.
3. The thing that already differentiates `Guitar` and`Mandolin` are their specs which can be kept as they are.
4. Can also make `InstrumentSpec` non-abstract as their subclasses have different behaviours.
