package ex09_2;

public class ShoppingCart {
    public static void main (String[] args) {
        // Declare, instantiate, and initialize a Customer object:
        Customer cust1 = new Customer("Bob Miller", "555-44-3212");

        // Print the customer object's name:
        // Calls the 'getName()' method on the 'cust1' object to retrieve its name.
        System.out.println("Customer name: " + cust1.getName());
    }
}
