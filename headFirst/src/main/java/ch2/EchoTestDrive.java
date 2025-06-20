/*
 * This file contains the source code for the 'Echo' class and the 'EchoTestDrive' class.
 * 'Echo' defines a simple object, and 'EchoTestDrive' demonstrates how to
 * create multiple objects (or multiple references to the same object),
 * modify their state, and interact with them in a loop.
 */
package ch2; // Declares the package for these classes, helping organize Java files.

// Defines a class named 'Echo'. This is a blueprint for simple objects
// that can say "helloooo..." and have a 'count'.
class Echo {
  int count = 0; // Declares an instance variable 'count' of type int and initializes it to 0.
  // Each 'Echo' object will have its own 'count'.

  void hello() { // Defines a method named 'hello'.
    System.out.println("helloooo... "); // Prints a message to the console.
  }
}

// Defines a class named 'EchoTestDrive'. This class contains the 'main' method,
// which is where the program's logic to create and manipulate Echo objects resides.
public class EchoTestDrive {
  public static void main(String[] args) { // This is the main method, the program's starting point.

    Echo e1 = new Echo(); // Creates a new 'Echo' object (instance 1) and assigns its reference to 'e1'.
    // At this point, e1.count is 0.

    // The following two lines represent two *alternative* ways to initialize e2.
    // Only one of them would be active in the actual code at any given time.

    // Scenario A (original code, as provided): e1 and e2 are distinct objects.
    Echo e2 = new Echo(); // Creates a new, *separate* 'Echo' object (instance 2) and assigns its reference to 'e2'.
    // At this point, e2.count is also 0, independent of e1.count.

    // Scenario B (commented out, for bonus output): e1 and e2 refer to the *same* object.
//     Echo e2 = e1;   // 'e2' now refers to the *same* object that 'e1' refers to.
    // Any changes made via 'e1' will be visible via 'e2', and vice-versa.
    // They are aliases for the same object in memory.

    int x = 0; // Initializes integer variable 'x' to 0. This variable controls the loop.

    while (x < 4) { // Starts a 'while' loop. The loop iterates as long as 'x' is less than 4.
      // This means it will run for x = 0, 1, 2, 3.

      e1.hello(); // Calls the 'hello()' method on the 'e1' object (prints "helloooo... ").

      e1.count = e1.count + 1; // Increments the 'count' instance variable of the 'e1' object by 1.

      if (x == 3) { // Checks if 'x' is exactly 3 (this condition is true only in the last iteration).
        e2.count = e2.count + 1; // If true, increments the 'count' instance variable of the 'e2' object by 1.
      }

      if (x > 0) { // Checks if 'x' is greater than 0 (true for x = 1, 2, 3).
        // Adds the current 'e1.count' to 'e2.count'.
        // IMPORTANT: If 'e2' is an alias of 'e1' (Scenario B), then this line
        // effectively doubles the *shared* count in those iterations.
        e2.count = e2.count + e1.count;
      }

      x = x + 1; // Increments 'x' by 1 at the end of each loop iteration.
    } // Ends the while loop.

    System.out.println(e2.count); // After the loop finishes, prints the final value of 'e2.count' to the console.
  } // Ends the main method.
} // Ends the EchoTestDrive class.


/*
 * Summary of Concepts and Output Analysis:
 * This program demonstrates:
 * 1.  Classes and Objects: Defining a class (`Echo`) and creating objects (`e1`, `e2`).
 * 2.  Instance Variables (Attributes): `count` is a variable unique to each object.
 * 3.  Methods (Behaviors): `hello()` is an action an object can perform.
 * 4.  Object Instantiation (`new Echo()`): Creates distinct objects in memory.
 * 5.  Object References/Aliasing (`e2 = e1`): Shows how multiple variables can point to the *same* object,
 * leading to shared state.
 * 6.  Control Flow:
 * * `while` Loop: Repeating actions.
 * * `if` Statements: Conditional execution of code.
 * 7.  Arithmetic Operations: Incrementing and adding to variables.
 *
 * Output Analysis for 'e2.count':
 *
 * Scenario A: `Echo e2 = new Echo();` (e1 and e2 are separate objects)
 * - Initial: e1.count=0, e2.count=0, x=0
 * - x=0: e1.count=1, e2.count=0
 * - x=1: e1.count=2, e2.count=0+2=2
 * - x=2: e1.count=3, e2.count=2+3=5
 * - x=3: e1.count=4, e2.count (was 5) becomes 5+1=6 (from x==3), then 6+4=10 (from x>0)
 * - Final `e2.count`: 10
 *
 * Scenario B: `Echo e2 = e1;` (e1 and e2 refer to the *same* object)
 * - Initial: e1.count=0 (e2.count is also 0), x=0
 * - x=0: e1.count=1
 * - x=1: e1.count (was 1) becomes 1+1=2, then (due to e2.count = e2.count + e1.count, which is 2+2) e1.count becomes 4
 * - x=2: e1.count (was 4) becomes 4+1=5, then (due to e2.count = e2.count + e1.count, which is 5+5) e1.count becomes 10
 * - x=3: e1.count (was 10) becomes 10+1=11 (from e1.count=e1.count+1), then (due to x==3) e1.count becomes 11+1=12,
 * then (due to x>0 and e2.count=e2.count+e1.count, which is 12+12) e1.count becomes 24
 * - Final `e2.count`: 24
 *
 * This "puzzle" highlights the critical difference between creating new objects and simply creating
 * new references to existing objects.
 */
