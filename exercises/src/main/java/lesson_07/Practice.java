package lesson_07;

// This class demonstrates String operations and primitive data type behavior in Java.
public class Practice {
    public static void main(String[] args) {

        // =============================
        // STRING CREATION
        // =============================
        String hisName = "Fred Smith";                      // Using a string literal
        String herName = new String("Anne Smith");  // Using the 'new' keyword

        // =============================
        // STRING CONCATENATION
        // =============================
        String myString = "Hello";
        System.out.println(myString);

        myString = myString.concat(" World!");        // Using concat()
        System.out.println(myString);

        myString = myString + "!";                       // Using + operator
        System.out.println(myString);

        // =============================
        // STRING METHODS
        // =============================
        System.out.println("\nString Methods");

        String hello = "Hello World!";
        int strLength = hello.length();                        // Get string length
        System.out.println(strLength);

        String greet = "HOW ".trim();                          // Remove whitespace
        String lc = (greet + "DY").toLowerCase();              // Convert to lowercase
        System.out.println(lc);

        String phoneNum = "404-543-2345";
        int idx1 = phoneNum.indexOf("-");                     // Find first dash
        System.out.println("Index of first dash: " + idx1);

        int idx2 = phoneNum.indexOf("-", idx1 + 1);            // Find second dash
        System.out.println("second dash idx: "+ idx2);

        // =============================
        // STRING BUILDER
        // =============================
        System.out.println("\n---StringBuilder Class---");
        StringBuilder mySB = new StringBuilder("Hello");       // Mutable string
        mySB.append(" World");                                 // Append more text
        System.out.println(mySB);

        // =============================
        // PRIMITIVE DATA TYPES
        // =============================
        System.out.println("\n---Primitive Data Types---");

        int count = 15;
        int a, b, c, d;

        // Post-increment: a = count, then count++
        a = count++;
        b = count;

        // Pre-increment: count++, then c = count
        c = ++count;
        d = count;

        System.out.println(a + ", " + b + ", " + c + ", " + d);

        // Type casting short
        a = 1;
        b = 2;
        c = (short) (a + b);  // Result of a + b cast to short
        System.out.println(a + ", " + b + ", " + c);

        // Integer multiplication and assigning to long
        int num1 = 55555;
        int num2 = 66666;
        long num3 = (long) num1 * num2; // Cast one operand to long to avoid overflow
        System.out.println(num1 + " x " + num2 + " = " + num3);

        // Division between int and double
        int n1 = 7;
        double n2 = 2;
        double n3 = n1 / n2; // Automatically promotes int to double
        System.out.println(n1 + " x " + n2 + " = " + n3);

        // Casting long to int
        int myInt;
        long myLong = 78L;
        myInt = (int) myLong; // Explicit cast from long to int
        System.out.println(myInt);

        // Casting double to int (decimal is truncated)
        double myPercent = 51.9;
        int myInt2 = (int) myPercent;
        System.out.println(myInt2);

        // Casting int to byte (overflow can occur)
        int number1 = 53;
        int number2 = 47;
        byte number3 = (byte)(number1 + number2); // 100 fits in byte, no overflow here
        System.out.println(number1 + " + " + number2 + " = " + number3);
    }
}

/*
Summary:
--------
This program explores:
1. Different ways to create and manipulate strings.
2. Using `StringBuilder` for efficient string modification.
3. Useful string methods like `length`, `indexOf`, `concat`, `trim`, and `toLowerCase`.
4. Primitive data types and operations like:
   - Incrementing (post/pre)
   - Type casting between `int`, `short`, `long`, `double`, and `byte`
   - Understanding implicit vs. explicit conversions
5. Demonstrates potential pitfalls like integer overflow or data truncation.

These concepts are foundational for working with text and numbers in Java.
*/
