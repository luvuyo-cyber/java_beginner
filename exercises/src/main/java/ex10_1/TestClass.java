package ex10_1;

public class TestClass {
    public static void main(String[] args) {
        int x = 4, y = 9; // Initialize two integer variables, x and y.

        // --- Using an if-else statement ---
        // Checks if the result of y / x (integer division, so 9 / 4 = 2) is less than 3.
        if (y / x < 3) {
            x += y; // If true (2 < 3 is true), add y to x (x becomes 4 + 9 = 13).
        } else {
            x *= y; // If false, multiply x by y. (This path is not taken here).
        }

        System.out.println("After if statement: x = " + x);

        // Reset x to its original value for the next test.
        x = 4;
        y = 9;

        // --- Using a ternary operator ---
        // The ternary operator is a shorthand for a simple if-else statement.
        // Syntax: condition ? value_if_true : value_if_false
        // Here, the condition is (y / x < 3).
        // If true, the result of (x += y) is assigned to x.
        // If false, the result of (x *= y) is assigned to x.
        x = ((y / x) < 3) ? (x += y) : (x *= y);
        System.out.println("After ternary operator: x = " + x);

    }
}
