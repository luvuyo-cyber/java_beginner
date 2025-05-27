package ex10_2;

public class ShoppingCart {
    public static void main(String[] args) {
        // Create a new Order object:
        // Customer: "Rick Wilson", Total: 910.00, State: "VA", Type: NONPROFIT
        Order order = new Order("Rick Wilson", 910.00, "VA", Order.NONPROFIT);

        // Print the calculated discount:
        // Calls the 'getDiscount()' method on the 'order' object.
        System.out.println("Discount is: " + order.getDiscount());
        // Expected output based on Order.java logic for NONPROFIT and total > 900: "Discount is: 10.0%"
    }
}
