/*
 * This file contains the source code for the 'Dog' class and the 'DogTestDrive' class.
 * The 'Dog' class defines a blueprint for dog objects with size-dependent barking behavior,
 * and 'DogTestDrive' demonstrates how to create multiple Dog objects, set their sizes,
 * and then make them bark according to their size.
 */
package ch4; // Declares the package for these classes, helping organize Java files.

// Defines a class named 'Dog'. This acts as a blueprint for creating individual dog objects.
class Dog {
  int size;   // Declares an instance variable 'size' of type int.
  // Each 'Dog' object will have its own 'size' (e.g., in pounds or arbitrary units).

  String name; // Declares an instance variable 'name' of type String.
  // Each 'Dog' object will have its own 'name'. (Though not used in bark() logic here).

  // Defines a method named 'bark'. This method describes the action of barking,
  // and the sound depends on the dog's 'size'.
  void bark() {
    if (size > 60) { // Checks if the dog's size is greater than 60.
      System.out.println("Wooof! Wooof!"); // If true, prints a big dog bark.
    } else if (size > 14) { // If the first condition is false, checks if size is greater than 14.
      System.out.println("Ruff!  Ruff!"); // If true, prints a medium dog bark.
    } else { // If neither of the above conditions is true (size is 14 or less).
      System.out.println("Yip! Yip!"); // Prints a small dog bark.
    }
  } // Ends the bark method.
}

// Defines a class named 'DogTestDrive'. This class contains the 'main' method,
// which is the starting point for demonstrating how to use the 'Dog' class.
class DogTestDrive {
  public static void main(String[] args) { // This is the main method, the program's entry point.

    // --- Create and Set Properties for Dog Objects ---

    // Creates a new 'Dog' object (instance 1) and assigns its reference to 'one'.
    Dog one = new Dog();
    one.size = 70; // Sets the 'size' instance variable for 'one' to 70.

    // Creates a new 'Dog' object (instance 2) and assigns its reference to 'two'.
    Dog two = new Dog();
    two.size = 8; // Sets the 'size' instance variable for 'two' to 8.

    // Creates a new 'Dog' object (instance 3) and assigns its reference to 'three'.
    Dog three = new Dog();
    three.size = 35; // Sets the 'size' instance variable for 'three' to 35.

    // --- Make Dogs Bark ---

    one.bark();   // Calls the 'bark()' method on the 'one' object. (Output: Wooof! Wooof! because size is 70)
    two.bark();   // Calls the 'bark()' method on the 'two' object. (Output: Yip! Yip! because size is 8)
    three.bark(); // Calls the 'bark()' method on the 'three' object. (Output: Ruff!  Ruff! because size is 35)

  } // Ends the main method.
} // Ends the DogTestDrive class.

/*
 * Summary of Concepts:
 * This program demonstrates fundamental **Object-Oriented Programming (OOP)** and **Java** concepts:
 * 1.  **Classes & Objects**:
 * * Defining a blueprint (`Dog`) for objects.
 * * Creating multiple distinct instances (`one`, `two`, `three`) from that blueprint.
 * 2.  **Instance Variables (Attributes)**:
 * * Objects possessing their own **unique state** (`size`, `name`).
 * 3.  **Methods (Behaviors)**:
 * * Defining **actions** (`bark()`) that objects can perform.
 * 4.  **Conditional Logic (`if-else if-else`)**:
 * * The `bark()` method uses conditional statements to alter its behavior (the bark sound)
 * based on the **object's state** (its `size` attribute).
 * 5.  **Object Interaction**:
 * * Setting an object's instance variables (e.g., `one.size = 70`).
 * * Calling methods on an object to trigger its behavior (e.g., `one.bark()`).
 * 6.  **Main Method**: The standard entry point (`public static void main`) for running a Java application.
 */
