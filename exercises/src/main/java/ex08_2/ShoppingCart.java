package ex08_2;

public class ShoppingCart {
    public static void main (String[] args) {
        // Create a new Item object.
        Item item1 = new Item();

        // --- Calling the 3-argument setItemFields method ---
        // We provide 3 arguments: a String ("Belt"), an int (1), and a double (29.50).
        // Java looks in the Item class for a method named setItemFields that takes
        // exactly these three types of arguments in this order and calls that version.
        item1.setItemFields("Belt", 1, 29.50);

        // Call displayItem to show the item details set by the 3-arg method.
        // Since the 3-arg method doesn't set color, the colorCode field will still
        // have its default value, 'U'.
        item1.displayItem();

        // --- Calling the 4-argument setItemFields method ---
        // We provide 4 arguments: a String ("Shirt"), an int (1), a double (34.99), and a char (' ').
        // Java looks for a setItemFields method that matches this parameter list.
        // In this specific call, we are using an invalid color code ' '.
        int retcode = item1.setItemFields("Shirt", 1, 34.99, ' ');

        // Check the integer return value from the 4-argument method.
        // If retcode is less than 0 (which is -1 when the color is invalid)...
        if (retcode < 0) {
            // ...print an error message.
            System.out.println("Invalid color code. Item not added!");
        }
        // If retcode is NOT less than 0 (meaning the color was valid and the method returned 1)...
        else {
            // ...display the item details.
            // Note: With the invalid color code ' ', this block will NOT execute.
            item1.displayItem();
        }

    }

}
