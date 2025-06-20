/*
 * This file contains the source code for the 'DrumKit' class and the 'DrumKitTestDrive' class.
 * 'DrumKit' defines a blueprint for a drum kit object, and 'DrumKitTestDrive' demonstrates how to
 * create and interact with a drum kit object, including modifying its state and calling its methods.
 */
package ch2; // Declares the package for these classes, helping organize Java files.

// Defines a class named 'DrumKit'. This is a blueprint for creating drum kit objects.
class DrumKit {
  boolean topHat = true; // Declares an instance variable 'topHat' of type boolean and initializes it to true.
  // Each DrumKit object will have its own topHat state (on/off).
  boolean snare = true;  // Declares an instance variable 'snare' of type boolean and initializes it to true.
  // Each DrumKit object will have its own snare state.

  void playTopHat() { // Defines a method named 'playTopHat'. This is an action a DrumKit can perform.
    System.out.println("ding ding da-ding"); // Prints the sound for the top hat.
  }

  void playSnare() { // Defines a method named 'playSnare'. This is another action.
    System.out.println("bang bang ba-bang"); // Prints the sound for the snare drum.
  }
}

// Defines a class named 'DrumKitTestDrive'. This class contains the 'main' method,
// where we will create and interact with 'DrumKit' objects.
class DrumKitTestDrive {
  public static void main(String[] args) { // This is the main method, the program's starting point.

    DrumKit d = new DrumKit(); // Creates a new 'DrumKit' object and assigns it to variable 'd'.
    // This brings a drum kit into existence in memory.

    d.playSnare(); // Calls the 'playSnare()' method on the 'd' object. Prints "bang bang ba-bang".

    d.snare = false; // Directly accesses and changes the 'snare' instance variable of object 'd' to false.
    // This simulates removing or disabling the snare.

    d.playTopHat(); // Calls the 'playTopHat()' method on the 'd' object. Prints "ding ding da-ding".

    // Checks the current state of the 'snare' instance variable on object 'd'.
    // Since 'd.snare' was set to 'false' previously, this condition ('false == true') is false.
    if (d.snare == true) {
      d.playSnare(); // This line will NOT be executed because the condition is false.
    }
  } // Ends the main method.
} // Ends the DrumKitTestDrive class.

/*
 * Summary of Concepts:
 * This program demonstrates core Object-Oriented Programming (OOP) principles:
 * 1.  Classes and Objects: Defines a class (`DrumKit`) as a blueprint and creates an object (`d`) from it.
 * 2.  Instance Variables (Attributes): Shows how objects have their own state (`topHat`, `snare`).
 * 3.  Methods (Behaviors): Defines actions objects can perform (`playTopHat`, `playSnare`).
 * 4.  Object Interaction: Accessing and modifying an object's variables (`d.snare = false`) and
 * calling its methods (`d.playSnare()`).
 * 5.  Conditional Logic: Using an `if` statement to execute code based on an object's state.
 */
