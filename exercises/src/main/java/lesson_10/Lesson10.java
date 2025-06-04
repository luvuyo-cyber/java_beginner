package lesson_10;
// =============================================================================
// FILE 2: Lesson10.java - Demonstrates the Ternary Operator
// =============================================================================

// The Lesson10 class demonstrates the use of the ternary operator.
public class Lesson10 {
    public static void main(String[] args) {
        int x = 2, y = 5, z = 0;

        // Ternary operator: A concise way to write a simple if-else statement.
        // Syntax: condition ? value_if_true : value_if_false;
        // It evaluates the 'condition'. If true, it returns 'value_if_true'; otherwise, it returns 'value_if_false'.
        z = (y < x) ? x : y;
        // Condition: (y < x) -> (5 < 2) which is false.
        // So, the value after the colon (y) is assigned to z.
        System.out.println(z); // Outputs 5, because 5 is not less than 2

        int numGoals = 1;

        // Another ternary example: used to choose between singular and plural forms of a word.
        // Condition: (numGoals == 1) -> (1 == 1) which is true.
        // So, the value before the colon ("goal") is assigned to s.
        String s = (numGoals == 1 ? "goal" : "goals");

        // Prints the combined string.
        System.out.println("I scored " + numGoals + " " + s); // Prints: I scored 1 goal
    }
}