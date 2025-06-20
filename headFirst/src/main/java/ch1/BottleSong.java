package ch1; // Declares the package for this class, helping organize Java files.

public class BottleSong { // Defines a public class named 'BottleSong'. This is the blueprint for our program.

  public static void main(String[] args) { // This is the main method, where the program execution begins.
    // It's the entry point that the Java Virtual Machine (JVM) looks for.

    int bottlesNum = 10; // Declares an integer variable 'bottlesNum' and initializes it to 10.
    // This variable will count how many bottles are left.

    String word = "bottles"; // Declares a String variable 'word' and sets it to "bottles".
    // This will be used in the song lyrics.

    while (bottlesNum > 0) { // Starts a 'while' loop. The code inside this loop will run
      // repeatedly as long as 'bottlesNum' is greater than 0.

      if (bottlesNum == 1) { // Checks if there's only one bottle left.
        word = "bottle"; // If so, changes 'word' to "bottle" for correct grammar.
      }

      // Prints the first two lines of the song verse, using the current bottle count and word.
      System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
      System.out.println(bottlesNum + " green " + word + ", hanging on the wall");

      // Prints the line about a bottle falling.
      System.out.println("And if one green bottle should accidentally fall,");

      bottlesNum = bottlesNum - 1; // Decreases the 'bottlesNum' by 1, simulating a bottle falling.

      if (bottlesNum > 0) { // Checks if there are still bottles remaining after one fell.
        // If there are, prints the line about the remaining bottles.
        System.out.println("There'll be " + bottlesNum +
                " green " + word + ", hanging on the wall");
      } else { // If no bottles are left.
        // Prints the final line when all bottles are gone.
        System.out.println("There'll be no green bottles, hanging on the wall");
      }
    } // Ends the while loop.
  } // Ends the main method.
} // Ends the BottleSong class.

/*
 * Summary of Concepts:
 * This program demonstrates:
 * 1.  Variables: Storing numbers (`int`) and text (`String`).
 * 2.  Output: Printing messages to the console (`System.out.println`).
 * 3.  Loops: Repeating actions (`while` loop) until a condition is met.
 * 4.  Conditionals: Making decisions (`if-else` statements) based on conditions.
 * 5.  Arithmetic: Simple calculations (decrementing `bottlesNum`).
 * 6.  Basic Program Structure: Using a `package` and a `main` method in a `class`.
 */
