/*
 * This file contains the source code for the 'Foo' class,
 * which is designed to demonstrate a common Java compilation error:
 * attempting to use a local variable before it has been initialized.
 */
package ch4; // Declares the package for this class, organizing it within a larger project.

class Foo { // Defines a class named 'Foo'.

  public void go() { // Defines a public method named 'go'.
    // 'public' means it can be called from outside this class.
    // 'void' means this method does not return any value.

    // intentionally doesn't compile

    // int x; // Declares a local integer variable 'x'.
    // At this point, 'x' has been *declared* but not *initialized* with a value.
    // Local variables (variables declared inside a method) are NOT given default values by Java.

    // int z = x + 3; // COMPILATION ERROR: "variable x might not have been initialized"
    // This line attempts to use the value of 'x' (in the expression 'x + 3')
    // before 'x' has been assigned any value.
    // The Java compiler strictly enforces that local variables must be
    // initialized before they are used. This prevents unpredictable behavior
    // that would arise from using a variable with an unknown or garbage value.

    // To fix this, 'x' would need to be initialized, for example:
    // int x = 0;
    // int z = x + 3; // This would now compile correctly.
  } // Ends the go method.
} // Ends the Foo class.

/*
 * Summary of Concepts:
 * This program, through its commented-out lines, specifically demonstrates:
 * 1.  **Local Variables**: Variables declared inside a method (like `x` in `go()`).
 * 2.  **Variable Initialization**: The critical rule in Java that **local variables MUST be explicitly assigned a value before they can be used**. Unlike instance variables, local variables are *not* automatically given default values.
 * 3.  **Compilation Error**: Shows a common compile-time error that occurs when breaking the initialization rule, preventing the code from running. The Java compiler acts as a safeguard against this type of bug.
 */
