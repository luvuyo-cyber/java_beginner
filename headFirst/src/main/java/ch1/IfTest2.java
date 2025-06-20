package ch1;

class IfTest2 { // Defines another class named 'IfTest2'. This is the blueprint for our second example.

  public static void main(String[] args) { // Main method for IfTest2, where its execution starts.

    int x = 2; // Declares an integer variable 'x' and initializes it to 2.

    if (x == 3) { // Starts an 'if' statement. This block runs ONLY if 'x' is equal to 3.
      System.out.println("x must be 3"); // Prints if x is 3.
    } else { // This 'else' block runs if the 'if' condition (x == 3) is false.
      System.out.println("x is NOT 3"); // Prints if x is not 3.
    } // Ends the if-else block.

    System.out.println("This runs no matter what"); // This line always executes.
  } // Ends the main method for IfTest2.
} // Ends the IfTest2 class.


/*
 * Summary of Concepts:
 * This program demonstrates:
 * 1.  Variables: Storing numerical values (`int x`, `int y`).
 * 2.  Output: Printing messages to the console (`System.out.println`).
 * 3.  Conditionals: Making decisions using `if` and `if-else` statements.
 * - `if`: Executes code only if a condition is true.
 * - `if-else`: Provides two distinct paths of execution based on a condition being true or false.
 * 4.  Comparison Operators: Using `==` to check for equality.
 * 5.  Basic Program Structure: Using a `package` and `main` methods within separate `class` definitions
 * in the same Java file.
 */