/*
 * This file contains the source code for the 'StreamingSong' class and the 'StreamingSongTestDrive' class.
 * The 'StreamingSong' class defines a blueprint for a digital song, and 'StreamingSongTestDrive'
 * demonstrates how to create a song object, set its details, and play it.
 */
package ch2; // Declares the package for these classes, helping organize Java files.

// Defines a class named 'StreamingSong'. This acts as a blueprint for creating individual song objects.
class StreamingSong {
  String title;    // Declares an instance variable 'title' of type String.
  // Each 'StreamingSong' object will have its own title.
  String artist;   // Declares an instance variable 'artist' of type String.
  // Each 'StreamingSong' object will have its own artist.
  int duration;    // Declares an instance variable 'duration' of type int.
  // Each 'StreamingSong' object will have its own duration (e.g., in seconds).

  void play() { // Defines a method named 'play'. This describes the action of playing the song.
    System.out.println("Playing song"); // Prints a generic message indicating the song is playing.
  }

  void printDetails() { // Defines a method named 'printDetails'. This describes printing song info.
    // Prints a message combining the song's title and artist, using string concatenation.
    System.out.println("This is " + title + " by " + artist);
  }
}

// Defines a class named 'StreamingSongTestDrive'. This class contains the 'main' method,
// which is the starting point for demonstrating how to use the 'StreamingSong' class.
class StreamingSongTestDrive {
  public static void main(String[] args) { // This is the main method, the program's entry point.

    // Creates a new 'StreamingSong' object (an instance of the StreamingSong class)
    // and assigns its reference to the variable 'song'.
    // This brings a new song object into existence in computer memory.
    StreamingSong song = new StreamingSong();

    song.artist = "The Beatles";   // Accesses the 'artist' instance variable of the 'song' object
    // and assigns it the value "The Beatles".

    song.title = "Come Together";  // Accesses the 'title' instance variable of the 'song' object
    // and assigns it the value "Come Together".

    song.play(); // Calls the 'play()' method on the 'song' object. This makes the song play.

    song.printDetails(); // Calls the 'printDetails()' method on the 'song' object.
    // This will print the song's title and artist to the console.
  } // Ends the main method.
} // Ends the StreamingSongTestDrive class.

/*
 * Summary of Concepts:
 * This program demonstrates fundamental **Object-Oriented Programming (OOP)** concepts in Java:
 * 1.  **Classes**: Defining a blueprint (`StreamingSong`) for objects and a class (`StreamingSongTestDrive`) to use them.
 * 2.  **Objects**: Creating an instance of a class (`new StreamingSong()`) and storing it in a variable.
 * 3.  **Instance Variables (Attributes)**: Defining properties (`title`, `artist`, `duration`) that hold the unique state of each object.
 * 4.  **Methods (Behaviors)**: Defining actions (`play()`, `printDetails()`) that objects can perform.
 * 5.  **Object Interaction**: Setting an object's instance variables (e.g., `song.artist = "..."`) and calling its methods (e.g., `song.play()`).
 * 6.  **Main Method**: The standard entry point (`public static void main`) for running a Java application.
 */
