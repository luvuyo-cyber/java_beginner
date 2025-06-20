/*
 * This file contains the source code for the 'GoodDog' class and the 'GoodDogTestDrive' class.
 * It's a key example demonstrating how to properly **encapsulate** an object's data
 * using private variables and public getter/setter methods.
 */
package ch4; // Declares the package for these classes, organizing them within a larger project.

// Defines the 'GoodDog' class, our blueprint for creating good dog objects.
class GoodDog {
  // Declares an instance variable 'size' of type int.
  // The 'private' keyword is an **access modifier**. It means 'size' can ONLY be
  // accessed or modified by code **within this GoodDog class itself**.
  // This is fundamental for **encapsulation**, preventing direct external manipulation of the data.
  private int size;

  // This is a **getter** (or accessor) method for the 'size' instance variable.
  // 'public' means it can be called from any other class.
  // 'int' means this method will return an integer value.
  // It provides a controlled and safe way to read the 'size' of a GoodDog object from outside.
  public int getSize() {
    return size; // Returns the current value of the 'size' instance variable.
  }

  // This is a **setter** (or mutator) method for the 'size' instance variable.
  // 'public' means it can be called from any other class.
  // 'void' means this method does not return any value.
  // It takes an integer 's' as an argument, providing a controlled way to set the 'size'.
  // In a real application, setters can include validation logic (e.g., ensure size is positive).
  public void setSize(int s) {
    size = s; // Assigns the value passed in 's' to the 'size' instance variable of this GoodDog object.
  }

  // Defines the 'bark' method, which describes the action of barking.
  // The sound of the bark depends on the dog's 'size'.
  // Without a 'public' or 'private' modifier, this method is **package-private**.
  // This means it can be called by other classes located within the same 'ch4' package.
  void bark() {
    if (size > 60) { // Checks if the dog's size is greater than 60.
      System.out.println("Wooof! Wooof!"); // Prints a big dog bark if true.
    } else if (size > 14) { // If the first condition is false, checks if size is greater than 14.
      System.out.println("Ruff!  Ruff!"); // Prints a medium dog bark if true.
    } else { // If neither of the above conditions is true (size is 14 or less).
      System.out.println("Yip! Yip!"); // Prints a small dog bark.
    }
  } // Ends the bark method.
}

// Defines the 'GoodDogTestDrive' class. This class contains the 'main' method,
// which is the entry point for demonstrating how to create and interact with 'GoodDog' objects.
class GoodDogTestDrive {

  public static void main(String[] args) { // This is the main method, where the program execution begins.

    // --- Creating GoodDog Objects and Setting Their Properties ---

    // Creates a new 'GoodDog' object (instance 1) and assigns its reference to the variable 'one'.
    GoodDog one = new GoodDog();
    // Calls the 'setSize()' method on the 'one' object to set its private 'size' to 70.
    // We cannot directly access 'one.size = 70;' here because 'size' is private.
    one.setSize(70);

    // Creates another new 'GoodDog' object (instance 2) and assigns its reference to the variable 'two'.
    GoodDog two = new GoodDog();
    // Calls the 'setSize()' method on the 'two' object to set its private 'size' to 8.
    two.setSize(8);

    // --- Getting Properties and Printing ---
    // Calls 'getSize()' on 'one' to retrieve its private 'size' (70) and prints it.
    System.out.println("Dog one: " + one.getSize());
    // Calls 'getSize()' on 'two' to retrieve its private 'size' (8) and prints it.
    System.out.println("Dog two: " + two.getSize());

    // --- Making Dogs Bark ---
    // Calls the 'bark()' method on the 'one' object. The bark sound will depend on its size (70).
    one.bark(); // Expected output: "Wooof! Wooof!"

    // Calls the 'bark()' method on the 'two' object. The bark sound will depend on its size (8).
    two.bark(); // Expected output: "Yip! Yip!"

  } // Ends the main method.
} // Ends the GoodDogTestDrive class.

/*
// ---
// ### Summary of Concepts:
//
// This program is an excellent demonstration of **Object-Oriented Programming (OOP)**, particularly the principle of **Encapsulation** and how it's implemented in Java:
//
// 1.  **Classes and Objects**: We define a **`GoodDog` class** as a blueprint and then create distinct **objects** (`one`, `two`) from this blueprint. Each object is an independent instance.
//
// 2.  **Instance Variables (Attributes)**: Objects have their own **state**, represented by **instance variables** like `size`.
//
// 3.  **Access Modifiers**:
//     * **`private`**: The `size` variable is declared `private`. This means it can only be accessed or changed by code *within* the `GoodDog` class itself. This is **data hiding**, a core part of encapsulation.
//     * **`public`**: The **getter (`getSize()`)** and **setter (`setSize()`)** methods are `public`. They provide the *controlled interface* for other classes to interact with the private `size` variable.
//     * **Package-private**: The `bark()` method is package-private (no explicit modifier), meaning it's accessible only to other classes within the `ch4` package.
//
// 4.  **Encapsulation**: This is the central idea here. By making `size` private and providing public getters and setters, the `GoodDog` class controls *how* its `size` data is accessed and modified. This protects the internal state of the object, makes the code more robust, and allows for future changes to the internal implementation without affecting external code that uses the getters/setters.
//
// 5.  **Methods (Behaviors)**: Objects perform actions through **methods** like `bark()`. The `bark()` method's behavior is dynamic, changing its output based on the `GoodDog` object's specific `size`.
//
// 6.  **Object Interaction**: The `GoodDogTestDrive` class demonstrates how to create `GoodDog` objects and then interact with them by calling their public methods (`setSize()`, `getSize()`, `bark()`) to modify or retrieve their state and trigger their behaviors.
*/
