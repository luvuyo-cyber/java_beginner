package ch4; // Package declaration.

class Clock { // Defines the Clock class.
  String time; // Clock's time data.

  void setTime(String t) { // Method to set time.
    time = t; // Assigns input to 'time'.
  }

  String getTime() { // Method to get time.
    return time; // Returns 'time'.
  }
}

class ClockTestDrive { // Class to test Clock functionality.
  public static void main(String[] args) { // Main method.

    Clock c = new Clock(); // Create a Clock object.

    c.setTime("1245"); // Set clock time.

    String tod = c.getTime(); // Get clock time.

    System.out.println("time: " + tod); // Print the time.
  }
}

/*
 * Summary:
 * This code demonstrates **Object-Oriented Programming (OOP)** fundamentals.
 * The `Clock` class is a **blueprint** for objects, holding `time` data.
 * It uses `setTime` and `getTime` (setters/getters) to manage this data.
 * `ClockTestDrive` shows how to **create an object**, set its state,
 * and retrieve it, illustrating basic **object interaction**.
 */
