package lesson_11;
// =============================================================================
// FILE 2: ArgumentsTest.java - Demonstrates Command Line Arguments
// =============================================================================

// The ArgumentsTest class demonstrates how to access and use command-line arguments.
public class ArgumentsTest {
    // The 'main' method signature 'String[] args' means it can accept an array of String arguments
    // when the program is run from the command line.
    public static void main(String[] args) {

        // The following lines are commented out in your original code, but show direct access.
        // System.out.println("args[0] is " + args[0]); // Accesses the first argument.
        // System.out.println("args[1] is " + args[1]); // Accesses the second argument.

        // Command-line arguments are always received as Strings.
        // If you need to perform numerical operations, you must parse them to the appropriate type.
        // Integer.parseInt(String): Converts a String to an int.
        int arg1 = Integer.parseInt(args[0]); // Parses the first argument to an integer.
        int arg2 = Integer.parseInt(args[1]); // Parses the second argument to an integer.

        System.out.println("Total is " + (arg1 + arg2)); // Prints the sum of the parsed integers.
    }
}