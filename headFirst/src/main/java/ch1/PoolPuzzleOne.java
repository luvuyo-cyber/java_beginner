package ch1; // Declares the package for this class, helping organize Java files.

class PoolPuzzleOne { // Defines a class named 'PoolPuzzleOne'.

  public static void main(String[] args) { // This is the main method, where the program execution begins.

    int x = 0; // Declares an integer variable 'x' and initializes it to 0.
    // This variable will control the loop and conditional branches.

    while (x < 4) { // Starts a 'while' loop. This loop will run as long as 'x' is less than 4.
      // Iterations will occur when x is 0, 1, 2, 3.

      System.out.print("a"); // Prints "a" to the console without a new line.

      if (x < 1) { // Checks if 'x' is less than 1 (true only when x is 0).
        System.out.print(" "); // If true (x is 0), prints a space.
      }

      System.out.print("n"); // Prints "n" immediately after the previous output, without a new line.

      // Note: The following if statements will be evaluated sequentially.
      // The value of 'x' can change inside these 'if' blocks, affecting subsequent checks within the same loop iteration.

      if (x > 1) { // Checks if 'x' is greater than 1 (true when x is 2 or 3, or if x was changed to be > 1).
        System.out.print(" oyster"); // If true, prints " oyster".
        x = x + 2; // Increments 'x' by 2. This can cause the loop to jump faster or affect later conditions.
        // If x was 2, it becomes 4 here. If x was 3, it becomes 5.
      }

      if (x == 1) { // Checks if 'x' is exactly 1 (true when x is 1).
        System.out.print("noys"); // If true, prints "noys".
      }

      if (x < 1) { // Checks if 'x' is less than 1 (true only when x is 0).
        System.out.print("oise"); // If true (x is 0), prints "oise".
      }

      System.out.println(); // Prints a new line, moving the cursor to the next line for the next iteration.

      x = x + 1; // Increments 'x' by 1 at the end of each iteration.
      // This is the primary mechanism for loop progression.
    } // Ends the while loop.
  } // Ends the main method.
} // Ends the PoolPuzzleOne class.

/*
 * Expected Output:
 * a noise
 * annoys
 * an oyster
 * a n
 */

/*
 * Summary of Concepts:
 * This program demonstrates:
 * 1.  Variables: Declaring and updating a numerical value (`int x`).
 * 2.  Output: Printing to the console (`System.out.print` and `System.out.println`)
 * and controlling line breaks.
 * 3.  Loops: Repeating actions (`while` loop) as long as a condition is true.
 * 4.  Conditionals: Complex decision-making using multiple `if` statements,
 * where the order and potential changes to variables within `if` blocks
 * can affect subsequent conditions in the same loop iteration.
 * 5.  Comparison Operators: Using `<`, `==`, `>` for conditional checks.
 * 6.  Arithmetic: Incrementing a variable (`x = x + 1` and `x = x + 2`).
 * 7.  Basic Program Structure: Using a `package` and a `main` method within a `class`.
 */
