# Java Functional Programming Tasks

This project demonstrates how to apply **functional programming** concepts in Java using **lambdas** and **anonymous classes**. The tasks focus on assigning functions to variables, passing functions as parameters, and returning functions from other functions.

## Functional Programming Concepts in Java

Java supports functional programming with the use of **lambdas** and **functional interfaces**. This project covers the following tasks:

### Task 1: Assigning a Function to a Variable

In this task, a function (lambda expression or anonymous class) is assigned to a variable. This allows you to treat functions as first-class citizens, similar to how functional programming works in languages like JavaScript.

### Task 2: Passing a Function as a Parameter

A function is passed as a parameter to another function. This is achieved using functional interfaces, such as `Function<T, R>`, `Consumer<T>`, or custom interfaces, allowing higher-order functions.

### Task 3: Returning a Function from a Function

A function is returned from another function, demonstrating higher-order functions. This is useful for generating dynamic behavior based on inputs or context.

## Key Concepts

1. **Lambdas**:
    - A lambda expression is a concise way to express an instance of a functional interface. It allows writing cleaner and more readable code for implementing single-method interfaces (functional interfaces).

2. **Anonymous Classes**:
    - Before Java 8, anonymous classes were used to achieve similar behavior. They allow creating instances of interfaces or abstract classes on the fly, especially for event listeners or callbacks.

## Examples Covered

1. **Assigning Function to a Variable**:
    - A function is assigned to a variable using both a **lambda** and an **anonymous class**.

2. **Passing Function as Parameter**:
    - A function is passed as an argument to another function, leveraging Java's functional interfaces, like `Function`, `Consumer`, or custom ones.

3. **Returning a Function from a Function**:
    - A function returns another function, demonstrating how dynamic behavior can be achieved using functional constructs.

## Technologies Used

- Java 8 (or higher) for lambdas and functional interfaces
- IntelliJ IDEA or any preferred IDE for writing and running Java code

## Setup and Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/MrNewbie-KH/java-functional-programming
