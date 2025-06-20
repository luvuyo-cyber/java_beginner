/*
 * This file contains the source code for the 'Movie' class and the 'MovieTestDrive' class.
 * The 'Movie' class defines a blueprint for movie objects, and 'MovieTestDrive'
 * demonstrates how to create multiple movie objects, set their attributes, and call their methods.
 */
package ch2; // Declares the package for these classes, helping organize Java files.

// Defines a class named 'Movie'. This acts as a blueprint for creating individual movie objects.
class Movie {
  String title;  // Declares an instance variable 'title' of type String.
  // Each 'Movie' object will have its own title.

  String genre;  // Declares an instance variable 'genre' of type String.
  // Each 'Movie' object will have its own genre.

  int rating;    // Declares an instance variable 'rating' of type int.
  // Each 'Movie' object will have its own rating.

  void playIt() { // Defines a method named 'playIt'. This describes the action of playing a movie.
    System.out.println("Playing the movie"); // Prints a generic message indicating the movie is playing.
  }
}

// Defines a class named 'MovieTestDrive'. This class contains the 'main' method,
// which is the starting point for demonstrating how to use the 'Movie' class.
public class MovieTestDrive {
  public static void main(String[] args) { // This is the main method, the program's entry point.

    // --- Movie Object 1 ---
    Movie one = new Movie();    // Creates a new 'Movie' object (instance 1) and assigns its reference to 'one'.
    one.title = "Gone with the Stock"; // Sets the 'title' instance variable for 'one'.
    one.genre = "Tragic";       // Sets the 'genre' instance variable for 'one'.
    one.rating = -2;            // Sets the 'rating' instance variable for 'one'.
    one.playIt();               // Calls the 'playIt()' method on the 'one' object.

    // --- Movie Object 2 ---
    Movie two = new Movie();    // Creates a new, separate 'Movie' object (instance 2) and assigns its reference to 'two'.
    two.title = "Lost in Cubicle Space"; // Sets attributes for 'two'.
    two.genre = "Comedy";
    two.rating = 5;
    two.playIt();               // Calls the 'playIt()' method on the 'two' object.

    // --- Movie Object 3 ---
    Movie three = new Movie();  // Creates a new, separate 'Movie' object (instance 3) and assigns its reference to 'three'.
    three.title = "Byte Club";  // Sets attributes for 'three'.
    three.genre = "Tragic but ultimately uplifting";
    three.rating = 127;
    three.playIt();             // Calls the 'playIt()' method on the 'three' object.

  } // Ends the main method.
} // Ends the MovieTestDrive class.

/*
 * Summary of Concepts:
 * This program demonstrates fundamental **Object-Oriented Programming (OOP)** concepts in Java:
 * 1.  **Classes**: Defining a blueprint (`Movie`) for objects and a class (`MovieTestDrive`) to use them.
 * 2.  **Objects**: Creating multiple distinct instances of a class (e.g., `one`, `two`, `three` are all `Movie` objects).
 * 3.  **Instance Variables (Attributes)**: Defining properties (`title`, `genre`, `rating`) that hold the unique state of each object.
 * 4.  **Methods (Behaviors)**: Defining actions (`playIt()`) that objects can perform.
 * 5.  **Object Interaction**: Setting an object's instance variables (e.g., `one.title = "..."`) and calling its methods (e.g., `one.playIt()`).
 * 6.  **Main Method**: The standard entry point (`public static void main`) for running a Java application.
 */
