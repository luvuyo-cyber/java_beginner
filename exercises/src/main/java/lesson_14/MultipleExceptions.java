package lesson_14; // Declares that this class belongs to the 'lesson_14' package.

import java.io.File;      // Needed for file operations (like creating a file).
import java.io.IOException; // Specifically needed for 'IOException', which is a checked exception.

public class MultipleExceptions { // This class demonstrates handling various exceptions.

    public static void main(String[] args) {
        // The 'try' block encloses code that might throw exceptions.
        try {
            createFile(); // Calls a static method that is declared to 'throw IOException'.
            // This method also contains code that will cause an 'ArrayIndexOutOfBoundsException'.
        } catch (IOException ioe) { // First catch block: Catches 'IOException'.
            // This specific catch block handles I/O related errors (e.g., file creation problems).
            System.out.println("Input Output Exception caught: " + ioe);
        } catch (IllegalArgumentException iae) { // Second catch block: Catches 'IllegalArgumentException'.
            // This handles cases where a method receives an inappropriate argument.
            System.out.println("Illegal Argument Exception caught: " + iae);
        } catch (Exception e) { // Third (general) catch block: Catches any 'Exception'.
            // This is a **polymorphic catch block** because 'Exception' is the superclass
            // of most other exceptions. It acts as a fallback to catch any exception
            // not caught by the more specific 'catch' blocks above it.
            // Rule: More specific exception types MUST be caught *before* more general types.
            // If 'Exception' came first, it would catch everything, and subsequent specific
            // catch blocks would become unreachable (a compilation error).
            System.out.println("General Exception caught: " + e);
        }
    }

    // This method is declared to 'throw IOException'.
    // The 'throws' keyword in the method signature indicates that this method *might*
    // throw an 'IOException' (which is a **checked exception**).
    // This forces any method that calls 'createFile()' to either:
    // 1. Enclose the call in a `try-catch` block that handles `IOException`, OR
    // 2. Also declare `throws IOException` in its own signature, passing the responsibility up.
    public static void createFile() throws IOException {
        // Attempting to create a 'File' object pointing to a potentially non-writable directory.
        // On many systems (especially non-Windows), "C:/notWriteableDir" is not a valid or accessible path.
        // This line itself doesn't throw, but the subsequent 'createTempFile' might fail because of it.
        File testF = new File("C:/notWriteableDir");

        // 'createTempFile()' is a method that declares 'throws IOException'.
        // If the directory specified by 'testF' does not exist or is not writable,
        // an 'IOException' will be thrown here.
        File tempF = testF.createTempFile("te", null, testF);
        System.out.println("Temp Filename: " + tempF.getPath());

        // This line will unconditionally cause an 'ArrayIndexOutOfBoundsException'.
        // This is an **unchecked exception** (a `RuntimeException` subclass), so it does
        // NOT need to be declared with 'throws' in the method signature.
        // Code execution will stop at this line if the exception occurs, and the next line won't be reached.
        int myInt[] = new int[5]; // Creates an array with valid indices from 0 to 4.
        myInt[5] = 25;           // Attempts to access index 5, which is out of bounds.
    }
}

/*
Summary for MultipleExceptions.java:
------------------------------------
This code demonstrates **multiple `catch` blocks** for handling different types of exceptions
arising from a single `try` block. It illustrates:

1.  **Checked vs. Unchecked Exceptions:**
    * **Checked Exceptions** (`IOException`): The compiler forces you to either `catch` them
        or declare them with `throws` in the method signature. They represent foreseeable
        problems (like file not found).
    * **Unchecked Exceptions** (`ArrayIndexOutOfBoundsException`, `IllegalArgumentException`):
        These usually indicate programming errors and are not compiler-enforced to be handled.

2.  **`try-catch` Structure:** How to enclose risky code in a `try` block and provide specific
    `catch` blocks for different exception types.

3.  **Catch Block Order:** The rule that more specific `catch` blocks must come before more
    general ones (e.g., `IOException` before `Exception`) to ensure proper handling.

4.  **`throws` Keyword:** How a method uses `throws` to declare that it *might* throw a checked
    exception, delegating the handling responsibility to its caller.
*/
