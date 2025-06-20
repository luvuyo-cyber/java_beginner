package ch1; // Declares the package for this class, helping organize Java files.

public class Loopy { // Defines a public class named 'Loopy'. This is the blueprint for our program.

  public static void main(String[] args) { // This is the main method, where the program execution begins.
    // It's the entry point that the Java Virtual Machine (JVM) looks for.

    int x = 1; // Declares an integer variable 'x' and initializes it to 1.
    // This variable will be used to control the loop.

    System.out.println("Before the Loop"); // Prints a message to the console before the loop starts.

    while (x < 4) { // Starts a 'while' loop. The code inside this loop will run
      // repeatedly as long as 'x' is less than 4.

      System.out.println("In the loop"); // Prints a message indicating the program is inside the loop.
      System.out.println("Value of x is " + x); // Prints the current value of 'x'.

      x = x + 1; // Increases the value of 'x' by 1 in each iteration.
      // This is crucial for the loop to eventually terminate.
    } // Ends the while loop.

    System.out.println("This is after the loop"); // Prints a message to the console after the loop has finished.
  } // Ends the main method.
} // Ends the Loopy class.

/*
 * Summary of Concepts:
 * This program demonstrates:
 * 1.  Variables: Storing and updating a numerical value (`int x`).
 * 2.  Output: Printing messages and variable values to the console (`System.out.println`).
 * 3.  Loops: Repeating actions (`while` loop) as long as a condition is true.
 * 4.  Arithmetic: Incrementing a variable (`x = x + 1`).
 * 5.  Basic Program Structure: Using a `package` and a `main` method within a `class`.
 */
