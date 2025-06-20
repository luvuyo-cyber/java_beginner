package ch3;

class Hobbits {
  String name;

  public static void main(String[] args) {
    Hobbits[] h = new Hobbits[3]; // Create an array to hold 3 Hobbit objects

    int z = -1; // Start index at -1

    while (z < 2) { // Loop 3 times (for index 0, 1, and 2)
      z = z + 1;
      h[z] = new Hobbits(); // Create a new Hobbit object
      h[z].name = "bilbo"; // Default name

      if (z == 1) {
        h[z].name = "frodo"; // Change name for index 1
      }
      if (z == 2) {
        h[z].name = "sam"; // Change name for index 2
      }

      System.out.print(h[z].name + " is a ");
      System.out.println("good Hobbit name");
    }
  }
}

/*
Summary:
- Demonstrates creating and using an array of objects in Java.
- Each object has a 'name' field.
- Objects are created in a loop and customized based on their index.
- Shows how to access and modify object fields in an array.
*/
