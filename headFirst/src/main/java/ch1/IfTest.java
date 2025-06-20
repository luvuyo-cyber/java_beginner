package ch1; // Declares the package for this class, helping organize Java files.

class IfTest { // Defines a class named 'IfTest'. This is the blueprint for our program.
  // Note: 'class' (without 'public') means it's accessible within the same package.

  public static void main (String[] args) { // This is the main method, where the program execution begins.
    // It's the entry point that the Java Virtual Machine (JVM) looks for.

    int x = 3; // Declares an integer variable 'x' and initializes it to 3.
    // This variable will be used in the conditional check.

    if (x == 3) { // Starts an 'if' statement. The code inside this block will run
      // ONLY if the condition 'x == 3' (x is equal to 3) is true.

      System.out.println("x must be 3"); // Prints a message to the console if the condition is true.
    } // Ends the if block.

    System.out.println("This runs no matter what"); // Prints a message to the console.
    // This line is outside the 'if' block,
    // so it always executes regardless of the 'if' condition.
  } // Ends the main method.
} // Ends the IfTest class.

/*
 * Summary of Concepts:
 * This program demonstrates:
 * 1.  Variables: Storing a numerical value (`int x`).
 * 2.  Output: Printing messages to the console (`System.out.println`).
 * 3.  Conditionals: Making a decision (`if` statement) based on a condition (`x == 3`).
 * 4.  Comparison Operators: Using `==` to check for equality.
 * 5.  Basic Program Structure: Using a `package` and a `main` method within a `class`.
 */
