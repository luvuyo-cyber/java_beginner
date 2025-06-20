/*
 * This file contains the source code for the 'Player' class,
 * which defines the blueprint for a player in the "Guess the Number" game.
 * Each player can make a guess, and their guessed number is stored.
 */
package ch2; // Declares the package for this class, matching the other game classes.

import java.util.Random; // Imports the 'Random' class from Java's utility library.
// This class is used to generate random numbers for the player's guess.

public class Player { // Defines a public class named 'Player'. This is the blueprint for individual players.

  public int number; // Declares a public instance variable 'number' of type int.
  // 'public' means it can be directly accessed and modified by other classes (like GuessGame).
  // Each 'Player' object will have its own 'number' to store their guess.

  public void guess() { // Defines a public method named 'guess'.
    // This method encapsulates the action of a player making a guess.
    // 'public' means it can be called from outside this class.
    // 'void' means it does not return any value directly.

    Random randomGenerator = new Random(); // Creates a new instance of the 'Random' class.
    // This object will be used to generate the random number.
    // Creating it inside the method means a new Random object
    // is created each time 'guess()' is called.

    number = randomGenerator.nextInt(10); // Generates a random integer using the 'randomGenerator' object.
    // `nextInt(10)` returns a random integer between 0 (inclusive)
    // and 10 (exclusive). This random number is then stored
    // in the 'number' instance variable of THIS Player object.

    System.out.println("I'm guessing " + number); // Prints the player's guessed number to the console.
  } // Ends the guess method.
} // Ends the Player class.

/*
 * Summary of Concepts in Player.java:
 * This file demonstrates:
 * 1.  **Class Definition**: Defines a blueprint (`Player`) for creating player objects.
 * 2.  **Instance Variables (Attributes)**: Shows how an object can hold its own state (`number`).
 * 3.  **Methods (Behaviors)**: Defines an action (`guess()`) that an object can perform.
 * 4.  **Random Number Generation**: Uses the `java.util.Random` class to generate random numbers.
 * 5.  **Object Instantiation**: Creates an instance of `Random` within a method.
 * 6.  **Access Modifiers**: Uses `public` for both the class, instance variable, and method,
 * making them accessible from other classes.
 */
