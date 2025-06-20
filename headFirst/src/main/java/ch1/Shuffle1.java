package ch1; // Declares the package for this class, helping organize Java files.

class Shuffle1 { // Defines a class named 'Shuffle1'.

  public static void main(String[] args) { // This is the main method, where the program execution begins.

    int x = 3; // Declares an integer variable 'x' and initializes it to 3.
    // This variable controls the loop and influences conditional blocks.

    while (x > 0) { // Starts a 'while' loop. The loop continues as long as 'x' is greater than 0.
      // Iterations will occur as long as x is 3, 2, 1.

      if (x > 2) { // Checks if 'x' is greater than 2 (true only when x is 3).
        System.out.print("a"); // If true, prints "a" to the console without a new line.
      }

      x = x - 1; // Decrements 'x' by 1. This happens in every iteration of the loop.
      // After this line:
      // - If x was 3, x becomes 2.
      // - If x was 2, x becomes 1.
      // - If x was 1, x becomes 0.

      System.out.print("-"); // Prints a hyphen "-" immediately after the previous output, without a new line.

      if (x == 2) { // Checks if 'x' is exactly 2 (true when x was initially 3 and then decremented).
        System.out.print("b c"); // If true, prints "b c".
      }

      if (x == 1) { // Checks if 'x' is exactly 1 (true when x was initially 2 and then decremented).
        System.out.print("d"); // If true, prints "d".
        x = x - 1; // Further decrements 'x' by 1. If x was 1, it becomes 0 here.
        // This additional decrement can affect the loop's termination.
      }
      // The loop implicitly ends here (no System.out.println() in the original, so output concatenates on one line)
    } // Ends the while loop. The loop terminates when 'x' becomes 0 or less.
  } // Ends the main method.
} // Ends the Shuffle1 class.

/*
 * Expected Output:
 * a-b c-d-
 *
 * (Breakdown of execution based on x's value and modification):
 * 1. x = 3:
 * - if (3 > 2) is true, prints "a"
 * - x becomes 2
 * - prints "-"
 * - if (2 == 2) is true, prints "b c"
 * - if (2 == 1) is false
 * -> Output: "a-b c"
 *
 * 2. x = 2:
 * - if (2 > 2) is false
 * - x becomes 1
 * - prints "-"
 * - if (1 == 2) is false
 * - if (1 == 1) is true, prints "d"
 * - x becomes 0
 * -> Output: "a-b c-d"
 *
 * 3. x = 0 (loop condition x > 0 is now false):
 * - Loop terminates.
 *
 * Final Console Output (all on one line): a-b c-d-
 */

/*
 * Summary of Concepts:
 * This program demonstrates:
 * 1.  Variables: Declaring and modifying an integer variable (`int x`).
 * 2.  Output: Printing to the console (`System.out.print`) without newlines,
 * leading to concatenated output.
 * 3.  Loops: Using a `while` loop to repeat actions based on a condition (`x > 0`).
 * 4.  Conditionals: Multiple `if` statements demonstrating sequential checks.
 * 5.  Arithmetic: Decrementing a variable (`x = x - 1`).
 * 6.  Loop Control: How modifying the loop variable *inside* conditional blocks
 * can affect the number of iterations and the loop's progression.
 * 7.  Basic Program Structure: Using a `package` and a `main` method within a `class`.
 */
