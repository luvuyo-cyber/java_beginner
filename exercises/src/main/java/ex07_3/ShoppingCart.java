package ex07_3;

public class ShoppingCart {
    public static void main (String[] args) {
        int int1; // Declare an integer variable

        // Declare and initialize variables of type long, float, and char.
        // 'long' is for whole numbers larger than int. The 'L' suffix is required
        // for integer literals that are larger than the maximum value of an int.
        long long1 = 99_000_000_000L; // Underscores improve readability

        // 'float' is for decimal numbers. The 'F' suffix is required for float literals,
        // otherwise, Java treats numbers with decimals as 'double' by default.
        float flt1 = 13.5F;

        // 'char' is for a single character. Use single quotes ''.
        char ch1 = 'U'; // Example: 'U' could represent an 'Undetermined'

        // Print the long variable's value.
        System.out.println("long1: " + long1);

        // Assign the long variable's value to the int variable.
        // This is a NARROWING conversion (long has a larger range than int).
        // Java requires EXPLICIT CASTING with (int) to perform this conversion.
        // This tells Java, "I know this might lose data, but I want to do it."
        // The maximum value for an int is about 2.1 billion. 99 billion is much larger.
        // When casting a value larger than int's max, the value wraps around or truncates,
        // resulting in an unexpected value in the int variable.
        int1 = (int) long1;
        System.out.println("Long assigned to int variable: " + int1);

        // You could also print the float and char variables:
        // System.out.println("flt1: " + flt1);
        // System.out.println("ch1: " + ch1);

    }
}
