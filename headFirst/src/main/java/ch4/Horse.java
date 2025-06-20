/*
 * This file contains the source code for the 'Horse' class.
 * It demonstrates the basic structure of a Java class, including
 * instance variable declarations and the use of access modifiers.
 */
package ch4; // Declares the package for this class. This helps organize Java files
// into logical groups within a larger project.

class Horse { // Defines a class named 'Horse'. This acts as a blueprint for creating
  // individual horse objects.

  // Declares a private instance variable 'height' of type double and initializes it to 15.2.
  // 'private' is an **access modifier**. It means the 'height' variable can ONLY be
  // accessed or modified by code **within this Horse class itself**.
  // This is a key aspect of **encapsulation**, promoting data hiding.
  private double height = 15.2;

  // Declares a private instance variable 'breed' of type String.
  // This variable is not initialized here, so it will default to 'null' for a String.
  // It's also 'private', meaning it can only be accessed or modified within this class.
  private String breed;

  // more code... // This comment indicates that typical class definitions would have
  // more code here, such as constructors, getter/setter methods for
  // 'height' and 'breed', and other behaviors (methods).
}

/*
// ---
// ### Summary of Concepts:
//
// This program demonstrates fundamental **Object-Oriented Programming (OOP)** concepts in Java:
//
// 1.  **Classes**: Defines a **`Horse` class** as a blueprint for creating horse objects.
//
// 2.  **Instance Variables (Attributes)**: Objects have their own **state**, represented by **instance variables** like `height` and `breed`. These variables store data unique to each instance of the `Horse` class.
//
// 3.  **Access Modifiers (`private`)**:
//     * The `height` and `breed` variables are declared `private`. This is a crucial concept for **encapsulation**. It means these variables cannot be directly accessed or modified from code *outside* the `Horse` class.
//     * This restriction helps protect the object's internal state and allows the class to control how its data is used.
//
// 4.  **Default Initialization**:
//     * `private double height = 15.2;`: Shows an instance variable being explicitly initialized at the time of declaration.
//     * `private String breed;`: Shows an instance variable declared without explicit initialization. For object reference types like `String`, uninitialized instance variables automatically get a default value of `null`. For primitive numeric types (like `int`, `double`), they default to `0` or `0.0`.
//
// This `Horse` class sets up the basic structure for an object, but it would typically include **constructors** (to easily create horses with specific initial values) and **getter/setter methods** (to allow controlled access to the `private` instance variables from other parts of the program).
*/
