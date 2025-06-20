package ch2;

// Defines a class named 'DogTestDrive'. This class contains the 'main' method,
// which is where we will create and interact with 'Dog' objects.
class DogTestDrive {

  public static void main(String[] args) { // This is the main method, the program's entry point.

    // Creates a new 'Dog' object (an instance of the Dog class) and assigns it to
    // the variable 'd'. This brings a new Dog into existence in memory.
    Dog d = new Dog();

    // Accesses the 'size' instance variable of the 'd' (Dog) object and
    // assigns it the value 40. This sets the size for this specific dog.
    d.size = 40;

    // Calls the 'bark()' method on the 'd' (Dog) object.
    // This makes the specific dog 'd' perform its bark action.
    d.bark();
  } // Ends the main method.
} // Ends the DogTestDrive class.

/*
 * Summary of Concepts:
 * This program demonstrates fundamental Object-Oriented Programming (OOP) concepts in Java:
 * 1.  Classes: Defining a blueprint (`Dog`) for objects and a class to test it (`DogTestDrive`).
 * 2.  Objects: Creating an instance of a class (`new Dog()`) and storing it in a variable.
 * 3.  Instance Variables (Attributes): Defining properties (`size`, `breed`, `name`) for objects.
 * 4.  Methods (Behaviors): Defining actions (`bark()`) that objects can perform.
 * 5.  Object Interaction: Accessing an object's instance variables (`d.size`) and
 * calling its methods (`d.bark()`).
 * 6.  Main Method: The standard entry point for running a Java application.
 */