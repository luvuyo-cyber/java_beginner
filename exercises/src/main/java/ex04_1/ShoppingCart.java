package ex04_1;

public class ShoppingCart {
public static void main (String[] args) {
    // Declare two String variables and initialize them with values.
    String custName = "Mary Smith";
    String itemDesc = "Shirt";

    // Declare a third String variable 'message'. We won't put anything in it yet.
    String message;

    // Now, we'll build our message using string concatenation.
    // We join the value of custName, a literal string " wants to purchase a ", and the value of itemDesc.
    // The '+' operator is used to join these pieces of text.
    message = custName + " wants to purchase a " + itemDesc;

    // Finally, print the complete message to the console.
    System.out.println(message);
}


}
