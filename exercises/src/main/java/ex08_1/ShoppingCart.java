package ex08_1;

public class ShoppingCart {
    public static void main (String[] args) {
        // Create a new Item object from our blueprint.
        Item item1 = new Item();

        // Call the setColor method on the 'item1' object.
        // We pass the character 'B' as the argument for the 'colorCode' parameter.
        // The setColor method will execute and return a boolean value (true or false).
        // We can use the result of the method call directly in an if statement!
        // If item1.setColor('B') returns true...
        if (item1.setColor('B')) { // Attempting to set the color to 'B'
            // ...then this block of code runs.
            // We print the value of the 'color' field of the 'item1' object.
            System.out.println("Item1.color: " + item1.color); // Expected Output: Item1.color = B
        }
        // If item1.setColor('B') returns false...
        else {
            // ...then this block of code runs.
            // We print a message indicating the color was invalid.
            System.out.println("Invalid color!");
        }

        // --- Experiment! ---
        // Try changing the character inside setColor() to a space ' ' like this:
        // if (item1.setColor(' ')) {
        //     System.out.println("Item1.color = " + item1.color);
        // } else {
        //     System.out.println("Invalid color"); // This line would be printed
        // }
        // Run the code again and observe the different output.

    }
}
