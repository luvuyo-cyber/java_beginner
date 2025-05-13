package ex05_2;

public class ShoppingCart {
    public static void main (String[] args) {
        // local variables
        String custName = "Mary Smith";
        // Initial message (we'll update this to reflect the number of items)
        String message = custName + " wants to purchase several items.";

        //Declare and initialize the items String array using an array initializer {}.
        // This creates an array of Strings and puts these four values into it.
        String[] items = {"Shirt", "Socks", "Scarf", "Belt"};

        // Change message to show the number of items purchased.
        // The '.length' property of an array tells you how many elements it holds.
        message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);

        // Print an element from the items array.
        // We access elements using their index inside square brackets [].
        // Remember, indexing starts at 0! So, items[2] is the THIRD element.
        System.out.println("Third item: " + items[2]); // Should print "Scarf"

        // This line is commented out because it would cause an error!
        // Trying to access an index that doesn't exist (like index 4 in an array of size 4,
        // where valid indices are 0, 1, 2, 3) causes an ArrayIndexOutOfBoundsException.
        // System.out.println(items[4]);
    }
}
