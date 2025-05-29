package lesson_10;

public class Lesson10 {
    public static void main(String[] args) {
        int x = 2, y = 5, z = 0;

        // Ternary operator: checks if y < x
        // If true, z = x; otherwise, z = y
        z = (y < x) ? x : y;
        System.out.println(z); // Outputs 5, because 5 is not less than 2

        int numGoals = 1;

        // Another ternary: chooses "goal" if numGoals is 1, otherwise "goals"
        String s = (numGoals == 1 ? "goal" : "goals");

        // Prints: I scored 1 goal
        System.out.println("I scored " + numGoals + " " + s);
    }
}
