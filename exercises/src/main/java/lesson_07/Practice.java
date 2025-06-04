package lesson_07;

// This class demonstrates String operations and primitive data type behavior in Java.
public class Practice {
    public static void main(String[] args) {

        // =====================================================================
        // SECTION 1: STRING CREATION - How to make text variables
        // =====================================================================
        // Strings are sequences of characters (like words or sentences).
        // In Java, Strings are IMMUTABLE, meaning once created, their content cannot be changed.
        // Any operation that seems to change a String actually creates a NEW String.

        String hisName = "Fred Smith"; // Method 1: Using a string literal (most common and efficient)
        // Java puts this string directly into a special memory area called the "String Pool".

        String herName = new String("Anne Smith"); // Method 2: Using the 'new' keyword
        // This forces Java to create a NEW String object in the regular memory heap,
        // even if "Anne Smith" already exists in the String Pool.
        // Generally, prefer string literals unless you have a specific reason for 'new String()'.

        // =====================================================================
        // SECTION 2: STRING CONCATENATION - Joining text together
        // =====================================================================
        String myString = "Hello";
        System.out.println(myString); // Output: Hello

        // myString.concat(" World!") does NOT change the original 'myString'.
        // Instead, it creates a NEW String "Hello World!" and we reassign 'myString' to point to this new String.
        myString = myString.concat(" World!"); // Using the concat() method
        System.out.println(myString); // Output: Hello World!

        // The '+' operator is generally preferred for concatenation as it's often more readable
        // and optimized by the Java compiler (especially for multiple concatenations).
        // Again, this creates a NEW String "Hello World!!" and 'myString' points to it.
        myString = myString + "!"; // Using the + operator
        System.out.println(myString); // Output: Hello World!!

        // =====================================================================
        // SECTION 3: STRING METHODS - Useful actions you can perform on Strings
        // =====================================================================
        System.out.println("\nString Methods"); // Just a separator for output

        String hello = "Hello World!";
        int strLength = hello.length(); // .length() returns the number of characters in the string.
        System.out.println(strLength); // Output: 12 (includes space and exclamation mark)

        String greet = "HOW ".trim(); // .trim() removes leading and trailing whitespace.
        // "HOW " becomes "HOW"
        String lc = (greet + "DY").toLowerCase(); // .toLowerCase() converts all characters to lowercase.
        // "HOW" + "DY" becomes "HOWDY", then "howdy"
        System.out.println(lc); // Output: howdy

        String phoneNum = "404-543-2345";
        // .indexOf(char/String) finds the FIRST occurrence of a character or substring.
        // It returns the index (position) where it's found, starting from 0.
        // If not found, it returns -1.
        int idx1 = phoneNum.indexOf("-"); // Finds the first dash.
        System.out.println("Index of first dash: " + idx1); // Output: Index of first dash: 3 (0-indexed: 4 is at 0, 0 at 1, 4 at 2, - at 3)

        // .indexOf(char/String, startIndex) finds the first occurrence STARTING from 'startIndex'.
        int idx2 = phoneNum.indexOf("-", idx1 + 1); // Finds the second dash, starting search AFTER the first one.
        System.out.println("second dash idx: "+ idx2); // Output: second dash idx: 7 (404-543-2345, the second - is at index 7)

        // =====================================================================
        // SECTION 4: STRING BUILDER - For when you need to change strings efficiently
        // =====================================================================
        System.out.println("\n---StringBuilder Class---");
        // Unlike String, StringBuilder is MUTABLE. This means you can change its content
        // without creating new objects repeatedly. This is much more efficient for
        // building strings in loops or when many modifications are needed.
        StringBuilder mySB = new StringBuilder("Hello"); // Create a StringBuilder object
        mySB.append(" World"); // .append() adds text to the END of the current StringBuilder.
        // It modifies the StringBuilder object itself.
        System.out.println(mySB); // Output: Hello World

        // =====================================================================
        // SECTION 5: PRIMITIVE DATA TYPES - Working with raw numbers
        // =====================================================================
        // Primitive data types store simple values directly (e.g., numbers, true/false).
        // They are NOT objects.

        System.out.println("\n---Primitive Data Types---");

        int count = 15; // 'int' is a whole number (integer) type.
        int a, b, c, d; // Declare multiple integer variables.

        // Post-increment (count++):
        // 1. Use the current value of 'count' (15) for the assignment to 'a'.
        // 2. THEN, increment 'count' by 1 (count becomes 16).
        a = count++;
        b = count; // 'b' gets the new value of 'count' (16).

        // Pre-increment (++count):
        // 1. FIRST, increment 'count' by 1 (count becomes 17).
        // 2. THEN, use the NEW value of 'count' (17) for the assignment to 'c'.
        c = ++count;
        d = count; // 'd' gets the current value of 'count' (17).

        System.out.println(a + ", " + b + ", " + c + ", " + d); // Output: 15, 16, 17, 17

        // --- Type Casting ---
        // Converting a value from one data type to another.

        // Casting to 'short':
        // 'short' is a smaller whole number type than 'int'.
        a = 1;
        b = 2;
        // (a + b) results in an 'int' (3).
        // We are explicitly casting this 'int' result to a 'short'.
        // This is safe here because 3 fits within a 'short'.
        c = (short) (a + b);
        System.out.println(a + ", " + b + ", " + c); // Output: 1, 2, 3

        // Integer multiplication and assigning to 'long' (to prevent overflow):
        // 'int' has a limited range (approx -2 billion to +2 billion).
        // Multiplying two large ints can exceed this range, causing an "overflow"
        // where the result wraps around to a negative number or an incorrect positive number.
        int num1 = 55555;
        int num2 = 66666;
        // To prevent overflow, we cast ONE of the operands to 'long' BEFORE multiplication.
        // When one operand is 'long', the entire expression is promoted to 'long',
        // and the result will also be 'long', which has a much larger range.
        long num3 = (long) num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + num3); // Output: 55555 x 66666 = 3703629330 (correct, fits in long)

