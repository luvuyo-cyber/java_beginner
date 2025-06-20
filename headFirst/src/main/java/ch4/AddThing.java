/*
 * This file contains the source code for the 'AddThing' class.
 * It demonstrates how to define a simple class with instance variables
 * and a method that performs a calculation and returns a value.
 */
package ch4; // Declares the package for this class, organizing it within a larger project.

class AddThing { // Defines a class named 'AddThing'. This is a blueprint for creating objects
  // that can perform an addition operation.

  int a; // Declares an instance variable 'a' of type int.
  // Each 'AddThing' object will have its own 'a' value.
  // It's not explicitly initialized here, so it will default to 0 for int.

  int b = 12; // Declares an instance variable 'b' of type int and initializes it to 12.
  // Each 'AddThing' object will have its own 'b' value, starting at 12.

  public int add() { // Defines a public method named 'add'.
    // 'public' means it can be called from outside this class.
    // 'int' indicates that this method will return an integer value.

    int total = a + b; // Declares a local variable 'total' of type int.
    // It calculates the sum of the instance variables 'a' and 'b',
    // and assigns the result to 'total'.
    // Note: 'a' will be 0 if not set externally, so total will be 0 + 12 = 12 initially.

    return total; // Returns the calculated 'total' value.
    // This is the value that will be received by whatever code calls this 'add()' method.
  } // Ends the add method.
} // Ends the AddThing class.

/*
 * Summary of Concepts:
 * This program demonstrates fundamental **Object-Oriented Programming (OOP)** and **Java** concepts:
 *
 * 1.  **Classes**: Defining a blueprint (`AddThing`) for creating objects.
 * 2.  **Instance Variables (Attributes)**: Declaring variables (`a`, `b`) that hold the state unique to each object.
 * It also shows a default initialization for `b`.
 * 3.  **Methods (Behaviors)**: Defining an action (`add()`) that an object can perform.
 * 4.  **Return Types**: Specifying the type of value a method will send back (`public int add()`).
 * 5.  **Return Statement**: Using `return` to send a value back from a method.
 * 6.  **Local Variables**: Declaring variables (`total`) that exist only within a method.
 * 7.  **Arithmetic Operations**: Performing addition (`a + b`).
 * 8.  **Basic Program Structure**: Using a `package` and a `class` definition.
 */
