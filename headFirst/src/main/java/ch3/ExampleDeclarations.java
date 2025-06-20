package ch3; // Package declaration.

public class ExampleDeclarations { // ExampleDeclarations class.

  // Demonstrates variable declarations and assignments.
  void declarations() {
    int x; // Declare int 'x'.
    x = 234; // Assign 234.

    byte b = 89; // Declare/init byte 'b'.
    boolean isFun = true; // Declare/init boolean 'isFun'.
    double d = 3456.98; // Declare/init double 'd'.
    char c = 'f'; // Declare/init char 'c'.
    int z = x; // Init 'z' with 'x's value.
    boolean isPunkRock; // Declare boolean.
    isPunkRock = false; // Assign 'false'.
    boolean powerOn; // Declare boolean.
    powerOn = isFun; // Assign 'isFun's value.
    long big = 3456789L; // Declare/init long 'big'.
    float f = 32.5f; // Declare/init float 'f'.
  }

  // Demonstrates literals and simple operations.
  void declareLiterals() {
    int x = 234; // Init int 'x' with literal.
    int size = 32; // Init int 'size'.
    char initial = 'j'; // Init char 'initial'.
    double d = 456.709; // Init double 'd'.
    boolean isLearning; // Declare boolean.
    isLearning = true; // Assign 'true'.
    int y = x + 456; // Init 'y' with arithmetic.
  }

  // Illustrates invalid variable names (Java keywords).
  void invalidNames() {
    // INVALID names (Java reserved keywords):
    // int _; // Reserved from Java 9.
    // int abstract; // Keyword
    // ... (other Java keywords) ...

    int exports;    // Contextual keyword from Java 9.
    int module;     // Contextual keyword from Java 9.
    int open;       // Contextual keyword from Java 9.
    int opens;      // Contextual keyword from Java 9.
    int permits;    // Contextual keyword from Java 17.
    int provides;   // Contextual keyword from Java 9.
    int record;     // Keyword from Java 16.
    int requires;   // Contextual keyword from Java 9.
    int sealed;     // Contextual keyword from Java 15.
    int to;         // Keyword from Java 18.
    int transitive; // Contextual keyword from Java 9.
    int uses;       // Contextual keyword from Java 9.
    int var;        // Reserved type name from Java 10.
    int with;       // Contextual keyword from Java 12.
    int yield;      // Contextual keyword from Java 13.

    // int false;    // Literal keyword
    // int true;     // Literal keyword
  }
}

/*
 * Summary:
 * This code demonstrates how to **declare and initialize variables** using various
 * **primitive data types** (like integers, decimals, booleans, characters).
 * It also illustrates using **literal values** and performing simple operations.
 * Crucially, it highlights **Java's reserved keywords** to show which words cannot
 * be used as variable names, including those that became reserved in newer Java versions.
 */
