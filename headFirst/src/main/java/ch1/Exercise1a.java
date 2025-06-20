/*
 * This file contains the source code for the "Exercise1a" Java program,
 * demonstrating a corrected 'while' loop that now terminates as expected.
 */
package ch1; // Declares the package for this class, helping organize Java files.

class Exercise1a { // Defines a class named 'Exercise1a'.

  public static void main(String[] args) { // This is the main method, where the program execution begins.

    int x = 1; // Declares an integer variable 'x' and initializes it to 1.
    // This variable is used in the loop and conditional check.

    while (x < 10) { // Starts a 'while' loop. This loop runs as long as 'x' is less than 10.
      // The loop will now correctly terminate because 'x' is incremented inside.

      if (x > 3) { // Checks if 'x' is greater than 3.
        System.out.println("big x"); // If 'x' is greater than 3, this message is printed.
        // This will start printing "big x" once 'x' becomes 4.
      }
      x = x + 1; //Increments 'x' by 1 in each iteration.
      // This ensures that 'x' will eventually reach 10,
      // causing the loop condition (x < 10) to become false and the loop to terminate.
    } // Ends the while loop when 'x' is no longer less than 10 (i.e., when x becomes 10).
  } // Ends the main method.
} // Ends the Exercise1a class.

/*
 * Summary of Concepts:
 * This program demonstrates:
 * 1.  **Variables**: Declaring and initializing an integer variable (`int x`).
 * 2.  **Output**: Printing messages to the console (`System.out.println`).
 * 3.  **Loops**: Using a `while` loop to repeat actions.
 * 4.  **Conditionals**: Making decisions (`if` statement) based on a condition (`x > 3`).
 * 5.  **Loop Termination**: Shows the **correct way to ensure a `while` loop terminates** by
 * modifying the loop's controlling variable (`x`) within the loop's body.
 */
