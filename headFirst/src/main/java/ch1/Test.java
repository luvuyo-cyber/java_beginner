package ch1; // Declares the package for this class.

class Test { // Defines a class named 'Test'.

  public static void main(String[] args) { // This is the main method, the program's entry point.

    int x = 0; // Initializes integer variable 'x' to 0. This variable controls the loop and is part of the output.
    int y = 0; // Initializes integer variable 'y' to 0. This variable is modified by the candidate code and part of the output.

    while (x < 5) { // Starts a 'while' loop. The loop continues as long as 'x' is less than 5.
      // This means it will iterate when x is 0, 1, 2, 3, and 4.

      // --- Candidate Code Blocks and their Expected Outputs ---
      // Each block below is an independent 'candidate code' that could go
      // into the placeholder. Only one would be active at a time.

      /*
       * Candidate 1:
       * Output: 00 11 21 32 42
       */
      // y = x - y;

      /*
       * Candidate 2:
       * Output: 00 11 23 36 410
       */
      // y = y + x;

      /*
       * Candidate 3:
       * Output: 02 14 25 36 47
       */
      // y = y + 2;
      // if (y > 4) {
      //   y = y - 1;
      // }

      /*
       * Candidate 4:
       * Output: 11 34 59
       */
      // x = x + 1;
      // y = y + x;

      /*
       * Candidate 5:
       * Output: 02 14 36 48
       */
      // if (y < 5) {
      //   x = x + 1;
      //   if (y < 3) {
      //     x = x - 1;
      //   }
      // }
      // y = y + 2;


      // The following lines execute in every iteration, regardless of the candidate code.
      // They print the current values of 'x' and 'y', followed by a space.
      System.out.print(x + "" + y + " ");

      // Increments 'x' by 1 at the end of each iteration.
      // This ensures the loop eventually terminates and 'x' progresses.
      x = x + 1;
    } // Ends the while loop.
  } // Ends the main method.
} // Ends the Test class.


/*
 * Summary of Concepts:
 * This program demonstrates:
 * 1.  Variables: Declaring and modifying integer variables (`x`, `y`).
 * 2.  Loops: Using a `while` loop to repeat a block of code based on a condition (`x < 5`).
 * 3.  Output: Printing values to the console (`System.out.print`) and string concatenation (`+ "" +`).
 * 4.  Arithmetic Operations: Incrementing (`x = x + 1`) and other calculations.
 * 5.  Conditional Logic: Using `if` statements to execute code blocks conditionally.
 * 6.  Program Flow: Understanding how changes to variables within the loop affect subsequent conditions and output.
 */
