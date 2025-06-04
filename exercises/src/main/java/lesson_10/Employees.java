package lesson_10;

// =============================================================================
// FILE 1: Employees.java - Demonstrates String Comparison and Basic Conditionals
// =============================================================================

// The Employees class demonstrates string comparison and basic conditional logic.
public class Employees {

    // Instance variables (fields) that belong to each Employees object.
    // These are accessible directly if an Employees object is created.
    public String name1 = "Fred Smith";
    public String name2 = "Sam Smith";
    int age = 50; // Default access (package-private), meaning accessible within lesson_10 package.

    // Method to compare if the two names are equal, ignoring case.
    public void areNamesEqual() {
        // String.equalsIgnoreCase() compares the content of two strings
        // without regard to case (e.g., "Fred" is equal to "fred").
        // This is generally the preferred way to compare String content.
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Names are the same.");
        } else {
            System.out.println("Names are different.");
        }
    }

    // The following 'main' methods are commented out in your original code.
    // I've kept them commented as they were provided, but they show different
    // ways to test the class or explore String comparison.

    // public static void main(String[] args) {
    //     // Create an instance of the Employees class to access its fields and methods.
    //     Employees emp = new Employees();
    //     emp.areNamesEqual(); // Call the instance method to compare names.

    //     // Demonstrates a compound conditional statement using logical OR (||) and String.startsWith().
    //     // 'emp.age < 12' checks if the age is less than 12.
    //     // 'emp.name1.startsWith("F")' checks if name1 begins with "F".
    //     // The '||' (OR) operator means the entire condition is true if *at least one* of the sub-conditions is true.
    //     if (emp.age < 12 || emp.name1.startsWith("F")) {
    //         System.out.println("Found him!");
    //     }else {
    //         System.out.println("Can't find him!");
    //     }
    // }

    // public static void main(String[] args) {
    //     //****************************USING NAME STRINGS******************
    //     // This section demonstrates comparing String literals.
    //     // String literals are often optimized by Java to point to the same object in the String Pool
    //     // if their content is identical. However, 'equals()' or 'equalsIgnoreCase()' should always
    //     // be used for content comparison, not '=='.
    //     String name1 = "Fred Smith";
    //     String name2 = "fred Smith";

    //     // Using equalsIgnoreCase() for case-insensitive content comparison.
    //     if (name1.equalsIgnoreCase(name2)) {
    //         System.out.println("Names are the same."); // This will be printed.
    //     } else {
    //         System.out.println("Names are different.");
    //     }
    // }

    // public static void main(String[] args) {
    //     //****************************USING NAME STRINGS NEW STRING() AND ==******************
    //       // This section highlights why '==' should NOT be used for String comparison.
    //       // When you use 'new String()', you explicitly create new objects in memory,
    //       // even if their content is the same.
    //     String name1 = new String("Fred Smith");
    //     String name2 = new String("Fred Smith");

    //     // '==' compares object REFERENCES (memory addresses), not their content.
    //     // Since 'name1' and 'name2' refer to two different objects in memory (due to 'new String()'),
    //     // this condition will be false.
    //     if (name1 == name2) {
    //         System.out.println("Names are the same.");
    //     } else {
    //         System.out.println("Names are different."); // This will be printed.
    //     }
    // }

} // End of Employees class

// =============================================================================
// FILE 2: Lesson10.java - Demonstrates the Ternary Operator
// =============================================================================

/*
Overall Summary of Concepts in Lesson 10:
------------------------------------------
This lesson explores various control flow mechanisms and string handling techniques in Java, essential for making decisions and manipulating text within your programs.

1.  String Comparison (`Employees.java`):
    * **Content vs. Reference Comparison:** Highlights the critical distinction between `==` (which compares object references/memory addresses) and `equals()` or `equalsIgnoreCase()` (which compare the actual content of String objects). Always use `equals()` or `equalsIgnoreCase()` for comparing String content.
    * **Case-Insensitivity:** Demonstrates `equalsIgnoreCase()` for comparing strings without being sensitive to uppercase or lowercase differences.
    * **String Methods:** Shows `startsWith()` for checking if a string begins with a specific prefix.

2.  Conditional Statements (`Employees.java`, `MonthTest.java`):
    * **`if-else`:** The fundamental construct for executing code blocks conditionally.
    * **Logical Operators (`||` - OR):** Used to combine multiple conditions, where the overall condition is true if at least one of the individual conditions is true.

3.  Ternary Operator (`Lesson10.java`):
    * A concise, single-line shorthand for simple `if-else` statements that assign a value to a variable based on a condition. Its syntax is `condition ? value_if_true : value_if_false;`. It's ideal for situations where you need to choose between two values based on a boolean expression.

4.  `switch` Statement (`MonthTest.java`):
    * An alternative to a long chain of `if-else if` statements, particularly useful when you need to perform different actions based on the discrete value of a single variable (like an `int`, `char`, `String`, or `enum`).
    * **`case` Labels:** Define specific values to match.
    * **`break` Keyword:** Crucial for terminating the `switch` block after a matching `case` is executed, preventing "fall-through" to subsequent cases.
    * **`default` Case:** An optional block that executes if none of the `case` labels match the switch expression's value.
    * **Nested Conditionals:** Demonstrates that `if-else` statements can be used within `switch` cases for more complex conditional logic.

Together, these concepts provide powerful tools for controlling program flow and handling textual data effectively in Java.
*/
