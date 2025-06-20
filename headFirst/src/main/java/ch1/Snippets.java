package ch1; // Declares the package for this class, helping organize Java files.

public class Snippets { // Defines a public class named 'Snippets'.

  // This method demonstrates basic statements, variable assignment, and output.
  void statements() {
    int x = 3; // Declares an integer variable 'x' and initializes it to 3.
    String name = "Dirk"; // Declares a String variable 'name' and initializes it to "Dirk".
    x = x * 17; // Reassigns 'x' with its current value multiplied by 17 (3 * 17 = 51).
    System.out.print("x is " + x); // Prints the string "x is 51" to the console without a new line.
    double d = Math.random(); // Declares a double variable 'd' and assigns it a random double value
    // between 0.0 (inclusive) and 1.0 (exclusive).
    // this is a comment // A single-line comment.
  }

  // This method demonstrates different types of loops: while and for.
  void looping(int x) { // Defines a method 'looping' that takes an integer 'x' as input.

    while (x > 12) { // Starts a 'while' loop. This loop runs as long as 'x' is greater than 12.
      x = x - 1; // Decrements 'x' by 1 in each iteration.
    }

    for (int i = 0; i < 10; i = i + 1) { // Starts a 'for' loop.
      // 'int i = 0': Initializes loop counter 'i' to 0.
      // 'i < 10': Loop continues as long as 'i' is less than 10.
      // 'i = i + 1': Increments 'i' by 1 after each iteration.
      System.out.print("i is now " + i); // Prints the current value of 'i' in each iteration.
    }
  }

  // This method demonstrates 'if-else' and 'if' statements with logical operators.
  void conditions(int x, String name) { // Defines a method 'conditions' taking an integer 'x' and String 'name'.

    if (x == 10) { // Checks if 'x' is exactly equal to 10.
      System.out.print("x must be 10"); // Prints this if 'x' is 10.
    } else { // If 'x' is not 10.
      System.out.print("x isn't 10"); // Prints this if 'x' is not 10.
    }

    // Checks if 'x' is less than 3 AND 'name' is equal to "Dirk".
    // '&' is a bitwise AND, but here acts as a logical AND for boolean expressions.
    // `.equals()` is used to compare String content.
    if ((x < 3) & (name.equals("Dirk"))) {
      System.out.println("Gently"); // Prints "Gently" followed by a new line if both conditions are true.
    }

    System.out.print("this line runs no matter what"); // This line always executes.
  }

  // This method demonstrates boolean test conditions for while loops.
  void booleanTests() {
    int x = 4; // Assigns 4 to x.
    while (x > 3) { // Loop condition: 'x > 3' is true (4 > 3). Loop code will run.
      // loop code will run because
      // x is greater than 3
      x = x - 1; // Decrements 'x' by 1. 'x' becomes 3.
      // This ensures the loop condition (x > 3) eventually becomes false (3 > 3 is false),
      // preventing an infinite loop.
    }
    int z = 27; // Assigns 27 to z.
    while (z == 17) { // Loop condition: 'z == 17' is false (27 == 17 is false).
      // Loop code will not run as the condition is false from the start.
      // loop code will not run because
      // z is not equal to 17
    }
  }
}

/*
 * Summary of Concepts Displayed:
 * This program demonstrates fundamental Java concepts:
 * 1.  Variables: Declaring and assigning values to `int`, `String`, and `double` types.
 * 2.  Output: Printing to the console using `System.out.print` and `System.out.println`.
 * 3.  Arithmetic Operations: Basic calculations (`*`, `-`).
 * 4.  Loops: Iteration using `while` and `for` loops.
 * 5.  Conditionals: Decision-making with `if-else` and nested `if` statements.
 * 6.  Comparison and Logical Operators: Using `==`, `<`, `&` (logical AND).
 * 7.  String Methods: Comparing string content with `.equals()`.
 * 8.  Random Numbers: Generating a random `double` using `Math.random()`.
 * 9.  Method Definition: Creating and structuring code within different methods.
 * 10. Comments: Explaining code with single-line comments.
 */
