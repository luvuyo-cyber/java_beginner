package ex10_3;

public class ShoppingCart {
    public static void main(String args[]) {
        // Create a new 'Order' object using the 'Order' class.
        // This calls the constructor of 'Order' with the specified details.
        Order order = new Order("Rick Wilson", 910.00, "VA", Order.NONPROFIT);

        // Call the 'getDiscount()' method on the 'order' object.
        System.out.println("Discount is: " + order.getDiscount());
    }
}