        // Division between 'int' and 'double':
        // 'double' is a floating-point number type (can store decimals).
        int n1 = 7;
        double n2 = 2;
        // When an 'int' (n1) is divided by a 'double' (n2), Java automatically
        // "promotes" the 'int' to a 'double' before performing the division.
        // This ensures floating-point division, giving a decimal result.
        double n3 = n1 / n2;
        System.out.println(n1 + " x " + n2 + " = " + n3); // Output: 7 x 2.0 = 3.5

        // Casting 'long' to 'int':
        // 'long' is a larger whole number type than 'int'.
        int myInt;
        long myLong = 78L; // 'L' suffix indicates a long literal.
        // Explicit cast is required when converting a larger type to a smaller type,
        // as there's a potential for data loss if the 'long' value is too big for an 'int'.
        myInt = (int) myLong;
        System.out.println(myInt); // Output: 78

        // Casting 'double' to 'int' (decimal is truncated):
        double myPercent = 51.9;
        // When casting a 'double' to an 'int', the decimal part is simply cut off (truncated),
        // it's NOT rounded.
        int myInt2 = (int) myPercent;
        System.out.println(myInt2); // Output: 51

        // Casting 'int' to 'byte' (potential overflow):
        // 'byte' is the smallest whole number type (range -128 to 127).
        int number1 = 53;
        int number2 = 47;
        // (number1 + number2) results in an 'int' (100).
        // We explicitly cast this 'int' to a 'byte'.
        // 100 fits within the 'byte' range, so no overflow happens here.
        // If the sum were, say, 150, it would overflow and result in a different number.
        byte number3 = (byte)(number1 + number2);
        System.out.println(number1 + " + " + number2 + " = " + number3); // Output: 53 + 47 = 100
    }
}

/*
Summary of Concepts:
--------------------
This program effectively teaches you about two crucial aspects of Java:

1.  Strings (Text):
    * Immutability: The most important concept for `String` objects is that they cannot be changed after they are created. Any operation that seems to modify a `String` (like `concat()` or using `+`) actually produces a *new* `String` object.
    * Creation: You learned two ways to create strings: using string literals (e.g., "Hello", which is common and efficient) and using the `new String()` constructor.
    * Manipulation: You saw how to join strings together (`concat()` and `+`) and use various built-in methods like `length()` (to get its size), `trim()` (to remove extra spaces), `toLowerCase()` (to change case), and `indexOf()` (to find characters).
    * `StringBuilder` (Mutable Text): For situations where you need to build or modify strings many times (e.g., in a loop), `StringBuilder` is a much more efficient alternative to `String` because it *is* mutable, meaning you can change its content directly without creating new objects repeatedly.

2.  Primitive Data Types (Numbers and simple values):
    * Direct Storage: Unlike objects, primitive types store their values directly in memory.
    * Increment/Decrement Operators: You learned the difference between `++` placed *after* a variable (post-increment, uses value then increments) and `++` placed *before* a variable (pre-increment, increments then uses value).
    * Type Casting: This is about converting a value from one data type to another.
        * Implicit Casting (Automatic): Java sometimes automatically converts a smaller, compatible type to a larger type (e.g., `int` to `double`) to prevent data loss.
        * Explicit Casting (Manual): You *must* tell Java to convert a larger type to a smaller type (e.g., `long` to `int`, `double` to `int`) using `(type)value`. This is because there's a risk of **data loss** (e.g., if the number is too big for the smaller type, or if decimals are truncated).
        * Preventing Overflow: A key takeaway was how to use `long` in multiplication to prevent an `int` overflow, which can lead to incorrect results.

These concepts are absolutely foundational for writing any meaningful Java program, allowing you to handle both textual information and numerical calculations effectively.
*/
