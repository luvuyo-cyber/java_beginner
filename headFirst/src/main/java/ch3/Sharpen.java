package ch3; // Package declaration

public class Sharpen { // Class definition

  void sharpen() { // Method to demonstrate type rules
    // int x = 34.5; // ERROR: Cannot assign decimal to int
    // boolean boo = x; // ERROR: Cannot assign int to boolean

    int g = 17; // Integer variable
    int y = g; // Valid: same type
    y = y + 10; // Add 10 to y

    short s; // Short variable
    // s = y; // ERROR: int to short needs cast

    byte b = 3; // Byte variable
    byte v = b; // Valid: same type

    short n = 12; // Short variable
    // v = n; // ERROR: short to byte needs cast

    // byte k = 128; // ERROR: 128 is too big for byte
  }
}

/*
 * Summary:
 * - Java has primitive types like int, byte, short, boolean, etc.
 * - Types must match. You can't assign a decimal to an int or a number to a boolean.
 * - "Widening" (small to big type) is safe and automatic.
 * - "Narrowing" (big to small type) needs a cast and may lose data.
 * - Each type has a value range. Exceeding it causes an error.
 * - The compiler catches these issues before the program runs.
 */
