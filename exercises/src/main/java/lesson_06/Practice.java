package lesson_06;

// This class demonstrates working with objects and classes in Java.
public class Practice {
    public static void main(String[] args) {

        // Creating two Customer objects
        Customer cust1 = new Customer();
        Customer cust2 = new Customer();

        // =============================
        // CHANGING FIELD VALUES
        // =============================

        // Modifying fields of the Customer object
        cust1.age = 40;           // Setting the age of cust1 to 40
        cust2.name = "Duke";     // Changing the name of cust2

        // =============================
        // CALLING METHODS ON OBJECTS
        // =============================

        // Using methods defined in the Customer class
        cust1.displayCustomer(); // Prints the name of cust1
        cust2.displayCustomer(); // Prints the name of cust2

        // =============================
        // ACCESSING METHODS OF OTHER OBJECTS
        // =============================

        // Customer has a Cart object. We're calling a method on that Cart.
        cust1.cart.Cancel();     // Calls the Cancel method in the Cart class

        // Example of creating multiple Item objects (commented out)
         Item[] items = {new Item(), new Item(), new Item()};
    }
}

// =============================
// CUSTOMER CLASS
// =============================
class Customer {
    // Fields (properties of a Customer)
    public String name = "Junior Duke"; // Default name
    public Cart cart = new Cart();      // Each customer has a Cart
    public int custID = 1205;           // Customer ID
    public String address;              // Address (uninitialized)
    public int orderNum;                // Order number (uninitialized)
    public int age;                     // Age (uninitialized)

    // Method to display the customer's name
    public void displayCustomer() {
        System.out.println("Customer: " + name);
    }
}

// =============================
// CART CLASS
// =============================
class Cart {
    // Fields related to a cart
    public Item[] items;    // An array to hold items in the cart
    public String date;     // The date of the cart/order
    public double total;    // Total cost of items in the cart

    // Method to simulate cancelling the cart
    public void Cancel() {
        System.out.println("Cancelling order...");
    }
}

// =============================
// ITEM CLASS
// =============================
class Item {

}

/*
Summary:
--------
This Java program demonstrates the use of classes and objects:
1. How to create objects (`Customer`, `Cart`, `Item`).
2. Access and modify object fields (e.g., setting age, name).
3. Call methods defined inside classes (e.g., `displayCustomer`, `Cancel`).
4. How classes can contain instances of other classes (e.g., a `Customer` has a `Cart`).
5. Example structure for expanding with arrays of objects like `Item[]`.

This is foundational for understanding Object-Oriented Programming (OOP) in Java.
*/
