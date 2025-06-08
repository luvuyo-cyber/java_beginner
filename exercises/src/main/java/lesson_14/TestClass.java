package lesson_14; // Declares that this class belongs to the 'lesson_14' package.

import java.io.File;      // Needed for file operations.
import java.io.IOException; // Specific checked exception.
import java.util.logging.Level; // Used to specify severity levels for logs.
import java.util.logging.Logger; // Used for logging messages and exceptions.

public class TestClass { // This class demonstrates handling checked exceptions and logging.

    public static void main(String[] args) {
        TestClass tc = new TestClass(); // Create an instance of TestClass.
        try{
            // Call the 'testCheckedException()' method.
            // This method is declared to 'throw Exception', which is a broad checked exception.
            // Therefore, the 'main' method (the caller) *must* either catch it or re-declare 'throws'.
            tc.testCheckedException();
        }catch(IOException e) { // Catches a specific 'IOException'.
            // This block will execute if 'testCheckedException()' throws an IOException.
            System.out.println("Caught IOException: " + e);
        }  catch (Exception ex) { // Catches any other 'Exception'.
            // This is a general catch block. It will catch any `Exception` (including subclasses)
            // that was not caught by the more specific `IOException` handler above.
            // Using a Logger for more robust error reporting than simple System.out.println.
            // Logger.getLogger(TestClass.class.getName()): Gets a logger instance associated with this class.
            // .log(Level.SEVERE, null, ex): Logs the exception at a SEVERE level, indicating a critical error.
            // The 'ex' parameter ensures the full stack trace of the exception is logged.
            Logger.getLogger(TestClass.class.getName()).log(Level.SEVERE, "Error during file creation", ex);
            System.out.println("Caught a general Exception (logged): " + ex); // Also print to console for immediate visibility.
        }
    }

    // This method is declared to 'throw Exception'.
    // This signals to the compiler that this method might throw a checked exception,
    // and the calling method must handle this potential exception.
    public void testCheckedException() throws Exception {
        // Create a File object pointing to a specific path.
        // Note: The path here is specific to the original user's environment.
        // For general testing, you might need to adjust this path to an accessible location
        // where the program has write permissions.
        File testFile = new File("/Users/shadowsgeneraldealer/bootcamp/Github/java_beginner/exercises/src/main/java/lesson_14/testFile.txt");

        // 'createNewFile()' is a method that declares 'throws IOException'.
        // Since 'IOException' is a checked exception, and our method 'testCheckedException()'
        // is declared to 'throws Exception' (which is a superclass of IOException),
        // we are allowed to call 'createNewFile()' without a local `try-catch` block.
        // The responsibility is passed up to the caller (e.g., the 'main' method).
        testFile.createNewFile();
        System.out.println("testFile exists: " + testFile.exists());
    }
}

/*
Summary for TestClass.java:
---------------------------
This code focuses on **checked exceptions** and their handling:

1.  **`throws` Clause:** It demonstrates how a method uses `throws Exception` in its signature
    to indicate that it can throw a checked exception, delegating the handling responsibility
    to the caller.

2.  **Required Handling:** Since `Exception` (and its subclass `IOException`) are checked exceptions,
    the calling `main` method is *required* to either catch them or re-declare `throws`.

3.  **Exception Logging:** Introduces the `java.util.logging` package as a more sophisticated
    way to report and record exceptions, providing severity levels and full stack traces for
    better debugging and monitoring compared to simple `System.out.println`.
*/
