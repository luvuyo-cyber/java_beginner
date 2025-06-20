/*
 * This file contains the source code for the 'Episode' class and the 'EpisodeTestDrive' class.
 * The 'Episode' class defines a blueprint for TV show episodes, and 'EpisodeTestDrive'
 * demonstrates how to create and interact with an episode object.
 */
package ch2; // Declares the package for these classes, helping organize Java files.

// Defines a class named 'Episode'. This acts as a blueprint for creating individual TV episode objects.
class Episode {
  int seriesNumber;  // Declares an instance variable 'seriesNumber' of type int.
  // Each 'Episode' object will have its own series number.
  int episodeNumber; // Declares an instance variable 'episodeNumber' of type int.
  // Each 'Episode' object will have its own episode number.

  void play() { // Defines a method named 'play'. This describes the action of playing an episode.
    System.out.println("Playing episode " + episodeNumber); // Prints a message indicating which episode is playing.
  }

  void skipIntro() { // Defines a method named 'skipIntro'.
    System.out.println("Skipping intro..."); // Prints a message about skipping the intro.
  }

  void skipToNext() { // Defines a method named 'skipToNext'.
    System.out.println("Loading next episode..."); // Prints a message about loading the next episode.
  }
}

// Defines a class named 'EpisodeTestDrive'. This class contains the 'main' method,
// which is the starting point for demonstrating how to use the 'Episode' class.
class EpisodeTestDrive {
  public static void main(String[] args) { // This is the main method, the program's entry point.

    Episode episode = new Episode(); // Creates a new 'Episode' object (an instance of the Episode class)
    // and assigns its reference to the variable 'episode'.
    // This brings a new episode object into existence.

    episode.seriesNumber = 4; // Accesses the 'seriesNumber' instance variable of the 'episode' object
    // and assigns it the value 4.

    episode.play(); // Calls the 'play()' method on the 'episode' object.
    // This will print "Playing episode 0" because episodeNumber was not explicitly set
    // and defaults to 0 for an int.

    episode.skipIntro(); // Calls the 'skipIntro()' method on the 'episode' object.
  } // Ends the main method.
} // Ends the EpisodeTestDrive class.

/*
 * Summary of Concepts:
 * This program demonstrates fundamental **Object-Oriented Programming (OOP)** concepts in Java:
 * 1.  **Classes**: Defining a blueprint (`Episode`) for creating objects and a class (`EpisodeTestDrive`) to test it.
 * 2.  **Objects**: Creating an instance of a class (`new Episode()`) and storing it in a variable.
 * 3.  **Instance Variables (Attributes)**: Defining properties (`seriesNumber`, `episodeNumber`) that hold the state unique to each object.
 * 4.  **Methods (Behaviors)**: Defining actions (`play()`, `skipIntro()`, `skipToNext()`) that objects can perform.
 * 5.  **Object Interaction**: Accessing an object's instance variables (`episode.seriesNumber`) and calling its methods (`episode.play()`).
 * 6.  **Main Method**: The standard entry point for running a Java application.
 */
