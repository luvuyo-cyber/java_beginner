package ch4; // Package declaration.

class XCopy { // Defines the XCopy class.

  public static void main(String[] args) { // Main method: program entry point.
    int orig = 42; // Declare and initialize 'orig' to 42.

    XCopy x = new XCopy(); // Create an instance of XCopy.

    // Call 'go' method, passing the VALUE of 'orig' (42).
    // Assign the returned value to 'y'.
    int y = x.go(orig);

    System.out.println(orig + " " + y); // Print 'orig' and 'y'.
  }

  // Method 'go' takes an int 'arg'.
  // 'arg' receives a COPY of the value passed.
  int go(int arg) {
    arg = arg * 2; // Double 'arg' (only affects this local copy).
    return arg; // Return modified 'arg'.
  }
}

/*
 * Summary:
 * This code demonstrates Java's **pass-by-value** for primitive types.
 * When `orig` (42) is passed to `go`, a **copy** is made for `arg`.
 * Doubling `arg` in `go` only affects that copy, not the original `orig`.
 * Output: `42 84` (`orig` remains unchanged, `y` gets the doubled value).
 */
