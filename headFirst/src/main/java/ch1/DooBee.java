package ch1; // Declares the package for this class, helping organize Java files.

public class DooBee { // Defines a class named 'DooBee' to demonstrate loop behavior and concatenation.

  public static void main(String[] args) { // Main method for DooBee, where its execution starts.

    int x = 1; // Declares an integer variable 'x' and initializes it to 1.
    // This variable will control the loop's iterations.

    while (x < 3) { // Starts a 'while' loop. This loop runs as long as 'x' is less than 3.
      // It will iterate twice: once when x=1 and once when x=2.

      System.out.print("Doo"); // Prints "Doo" to the console without a new line.
      System.out.print("Bee"); // Prints "Bee" immediately after "Doo", without a new line.

      x = x + 1; // Increments 'x' by 1. This step is crucial for the loop to eventually stop.
    } // Ends the while loop. When the loop finishes, x will be 3.

    if (x == 3) { // Checks if 'x' is exactly 3. This condition will be true after the loop.
      System.out.print("Do"); // Prints "Do" to the console.
    } // Ends the if block.
  } // Ends the main method for DooBee.
} // Ends the DooBee class.


/*
 * Summary of Concepts:
 * This program demonstrates:
 * 1.  Variables: Storing and updating a numerical value (`int x`).
 * 2.  Output: Printing messages to the console (`System.out.print`).
 * 3.  Loops: Repeating actions (`while` loop) as long as a condition is true.
 * 4.  Conditionals: Making a decision (`if` statement) based on a condition.
 * 5.  Arithmetic: Incrementing a variable (`x = x + 1`).
 * 6.  Output Formatting: Using `print` to control line breaks, resulting in concatenated output.
 * 7.  Basic Program Structure: Using a `package` and a `main` method within a `class` definition.
 */
