package ex04_2;

public class ShoppingCart {
    public static void main (String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        // Initial message
        String message = custName + " wants to purchase a " + itemDesc;

        // Declare and initialize numeric variables.
        // 'double' for numbers with decimals (price, tax).
        // 'int' for whole numbers (quantity).
        double price = 29.99;
        int quantity = 2;
        double tax = 1.04; //This represents 4% tax (1 + 0.04)

        // Declare 'total' but don't calculate it yet.
        double total;

        // Modify the message to include the quantity purchased.
        // We're concatenating the quantity (an int) with strings. Java automatically
        // converts the number to text for this.
        message = custName + " wants to purchase " + quantity + " " + itemDesc;

        // Print the updated message.
        System.out.println(message);

        // Calculate the total cost.
        // We multiply quantity by price, and then multiply the result by the tax rate.
        total = quantity * price * tax;

        // Print the total cost.
        // Again, Java converts the 'total' double to text for printing.
        System.out.println("Total cost with tax: " + total);



    }
}
