package lesson_14; // Declares that this class belongs to the 'lesson_14' package.

public class Lesson14 { // This is the main entry point for this part of the lesson.

    public static void main(String[] args) {
        // Create an instance of the TestArray class.
        // The constructor takes an integer 'size', which will be used to initialize
        // the internal array of the TestArray object. Here, an array of size 5 is created.
        TestArray arr1 = new TestArray(5);

        // Call the 'addElement' method on the 'arr1' object.
        // This line attempts to add the 'value' 23 at 'index' 5.
        // In Java, array indices are 0-based. For an array of size 5, valid indices are 0, 1, 2, 3, 4.
        // Attempting to access index 5 will result in an 'ArrayIndexOutOfBoundsException'.
        // This is an 'unchecked exception' (a type of RuntimeException), meaning the compiler
        // does not force you to handle it with a try-catch block or declare it with 'throws'.
        // However, if it occurs and is not handled, the program will crash.
        arr1.addElement(5, 23);
    }
}

// The 'TestArray' class is designed to manage a simple integer array.
// This class can be in the same file as 'Lesson14' if 'Lesson14' is the only public class,
// or in its own 'TestArray.java' file. For clarity, it's typically in a separate file.
class TestArray {

    // An instance variable: this array belongs to each 'TestArray' object.
    // It's initially declared with size 5, but immediately re-assigned in the constructor.
    int[] intArray = new int[5];

    // Constructor: Takes a 'size' parameter to define the actual size of the array.
    public TestArray(int size) {
        // Re-initializes 'intArray' to a new array of the specified 'size'.
        this.intArray = new int[size]; // 'this.intArray' refers to the instance variable.
    }

    // Method to add an element at a specified 'index' with a given 'value'.
    // This is the method that can cause an 'ArrayIndexOutOfBoundsException'
    // if the provided 'index' is outside the bounds of 'intArray'.
    public void addElement(int index, int value) {
        // This line attempts to assign 'value' to the array element at 'index'.
        // If 'index' is 5 for an array of size 5 (indices 0-4), this will fail.
        intArray[index] = value;
    }
}

/*
Summary for Lesson14.java (and TestArray.java):
------------------------------------------------
This code demonstrates a fundamental concept: **ArrayIndexOutOfBoundsException**. This is a type of
**unchecked exception** (also known as a runtime exception), which occurs when a program tries to access
an array element using an index that is either negative or greater than or equal to the size of the array.
The compiler doesn't force you to handle these types of exceptions, but your program will crash if they
occur during execution and are not caught.
*/
