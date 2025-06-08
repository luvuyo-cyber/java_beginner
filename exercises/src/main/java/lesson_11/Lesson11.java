package lesson_11;

import java.util.ArrayList; // Import for using the ArrayList class
import java.time.*; // Import for core date and time classes (LocalDate, LocalDateTime)
import java.time.chrono.JapaneseDate; // Import for Japanese calendar system
import java.time.format.DateTimeFormatter; // Import for formatting date and time
import java.time.format.FormatStyle; // Import for predefined formatting styles

// The Lesson11 class serves as the main entry point for demonstrating various Java concepts.
public class Lesson11 {

    public static void main(String[] args) {

        // =====================================================================
        // SECTION 1: DATE AND TIME API (java.time package)
        // =====================================================================
        // Java's modern Date and Time API (introduced in Java 8) provides robust
        // classes for handling dates, times, and durations.

        // LocalDate: Represents a date (year, month, day) without time or time-zone.
        LocalDate myDate = LocalDate.now(); // Gets the current date.
        System.out.println("Today's date is " + myDate); // Output: Today's date is YYYY-MM-DD

        // Manipulating LocalDate: minusMonths() subtracts a specified number of months.
        LocalDate newDate = myDate.minusMonths(10);
        System.out.println("The new date is " + newDate); // Output: Date 10 months ago

        // JapaneseDate: Represents a date in the Japanese Imperial calendar system.
        // 'from()' static method converts a Temporal object (like LocalDate) to JapaneseDate.
        JapaneseDate jDate = JapaneseDate.from(myDate);
        System.out.println("Today's date in Japan is " + jDate); // Output: Japanese calendar date

        // LocalDateTime: Represents a date and time without a time-zone.
        LocalDateTime today = LocalDateTime.now(); // Gets the current date and time.
        System.out.println("Today's date (without formatting) is " + today); // Output: YYYY-MM-DDTHH:MM:SS.NNN

        // DateTimeFormatter: Used to format and parse dates and times.
        // ISO_DATE_TIME: A predefined formatter for ISO 8601 standard date-time format.
        String sdate = today.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Today's date (in ISO_DATE_TIME format) is " + sdate);

        // ofLocalizedDate(FormatStyle): Creates a formatter based on locale-specific styles.
        // FormatStyle.MEDIUM: A medium length format (e.g., "Oct 26, 2023").
        String fdate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Today's date (in Medium Localized format) is " + fdate);

        // =====================================================================
        // SECTION 2: 2D ARRAYS (Multidimensional Arrays)
        // =====================================================================
        // 2D arrays are arrays of arrays, useful for representing grids or tables.
        // 'int[][]' means an array where each element is itself an array of integers.

        int[][] yearlySales; // Declaration: Declares a 2D array variable.
        yearlySales = new int[5][4]; // Initialization: Creates a 2D array with 5 rows and 4 columns.
        // All elements are initialized to 0 by default for int arrays.

        // Accessing and assigning values to specific elements using row and column indices.
        // Indices are 0-based (row 0, column 0 is the first element).
        yearlySales[0][0] = 1000; // First row, first column
        yearlySales[0][1] = 1500; // First row, second column
        yearlySales[0][2] = 1800; // First row, third column
        yearlySales[1][0] = 1000; // Second row, first column
        yearlySales[3][3] = 2000; // Fourth row, fourth column

        // Example of iterating and printing a 2D array (using the initArray method below).
        int[][] sales = new int[3][4]; // Declare and initialize a 3x4 2D array.
        int[][] salesArray = initArray(sales); // Call a helper method to populate the array.
        System.out.println("\nYearly sales by quarter beginning 2010:");
        // Nested for loops are typically used to iterate through 2D arrays.
        // The outer loop iterates through rows.
        for (int i = 0; i < salesArray.length; i++) { // salesArray.length gives the number of rows.
            // The inner loop iterates through columns for the current row.
            for (int j = 0; j < salesArray[i].length; j++) { // salesArray[i].length gives the number of columns in row 'i'.
                System.out.println("\tQ" + (j + 1) + " " + salesArray[i][j]);
            }
            System.out.println(); // New line after each row (year).
        }


        // =====================================================================
        // SECTION 3: LOOPS - Repeating Actions
        // =====================================================================

        //******************WHILE LOOP*****************
        // A 'while' loop executes a block of code repeatedly as long as a condition is true.
        // The condition is checked *before* each iteration.
        System.out.println("\n/*");
        int counter = 0; // Initialization of loop control variable.
        while(counter < 3) { // Condition: Loop as long as 'counter' is less than 3.
            System.out.println(" *");
            counter++; // Update: Increment 'counter' to eventually make the condition false.
        }
        System.out.println("/*");

        //******************FOR LOOP*****************
        // A 'for' loop is ideal when you know exactly how many times you want to loop.
        // It combines initialization, condition, and update into a single line.
        System.out.println("\n---For Loop---");
        for (int i = 0; i < 5; i++) { // (Initialization; Condition; Update)
            System.out.print("i = " + i + "; ");
        }

        System.out.println("\n---Convert to While-Loop---");
        // This shows how a standard 'for' loop can be rewritten as a 'while' loop.
        int i = 0; // Initialization
        while(i < 5) { // Condition
            System.out.print("i = " + i + "; ");
            i++; // Update
        }

        System.out.println("\n---Enhanced For-Loop (For-Each Loop)---");
        // The enhanced for loop (or for-each loop) is used for iterating over arrays
        // and collections. It simplifies traversal without needing an index.
        String[] names = {"Luvuyo", "Fisokuhle", "Mazibuko"};
        for (String n : names) { // For each 'String n' in the 'names' array...
            System.out.println(n);
        }

        //******************DO WHILE LOOP*****************
        // A 'do-while' loop is similar to a 'while' loop, but it guarantees that
        // the loop body will execute *at least once* because the condition is
        // checked *after* the first iteration.
        // See the 'factorial' method definition below for its usage.
        factorial(5);  // Calculates 5! (5 * 4 * 3 * 2 * 1)
        factorial(10); // Calculates 10!

        //---Skipping something in an array while looping (using 'continue')---
        // 'continue' keyword: Skips the rest of the current iteration of a loop
        // and proceeds to the next iteration.
        System.out.println("\n---Skipping elements with 'continue'---");
        String[] teamMembers = {"Luvuyo", "Fisokuhle", "Unavailable", "Mazibuko"};
        for (int idx = 0; idx < teamMembers.length; idx++) {
            if (teamMembers[idx].equalsIgnoreCase("Unavailable")) {
                continue; // If the name is "Unavailable", skip to the next iteration.
            }
            System.out.println(teamMembers[idx]); // Only prints available names.
        }

        //******************NESTED WHILE LOOP (Example: Guessing Game)*****************
        // Nested loops are loops inside other loops. The inner loop completes all its
        // iterations for each single iteration of the outer loop.
        System.out.println("\n---Nested While Loop (Guessing Game)---");
        String secretName = "Lenny";
        String guess = "";
        int attempts = 0;
        // Outer loop: Continues until the 'guess' matches 'secretName'.
        while (!guess.equalsIgnoreCase(secretName)) {
            guess = ""; // Reset guess for each new attempt.
            // Inner loop: Builds a random string of the same length as 'secretName'.
            while (guess.length() < secretName.length()) {
                // Generates a random lowercase letter (ASCII 'a' is 97).
                char asciiChar = (char) (Math.random() * 26 + 97);
                guess += asciiChar; // Appends the random character to the guess.
            }
            attempts++; // Increment attempt counter for each full guess.
        }
        System.out.println(secretName + " found after " + attempts + " tries!");

        //******************NESTED FOR LOOP (Example: Drawing a Rectangle)*****************
        System.out.println("\n---Nested For Loop (Drawing Rectangle)---");
        int h = 4, w = 10; // Height and width for the rectangle.

        // Outer loop: Controls the rows (height).
        for (int row = 0; row < h; row++) {
            // Inner loop: Controls the columns (width) for each row.
            for (int col = 0; col < w; col++) {
                System.out.print("@"); // Print '@' without a new line.
            }
            System.out.println(); // Move to the next line after each row is complete.
        }

        // =====================================================================
        // SECTION 4: ArrayList - Dynamic Arrays (Collections)
        // =====================================================================
        // ArrayList is a part of Java Collections Framework. It's a resizable array,
        // meaning you don't have to specify its size upfront, and it can grow or shrink.
        // It stores objects (not primitive types directly, but autoboxing handles it).

        ArrayList<String> namesList; // Declaration: Declares an ArrayList that will hold String objects.
        namesList = new ArrayList(); // Initialization: Creates an empty ArrayList.
        // The <> after ArrayList is called the diamond operator (type inference).

        // .add(element): Adds an element to the end of the ArrayList.
        namesList.add("Jamie");
        namesList.add("Gustav");
        namesList.add("Alisa");
        namesList.add("Jose");
        // .add(index, element): Inserts an element at a specific index.
        // Elements at and after that index are shifted to the right.
        namesList.add(2, "Prashant"); // Inserts "Prashant" at index 2.
        System.out.println("\nArrayList after additions and insertion: " + namesList);
        System.out.println();

        // .remove(index): Removes the element at the specified index.
        namesList.remove(0); // Removes "Jamie" (the first element).
        // .remove(namesList.size() - 1): Removes the last element.
        namesList.remove(namesList.size() - 1); // Removes "Jose".
        // .remove(Object element): Removes the first occurrence of the specified element.
        namesList.remove("Gustav"); // Removes "Gustav".

        System.out.println("ArrayList after removals: " + namesList); // Output: [Prashant, Alisa]

    } // End of main method

