package ch2;

class Dog { // Defines a class named 'Dog'. This class serves as a blueprint for creating
  // Dog objects, each representing a specific dog with its own characteristics.

  int size; // Declares an instance variable 'size' of type int.
  // Each 'Dog' object will have its own 'size'. It's public by default (package-private).

  String breed; // Declares an instance variable 'breed' of type String.
  // Each 'Dog' object will have its own 'breed'.

  String name; // Declares an instance variable 'name' of type String.
  // Each 'Dog' object will have its own 'name'.

  void bark() { // Defines a method named 'bark'. This method describes an action that
    // a 'Dog' object can perform.
    // 'void' means this method does not return any value.
    // It's public by default (package-private).

    System.out.println("Ruff! Ruff!"); // Inside the 'bark' method, this line prints
    // "Ruff! Ruff!" to the console when a Dog object barks.
  } // Ends the bark method.
} // Ends the Dog class.

/*
 * Summary of Concepts:
 * This program demonstrates fundamental Object-Oriented Programming (OOP) concepts in Java:
 * 1.  Classes: Defining a blueprint (`Dog`) for creating objects.
 * 2.  Instance Variables (Attributes): Declaring variables (`size`, `breed`, `name`) that hold
 * the state or characteristics unique to each object created from the class.
 * 3.  Methods (Behaviors): Defining actions (`bark()`) that objects of the class can perform.
 * 4.  Basic Program Structure: Using a `package` to organize code.
 *
 * This class defines *what a Dog is* and *what a Dog can do*, but it doesn't actually *create*
 * any Dog objects or *use* them yet. That would typically happen in another class with a `main` method.
 */
