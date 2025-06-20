package ch3; // Package declaration

class Dog { // Dog class definition

  String name; // Each Dog has a name

  public static void main(String[] args) {

    // --- Create a Single Dog Object ---
    Dog dog1 = new Dog(); // New Dog object
    dog1.bark();          // Calls bark() -> prints: null says Ruff!
    dog1.name = "Bart";   // Set name to Bart

    // --- Create Dog Array ---
    Dog[] myDogs = new Dog[3]; // Array of Dog references

    myDogs[0] = new Dog(); // First Dog
    myDogs[1] = new Dog(); // Second Dog
    myDogs[2] = dog1;      // Third Dog is same as dog1

    // --- Set Names ---
    myDogs[0].name = "Fred";
    myDogs[1].name = "Marge";

    // --- Print Dog's Name ---
    System.out.print("last dog’s name is ");
    System.out.println(myDogs[2].name); // Prints "Bart"

    // --- Loop through and bark ---
    int x = 0;
    while (x < myDogs.length) {
      myDogs[x].bark(); // Each Dog barks
      x = x + 1;
    }
  }

  public void bark() {
    System.out.println(name + " says Ruff!");
  }

  public void eat() {
  }

  public void chaseCat() {
  }
}

/*
 * Summary:
 * - Create and use objects with instance variables and methods.
 * - Arrays can store object references.
 * - Multiple variables can refer to the same object.
 * - Loop through objects to perform actions.
 */
