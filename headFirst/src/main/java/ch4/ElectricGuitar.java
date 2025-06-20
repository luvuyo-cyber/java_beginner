/*
 * This file contains the source code for the 'ElectricGuitar' class.
 * This class defines a blueprint for an electric guitar object,
 * demonstrating how to define instance variables (attributes) and
 * how to use getter and setter methods to control access to these attributes.
 */
package ch4; // Declares the package for this class. This helps organize Java files
// into logical groups within a larger project.

class ElectricGuitar { // Defines a class named 'ElectricGuitar'.
  // This class acts as a blueprint for creating individual electric guitar objects.

  String brand; // Declares an instance variable 'brand' of type String.
  // Each 'ElectricGuitar' object will have its own brand (e.g., "Fender", "Gibson").

  int numOfPickups; // Declares an instance variable 'numOfPickups' of type int.
  // This stores the number of pickups the guitar has (e.g., 1, 2, or 3).

  boolean rockStarUsesIt; // Declares an instance variable 'rockStarUsesIt' of type boolean.
  // This stores whether a rock star uses this specific guitar (true/false).

  // --- Getter Methods ---
  // Getter methods (also known as accessors) are used to retrieve the value of an instance variable.
  // They allow other parts of the code to "get" the object's state without directly accessing the variable.

  String getBrand() { // Defines a method to get the 'brand' of the guitar.
    return brand; // Returns the current value of the 'brand' instance variable.
  }

  int getNumOfPickups() { // Defines a method to get the 'numOfPickups'.
    return numOfPickups; // Returns the current value of the 'numOfPickups' instance variable.
  }

  boolean getRockStarUsesIt() { // Defines a method to get the 'rockStarUsesIt' status.
    return rockStarUsesIt; // Returns the current value of the 'rockStarUsesIt' instance variable.
  }

  // --- Setter Methods ---
  // Setter methods (also known as mutators) are used to set or change the value of an instance variable.
  // They allow other parts of the code to "set" the object's state, often with validation logic (though none here).

  void setBrand(String aBrand) { // Defines a method to set the 'brand' of the guitar.
    // It takes a String argument 'aBrand', which is the new value for the brand.
    brand = aBrand; // Assigns the value from the 'aBrand' argument to the 'brand' instance variable.
  }

  void setNumOfPickups(int num) { // Defines a method to set the 'numOfPickups'.
    // Takes an integer argument 'num' for the new number of pickups.
    numOfPickups = num; // Assigns the value from 'num' to the 'numOfPickups' instance variable.
  }

  void setRockStarUsesIt(boolean yesOrNo) { // Defines a method to set the 'rockStarUsesIt' status.
    // Takes a boolean argument 'yesOrNo'.
    rockStarUsesIt = yesOrNo; // Assigns the value from 'yesOrNo' to the 'rockStarUsesIt' instance variable.
  }
} // Ends the ElectricGuitar class.

/*
 * Summary of Concepts:
 * This program demonstrates fundamental **Object-Oriented Programming (OOP)** concepts in Java:
 *
 * 1.  **Classes**: Defining a blueprint (`ElectricGuitar`) for creating objects.
 * 2.  **Instance Variables (Attributes)**: Declaring properties (`brand`, `numOfPickups`, `rockStarUsesIt`)
 * that hold the unique state (data) for each object.
 * 3.  **Methods (Behaviors)**: Defining actions that objects can perform.
 * 4.  **Getters and Setters (Accessor/Mutator Methods)**:
 * * This class is a classic example of using **getter methods** (e.g., `getBrand()`) to retrieve
 * the values of instance variables and **setter methods** (e.g., `setBrand(String aBrand)`)
 * to modify them.
 * * This pattern is a foundational aspect of **Encapsulation**, an OOP principle.
 * Encapsulation means bundling the data (instance variables) and methods that operate on the
 * data within a single unit (the class), and restricting direct access to some of the object's
 * components. Getters and setters provide a controlled way to access and modify an object's internal state.
 * 5.  **Method Arguments**: How information is passed into a method (e.g., `aBrand` in `setBrand`).
 * 6.  **Method Return Values**: How a method sends data back to the caller (e.g., `return brand;`).
 */
