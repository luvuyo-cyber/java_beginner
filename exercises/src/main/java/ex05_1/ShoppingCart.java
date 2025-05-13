package ex05_1;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        // numeric fields (variables for numbers)
        double price = 21.99;
        int quantity = 1; // Let's start with a quantity greater than 1
        double tax = 1.04;
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        // Calculating total cost (same as before)
        total = (price * quantity) * tax;

        // Declare a boolean variable to track if the item is out of stock.
        // We'll initialize it to 'false' for now (meaning it IS in stock).
        boolean outOfStock = true;

        // Test quantity and modify message if quantity > 1.
        // This is our first 'if' statement.
        // If the 'quantity' variable holds a value greater than 1...
        if (quantity > 1) {
            // ...then we add an "s" to the end of the 'message' string.
            message = message + "s"; // or message += "s"; is a shortcut
        }

        // Test outOfStock and notify user in either case.
        // This is our if-else statement.
        // If the 'outOfStock' variable is true...
        if (outOfStock) {
            // ...print a message saying the item is out of stock.
            System.out.println(itemDesc + " is out of stock.");
        }
        // If the 'outOfStock' variable is false (the 'if' condition is false)...
        else {
        // ...print the regular purchase message and the total cost.
            System.out.println(message);
            System.out.println("Total cost with tax: " + total);
        }
    }
}
