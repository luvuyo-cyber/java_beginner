/*
 * This file contains the source code for the 'Books' class and the 'BooksTestDrive' class.
 * The 'Books' class defines a blueprint for book objects, and 'BooksTestDrive'
 * demonstrates how to create an array of these objects, assign values to their attributes,
 * and then iterate through the array to print their details.
 */
package ch3; // Declares the package for these classes, organizing them within a larger project.

// Defines a class named 'Books'. This is the blueprint for creating individual book objects.
class Books {
  String title;  // Declares an instance variable 'title' of type String.
  // Each 'Books' object will have its own title.
  String author; // Declares an instance variable 'author' of type String.
  // Each 'Books' object will have its own author.
}

// Defines a class named 'BooksTestDrive'. This class contains the 'main' method,
// which is the starting point for demonstrating how to use the 'Books' class and arrays of objects.
class BooksTestDrive {
  public static void main(String[] args) { // This is the main method, the program's entry point.

    // Declares an array named 'myBooks' that can hold 'Books' objects.
    // It is initialized to hold 3 'Books' object references (initially all null).
    Books[] myBooks = new Books[3];

    int x = 0; // Declares an integer variable 'x' and initializes it to 0.
    // This variable will be used as an array index and loop counter.

    // Creates three actual 'Books' objects and assigns their references to the array elements.
    // Before these lines, myBooks[0], myBooks[1], myBooks[2] were just null.
    myBooks[0] = new Books();
    myBooks[1] = new Books();
    myBooks[2] = new Books();

    // Accesses each 'Books' object in the array and sets its 'title' instance variable.
    myBooks[0].title = "The Grapes of Java";
    myBooks[1].title = "The Java Gatsby";
    myBooks[2].title = "The Java Cookbook";

    // Accesses each 'Books' object in the array and sets its 'author' instance variable.
    myBooks[0].author = "bob";
    myBooks[1].author = "sue";
    myBooks[2].author = "ian";

    while (x < 3) { // Starts a 'while' loop. This loop runs as long as 'x' is less than 3.
      // It will iterate for x = 0, 1, 2, allowing access to all 3 books.

      // Prints the title of the current book (accessed via myBooks[x].title).
      System.out.print(myBooks[x].title);

      System.out.print(" by "); // Prints " by " immediately after the title, without a new line.

      // Prints the author of the current book (accessed via myBooks[x].author) followed by a new line.
      System.out.println(myBooks[x].author);

      x = x + 1; // Increments 'x' by 1, moving to the next element in the array for the next loop iteration.
    } // Ends the while loop.
  } // Ends the main method.
} // Ends the BooksTestDrive class.

/*
 * Summary of Concepts:
 * This program demonstrates fundamental **Object-Oriented Programming (OOP)** and **Java** concepts:
 * 1.  **Classes & Objects**: Defining a blueprint (`Books`) and creating multiple instances (objects) from it.
 * 2.  **Instance Variables (Attributes)**: Objects having their own state (`title`, `author`).
 * 3.  **Arrays of Objects**: Creating and managing a collection (`Books[] myBooks`) where each element is a reference to an object.
 * 4.  **Object Interaction**: Accessing and setting attributes of objects within an array (e.g., `myBooks[0].title = "..."`).
 * 5.  **Loops (`while`)**: Iterating through an array to process each object.
 * 6.  **Output**: Printing dynamic content to the console using `System.out.print` and `System.out.println`
 * for controlled formatting.
 * 7.  **Basic Program Structure**: Using a `package` and `main` method.
 */
