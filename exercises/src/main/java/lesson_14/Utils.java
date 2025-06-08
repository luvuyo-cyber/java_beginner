package lesson_14; // Declares that this class belongs to the 'lesson_14' package.

public class Utils { // This class demonstrates exception handling responsibility.

    // Method 'doThis()' with a 'try-catch' block.
    // Because 'doThis()' handles the exception thrown by 'doThat()' internally,
    // it does NOT need to declare 'throws Exception' in its own signature.
    public void doThis() {
        System.out.println("Arrived in doThis()"); // Added for clearer execution flow tracking.
        try{
            doThat(); // Calls 'doThat()', which is declared to 'throw Exception'.
            // The 'try-catch' block here is responsible for handling that exception.
        }catch(Exception e){ // This block catches the 'Exception' thrown by 'doThat()'.
            System.out.println("Exception caught in doThis(): " + e.getMessage());
        }
        System.out.println("Back in doThis after potential exception handling.");
    }

    // Method 'doThat()' that declares 'throws Exception'.
    // This method does NOT handle the exception itself. Instead, it explicitly
    // throws a new 'Exception' object and declares that it 'throws' it,
    // passing the responsibility to its caller ('doThis()' in this case).
    public void doThat() throws Exception { // 'throws Exception' indicates it might throw this checked exception.
        System.out.println("In doThat: Printing exception (about to throw).");
        // 'throw new Exception("Ouch!")' creates a new Exception object and immediately throws it.
        // Once an exception is thrown, the method execution stops at that point.
        throw new Exception("Ouch! An exception was thrown!");
        // The line below will never be reached because the exception is thrown above it.
        // System.out.println("This line will not be executed in doThat()");
    }

    // Main method for direct testing of the Utils class.
    public static void main(String[] args) {
        Utils util = new Utils(); // Create an instance of Utils.
        util.doThis(); // Call 'doThis()'. 'doThis()' will then call 'doThat()',
        // catch the exception, and handle it.
    }
}

/*
Summary for Utils.java:
-----------------------
This code effectively contrasts the two main ways to deal with **checked exceptions**:

1.  **Handling with `try-catch`:** The `doThis()` method uses a `try-catch` block to internally
    handle the exception thrown by `doThat()`. Because it handles the exception, `doThis()` does
    *not* need a `throws` clause.

2.  **Delegating with `throws`:** The `doThat()` method explicitly throws an exception using
    `throw new Exception()` and uses the `throws Exception` clause in its signature. This means
    `doThat()` itself doesn't handle the exception; it simply declares that it might throw it,
    requiring its caller to handle it.
*/
