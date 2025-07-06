# Sprint 1 Task 06: Generics

## Level 1

###  Exercise 1

Create a class called `NoGenericMethods` that stores three arguments of the same type, along with methods to store and retrieve those objects, and a constructor to initialize the three values.

Make sure that the arguments can be passed in any order to the constructor.

---

###  Exercise 2

Create a class called `Persona` with the attributes:
- `name`
- `surname`
- `age`

Then, create a class called `GenericMethods` with a **generic method** that accepts three generic arguments. This method should simply **print the arguments it receives**.

In the `main()` method of the main class, call the generic method with different types of parameters.

> Example: an object of the `Persona` class, a `String`, and a primitive type.

This shows that you can pass **any type of parameter in any order**.

---

## Level 2

###  Exercise 1

Modify the previous exercise so that **one of the arguments** of the generic method is **not generic**.

---

###  Exercise 2

Modify the previous exercise so that the arguments of the generic method are received as a **list of variable arguments** (`varargs`).

---

##  Development

- **JDK**: 17
- **IDE**: IntelliJ IDEA