    // =====================================================================
    // HELPER METHODS USED IN MAIN
    // =====================================================================

    // Method to initialize a 2D array with sequential sales amounts.
    // Takes a 2D integer array as input and returns the populated array.
    public static int[][] initArray(int[][] salesArray) {
        int salesAmt = 100; // Starting sales amount.
        // Outer loop for rows.
        for (int outer = 0; outer < 3; outer++) {
            // Inner loop for columns.
            for (int inner = 0; inner < 4; inner++) {
                salesArray[outer][inner] = salesAmt++; // Assign value and then increment salesAmt.
            }
        }
        return salesArray; // Return the modified array.
    }

    // Method to calculate the factorial of a number using a 'do-while' loop.
    // Factorial of N (N!) is the product of all positive integers less than or equal to N.
    static void factorial(int target) {
        int save = target; // Store original 'target' value for printing.
        int fact = 1;      // Initialize factorial result.
        do {
            fact *= target--; // Multiply 'fact' by 'target', then decrement 'target'.
            // This ensures the loop runs at least once, even if target is 0 or 1.
        } while (target > 0); // Condition: Continue as long as 'target' is greater than 0.
        System.out.println("Factorial for " + save + ": " + fact);
    }
}

/*
Overall Summary of Concepts in Lesson 11:
------------------------------------------
This lesson covers a wide array of fundamental Java programming concepts, crucial for building more dynamic and interactive applications:

1.  Date and Time API (`java.time`):
    * Introduces modern classes like `LocalDate` (date only), `LocalDateTime` (date and time), and `JapaneseDate` (alternative calendar systems).
    * Demonstrates basic date manipulation (e.g., `minusMonths()`).
    * Shows how to format date and time objects into readable strings using `DateTimeFormatter` and `FormatStyle`.

2.  2D Arrays (Multidimensional Arrays):
    * Explains how to declare, initialize, and access elements in two-dimensional arrays, which are useful for representing tabular data or grids.
    * Illustrates the use of nested `for` loops to iterate through rows and columns of a 2D array.

3.  Loops (`while`, `for`, `do-while`, `continue`):
    * **`while` loop:** Executes a block of code repeatedly as long as a condition remains true (condition checked *before* each iteration).
    * **`for` loop:** A compact loop structure ideal when the number of iterations is known (initialization, condition, and update in one line).
    * **Enhanced `for` loop (for-each):** Simplifies iteration over arrays and collections, making code more readable by directly accessing elements.
    * **`do-while` loop:** Guarantees that the loop body executes at least once, as its condition is checked *after* the first iteration.
    * **`continue` keyword:** Used within loops to skip the remainder of the current iteration and proceed to the next one.
    * **Nested Loops:** Demonstrates loops within loops, essential for tasks like iterating through 2D arrays or generating patterns/complex searches.

4.  `ArrayList` (Dynamic Arrays/Collections):
    * Introduces `ArrayList`, a part of Java's Collections Framework, which provides a resizable array implementation. Unlike traditional arrays, `ArrayLists` can grow or shrink dynamically.
    * Shows common `ArrayList` operations: `add()` (to append or insert at an index) and `remove()` (to remove by index or by object value).

5.  Command Line Arguments (`String[] args` in `main`):
    * Explains how Java programs can receive input directly when executed from the command line.
    * Shows how to access these arguments via the `args` array (which holds them as `String`s).
    * Demonstrates the necessity of parsing string arguments to numerical types (e.g., `Integer.parseInt()`) if mathematical operations are required.

These concepts collectively empower you to write Java programs that can handle diverse data types, perform repetitive tasks efficiently, manage dynamic collections of data, and interact with the execution environment.
*/
