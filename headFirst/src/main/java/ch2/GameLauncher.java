/*
 * This file contains the source code for the 'GameLauncher' class,
 * which serves as the entry point for the simple "Guess the Number" game application.
 */
package ch2; // Declares the package for this class. This helps organize
// Java files into logical groups. Classes within the same
// package can typically access each other.

public class GameLauncher { // Defines a public class named 'GameLauncher'.
  // 'public' means it can be accessed from any other class.
  // This class is specifically designed to kick off the game.

  public static void main(String[] args) { // This is the main method, the program's starting point.
    // When you execute this Java file (e.g., from your IDE or command line),
    // the Java Virtual Machine (JVM) looks for and starts execution here.
    // 'public static void main(String[] args)' is the standard signature
    // for the entry point of a standalone Java application.

    // Creates a new 'GuessGame' object (an instance of the GuessGame class).
    // The 'new' keyword allocates memory for a new object, and 'GuessGame()' calls its constructor.
    // This line brings our game object into existence.
    GuessGame guessGame = new GuessGame();

    // Calls the 'startGame()' method on the 'guessGame' object.
    // This method is expected to contain the primary logic for running the game,
    // such as setting up players, getting guesses, and checking for a winner.
    guessGame.startGame();
  } // Ends the main method.
} // Ends the GameLauncher class.

/*
 * Summary of Concepts in GameLauncher.java:
 * This file primarily demonstrates:
 * 1.  **Classes**: Defining a class (`GameLauncher`) that acts as an application's entry point.
 * 2.  **Objects**: Creating an instance of another class (`GuessGame`) using the `new` keyword.
 * 3.  **Methods**: Calling a method (`startGame()`) on an object to initiate its behavior.
 * 4.  **Main Method**: The standard `public static void main(String[] args)` method, which is
 * essential for running any standalone Java application.
 * 5.  **Program Flow**: Illustrates how one class can launch and orchestrate the execution
 * of logic defined in other classes, typically used to start an application.
 */
