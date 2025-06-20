package ch3; // Package declaration.

public class FiveMinuteMystery { // FiveMinuteMystery class.

  void solution1() {
    int x = 0;
    // Array to hold 10 Contact object references.
    Contact[] contacts = new Contact[10];

    while (x < 10) {
      // Create NEW Contact object; assign reference to array slot.
      contacts[x] = new Contact();
      x = x + 1;
    }
    // 'contacts' array holds 10 distinct Contact objects.
  }

  void solution2() {
    int x = 0;
    // Single Contact reference variable.
    Contact contactRef;

    while (x < 10) {
      // Create NEW Contact object; overwrite 'contactRef'.
      contactRef = new Contact();
      x = x + 1;
    }
    // 'contactRef' refers only to the LAST object created.
    // Previous objects are eligible for garbage collection.
  }
}

class Contact {
}

/*
 * Summary:
 * This code demonstrates Java's **object creation** and **references**.
 * `solution1()` creates an array of **10 distinct Contact objects**.
 * `solution2()` creates 10 Contact objects but only keeps a reference to the **last one**,
 * showing how previous objects can become unreferenced and eligible for garbage collection.
 */
