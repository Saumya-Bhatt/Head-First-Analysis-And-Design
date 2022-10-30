# Head-First-Analysis-And-Design

Notes from the book - Head First Object-Oriented Analysis and Design

## How to use

The branches are numbered according to the manner they should be read. If that doesn't help, the index given below
points to various topics mentioned.

## Index

### 1. Introduction to OOA&D

__Example Design__ : `Rick's Guitar Shop`

* First get requirements from customer and make a working model
* Use OO concepts to make it re-useable and flexible
* Delegate functionalities to make it maintainable

1.1 [Defining the problem](https://github.com/Saumya-Bhatt/Head-First-Analysis-And-Design/tree/1.1-ricks-guitar-shop) <br>
1.2 [Making it type safe using enums](https://github.com/Saumya-Bhatt/Head-First-Analysis-And-Design/tree/1.2-ricks-guitar-shop) <br>
1.3 [Updating functional requirements](https://github.com/Saumya-Bhatt/Head-First-Analysis-And-Design/tree/1.3-ricks-guitar-shop) <br>
1.4 [Encapsulating parts that change](https://github.com/Saumya-Bhatt/Head-First-Analysis-And-Design/tree/1.4-ricks-guitar-shop)

---

### 2. Requirements, Usecases and Textual Analysis

__Example Design__ : `Doug's Dog Doors`

* First get the list of requirements from the customer
* From that prepare the usecases. Each usecase must achieve a singular goal and should have 3 properties.
* Once usecases are defined, work on refining the requirements.
* Keep in mind the happy and the alternate paths, both of which should lead to the same end goal.
* Single usecase can have multiple scenarios as long as they have same end point.

2.1 [Defining the problem](https://github.com/Saumya-Bhatt/Head-First-Analysis-And-Design/tree/2.1-dougs-dog-doors) <br>
2.2 [Refining solution according to listening to requirements](https://github.com/Saumya-Bhatt/Head-First-Analysis-And-Design/tree/2.2-dougs-dog-doors) <br>
2.3 [Requirements updated. Update the usecase](https://github.com/Saumya-Bhatt/Head-First-Analysis-And-Design/tree/2.3-dougs-dog-door) <br>
2.4 [Encapsulating parts that might change](https://github.com/Saumya-Bhatt/Head-First-Analysis-And-Design/tree/2.4-dougs-dog-doors)

* Perform a **textual analysis** on your usecase to identify which nouns are objects and the verbs being the methods the
  objects should implement.
* Update the class diagrams with associations.
* Identify which flow could be a different usecase on its own.

2.4.1 [Identifying a new usecase. Solution 1 using strings](https://github.com/Saumya-Bhatt/Head-First-Analysis-And-Design/tree/2.4.1-dougs-dog-doors) <br>
2.4.2 [Identifying a new usecase. Solution 2 using objects](https://github.com/Saumya-Bhatt/Head-First-Analysis-And-Design/tree/2.4.2-dougs-dog-doors) <br>
2.4.3 [Performing Textual Analysis](https://github.com/Saumya-Bhatt/Head-First-Analysis-And-Design/tree/2.4.2-dougs-dog-doors)

---

### 3. Flexible design using OO principles

__Example Design__ : `Rick's Stringed instruments`

* Encapsulate what varies
* Code to interface, not implementation
* Each class in application should have only 1 reason to change.

3.1 [Using encapsulation](https://github.com/Saumya-Bhatt/Head-First-Analysis-And-Design/tree/3.1-ricks-stringed-instruments) <br>
3.2 [Analyzing where to apply OO design](https://github.com/Saumya-Bhatt/Head-First-Analysis-And-Design/tree/3.2-ricks-stringed-instruments)

---
