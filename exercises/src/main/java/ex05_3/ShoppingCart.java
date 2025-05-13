package ex05_3;

public class ShoppingCart {
    public static void main (String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message;

        // (These variables are present in the file but not directly used in the print statements here)
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;

        // Declare a String array.
        String[] items;
        // Create the array with a size of 4.
        items = new String[4];
        // Assign values to each index of the array.
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";

        // Update message to show the number of items purchased using the array's length.
        message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);

        System.out.println("Items purchased: ");

        // Iterate through and print out the items from the items array using a for-each loop.
        // This is the enhanced for loop (for-each loop).
        // It reads as: "For each String 'item' in the 'items' array..."
        for (String item : items) {
            // ...print the current 'item' followed by ", ".
            System.out.print(item + ", "); // Using print() keeps everything on the same line
        }

        // Print a newline character after the loop finishes to move to the next line in the output.
        System.out.println();

    }
}
