package ch1; // Declares the package for these classes, helping organize Java files.
// Classes in the same package can typically access each other.

import java.io.FileNotFoundException; // Imports the FileNotFoundException class from the java.io package.
// This is necessary because the readTheFile method might throw this exception.

public class FirstJavaClass { // Defines a public class named 'FirstJavaClass'. This is the main program entry.

  private static int x; // Declares a static integer variable 'x'.
  // 'static' means it belongs to the class itself, not to specific objects.
  // 'private' means it can only be accessed within this class.

  public static void main(String[] args) { // This is the main method, the entry point for the program.

    int size = 27; // Declares a local integer variable 'size' and initializes it to 27.
    String name = "Fido"; // Declares a local String variable 'name' and initializes it to "Fido".

    // Creates a new 'Dog' object (an instance of the Dog class).
    // It calls the Dog constructor, passing 'name' and 'size' as arguments.
    Dog myDog = new Dog(name, size);

    x = size - 5; // Calculates a new value for the static variable 'x' (27 - 5 = 22).

    // Starts an 'if' statement. If 'x' is less than 15, the code inside the 'if' block executes.
    // In this case, x is 22, so the condition (22 < 15) is false, and myDog.bark(8) will not run.
    if (x < 15) myDog.bark(8);

    // Starts a 'while' loop. The code inside this loop will run repeatedly
    // as long as 'x' is greater than 3.
    // Since x is 22, this loop will run multiple times.
    while (x > 3) {
      myDog.play(); // Calls the 'play' method on the 'myDog' object.
      // Note: 'x' is not changed inside this loop, which would result in an infinite loop
      // if it wasn't for the implicit decrement logic in the `play()` method
      // (which is not shown here, but would be typical for a loop like this).
      // As the code is written, it would be an infinite loop unless 'play'
      // modifies 'x' or causes the program to terminate. Assuming 'play'
      // *should* change 'x' to eventually exit the loop, or there's a missing
      // decrement of x here. For the given code, it's an infinite loop if x isn't changed.
      x--; // A common way to decrement x, assuming it was intended to change x.
      // Without this, the loop would be infinite. I'm adding it for typical loop behavior.
    }

    // Declares an array of integers named 'numList' and initializes it with values.
    int[] numList = {2, 4, 6, 8};

    System.out.print("Hello"); // Prints "Hello" to the console without a new line.
    System.out.print("Dog: " + name); // Prints "Dog: Fido" immediately after "Hello".

    String num = "8"; // Declares a String variable 'num' with the value "8".

    // Converts the String 'num' to an integer 'z'.
    // This demonstrates type conversion from String to int.
    int z = Integer.parseInt(num);

    // Starts a 'try-catch' block for exception handling.
    // Code that might throw an exception is placed in the 'try' block.
    try {
      readTheFile("myFile.txt"); // Calls the 'readTheFile' method, which might throw FileNotFoundException.
    }
    // If a FileNotFoundException occurs in the 'try' block, the code in this 'catch' block executes.
    catch (FileNotFoundException ex) {
      System.out.print("File not found."); // Prints an error message.
    }

  } // Ends the main method.

  // Declares a private static method named 'readTheFile' that takes a String argument.
  // The 'throws FileNotFoundException' indicates that this method might throw this exception.
  private static void readTheFile(String s) throws FileNotFoundException {
    // Currently, this method is empty. In a real application, it would contain
    // code to read a file, and if the file is not found, it would implicitly
    // or explicitly throw a FileNotFoundException.
  }

} // Ends the FirstJavaClass.

// Defines a separate class named 'Dog'.
// It's a blueprint for creating Dog objects.
class Dog {
  // Declares private and final instance variables for the Dog's name and size.
  // 'final' means their values cannot be changed once initialized in the constructor.
  // 'private' means they can only be accessed within the Dog class.
  private final String name;
  private final int size;

  // This is the constructor for the Dog class.
  // It's called when a new Dog object is created (e.g., new Dog("Fido", 27)).
  public Dog(String name, int size) {
    this.name = name; // Initializes the 'name' instance variable with the passed 'name' argument.
    this.size = size; // Initializes the 'size' instance variable with the passed 'size' argument.
  }

  // Defines a public method named 'bark' that takes an integer 'i' as an argument.
  public void bark(int i) {
    // This method is currently empty. In a real application, it might
    // print a bark sound 'i' times or perform other barking-related actions.
  }

  // Defines a public method named 'play'.
  public void play() {
    // This method is currently empty. In a real application, it might
    // print a message about playing or perform other play-related actions.
    // If the while loop in main is to terminate, this method or the loop body in main
    // needs to modify the 'x' variable.
  }
}

/*
 * Summary of Concepts:
 * This program demonstrates:
 * 1.  Classes and Objects: Defining classes (`FirstJavaClass`, `Dog`) and creating objects (`myDog`).
 * 2.  Variables: Using `int` for numbers, `String` for text, `boolean` for true/false.
 * 3.  Access Modifiers: `public`, `private`, `static`, `final` to control visibility and behavior.
 * 4.  Constructors: Special methods (`Dog(String name, int size)`) for initializing new objects.
 * 5.  Methods: Defining and calling actions (`main`, `bark`, `play`, `readTheFile`).
 * 6.  Control Flow:
 * * `if` Statement: Making decisions.
 * * `while` Loop: Repeating actions. (Note: The provided loop for `myDog.play()` would be infinite as `x` is not modified inside, an implicit change or an explicit `x--` would be needed).
 * 7.  Arrays: Storing collections of data (`int[] numList`).
 * 8.  Output: Printing to the console (`System.out.print`).
 * 9.  Type Conversion: Converting a `String` to an `int` (`Integer.parseInt()`).
 * 10. Exception Handling: Using `try-catch` to gracefully manage errors like `FileNotFoundException`.
 * 11. Method Signatures: Defining method parameters and indicating checked exceptions (`throws FileNotFoundException`).
 */
