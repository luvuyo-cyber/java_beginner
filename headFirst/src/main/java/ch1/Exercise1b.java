/*
 * This file contains the source code for the "Exercise1b" Java program.
 * It demonstrates a 'while' loop combined with an 'if' condition,
 * showing how the loop's counter and conditional logic interact.
 */
package ch1; // Declares the package for this class, helping organize Java files.

public class Exercise1b {

  public static void main(String[] args) { // This is the main method, where the program execution begins.

    int x = 5; // Declares an integer variable 'x' and initializes it to 5.
    // This variable controls the loop and influences the conditional check.

    while (x > 1) { // Starts a 'while' loop. This loop runs as long as 'x' is greater than 1.
      // The loop will iterate when x is 5, 4, 3, 2.

      x = x - 1; // Decrements 'x' by 1 in each iteration.
      // This ensures that 'x' will eventually become 1,
      // causing the loop condition (x > 1) to become false and the loop to terminate.

      if (x < 3) { // Checks if 'x' is less than 3.
        // This condition will be true when x is 2.
        System.out.println("small x"); // If 'x' is less than 3, this message is printed.
        // This will print "small x" when x is 2.
      }
    } // Ends the while loop. The loop terminates when 'x' becomes 1.
  } // Ends the main method.
} // Ends the Exercise1b class.

/*
 * Expected Output (and Execution Trace):
 *
 * Initial: x = 5
 *
 * Iteration 1:
 * - x starts as 5.
 * - Loop condition (5 > 1) is true.
 * - x becomes 4 (x = 5 - 1).
 * - if (4 < 3) is false.
 * - Loop continues.
 *
 * Iteration 2:
 * - x starts as 4.
 * - Loop condition (4 > 1) is true.
 * - x becomes 3 (x = 4 - 1).
 * - if (3 < 3) is false.
 * - Loop continues.
 *
 * Iteration 3:
 * - x starts as 3.
 * - Loop condition (3 > 1) is true.
 * - x becomes 2 (x = 3 - 1).
 * - if (2 < 3) is true.
 * - Prints: "small x"
 * - Loop continues.
 *
 * Iteration 4:
 * - x starts as 2.
 * - Loop condition (2 > 1) is true.
 * - x becomes 1 (x = 2 - 1).
 * - if (1 < 3) is true.
 * - Prints: "small x"
 * - Loop continues.
 *
 * After Iteration 4:
 * - x is 1.
 * - Loop condition (1 > 1) is false.
 * - Loop terminates.
 *
 * Final Console Output:
 * small x
 * small x
 */

/*
 * Summary of Concepts:
 * This program effectively demonstrates key fundamental Java concepts:
 * 1.  **Variables**: Declaring and initializing an integer variable (`int x`).
 * 2.  **Output**: Printing messages to the console (`System.out.println`).
 * 3.  **Loops (`while`)**: Using a `while` loop to repeatedly execute a block of code as long as a specified condition (`x > 1`) remains true.
 * 4.  **Loop Control**: Modifying the loop's controlling variable (`x = x - 1`) within the loop body to ensure it eventually terminates.
 * 5.  **Conditionals (`if`)**: Using an `if` statement to execute code (`System.out.println("small x")`) only when a nested condition (`x < 3`) is met.
 * 6.  **Program Flow**: Understanding how the sequence of operations and conditional checks within a loop determines the final output.
 */
