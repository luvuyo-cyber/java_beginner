// This package declaration indicates that these classes belong to 'lesson_09'.
package lesson_09;

// =============================================================================
// FILE 1: Order.java (Demonstrates Encapsulation and Object Interaction)
// =============================================================================

// The 'Order' class contains the main method to run a simple scenario.
public class Order {
    public static void main(String[] args) {
        // Create a Customer object with an ID of 1.
        // This calls the parameterized constructor of the Customer class.
        Customer cust = new Customer(1);

        // Create an Item object.
        // This calls the default (no-argument) constructor of the Item class.
        Item item = new Item();

        // The line below is commented out in the original code.
        // If uncommented, it would set the loyalty points for 'cust' to true.
        // cust.setLoyaltyPoints(true);

        // Call the 'setPrice' method on the 'item' object, passing the 'cust' object as an argument.
        // This demonstrates object interaction: one object (Item) using another object (Customer)
        // to determine its behavior (applying a discount).
        item.setPrice(cust);
    }
}

// The 'Item' class represents a product with a price.
class Item {
    // private double price = 15.50;
    // 'private' is an access modifier. It means this 'price' field can ONLY be accessed
    // directly from within the 'Item' class itself.
    // This is a core principle of ENCAPSULATION: hiding internal data and controlling access to it.
    private double price = 15.50;

    // This method sets the price of the item, potentially applying a discount based on the customer's loyalty status.
    // It takes a 'Customer' object as an argument.
    public void setPrice (Customer cust) {
        // Calls the 'hasLoyaltyDiscount()' method on the 'cust' object.
        // This is how the Item object "asks" the Customer object about its loyalty status.
        if (cust.hasLoyaltyDiscount()) {
            price = price * 0.85; // Apply a 15% discount (price * 0.85)
            System.out.println("Price with discount: " + price);
        } else {
            System.out.println("Price without discount: " + price);
        }
    }
}

// The 'Customer' class represents a customer with an ID and loyalty status.
class Customer {
    // 'private' fields: 'ID' and 'loyaltyPoints' can only be accessed directly within the Customer class.
    private int ID;
    private boolean loyaltyPoints;

    // Constructor: Used to initialize a new Customer object.
    // This is a parameterized constructor, requiring an 'ID' when a Customer object is created.
    public Customer(int ID) {
        this.ID = ID; // 'this.ID' refers to the instance variable 'ID' of the current object.
        // 'ID' refers to the parameter passed to the constructor.
        this.loyaltyPoints = false; // Initialize loyaltyPoints to false by default for new customers.
    }

    // Setter method: Allows controlled modification of the 'loyaltyPoints' field from outside the class.
    // 'public' means it can be called from other classes.
    public void setLoyaltyPoints(boolean loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    // Getter method: Allows controlled reading of the 'loyaltyPoints' field from outside the class.
    // It provides a way to "get" the value of a private field without exposing the field directly.
    public boolean hasLoyaltyDiscount() {
        return loyaltyPoints;
    }
}

/*
Summary of Concepts:
--------------------
This `lesson_09` package demonstrates several fundamental Object-Oriented Programming (OOP) concepts:

1.  Encapsulation (`private` fields, Getters/Setters):
    * **Concept:** Encapsulation is the bundling of data (fields) and methods that operate on the data into a single unit (class). It also involves restricting direct access to some of an object's components.
    * **Implementation:** In Java, this is primarily achieved using the `private` access modifier for fields (e.g., `Item.price`, `Customer.ID`, `Shirt.colourCode`). This means these fields can only be accessed or modified from *within their own class*.
    * **Controlled Access:** To allow other classes to interact with these private fields, **Getter methods** (e.g., `Customer.hasLoyaltyDiscount()`, `Shirt.getColourCode()`) are used to *read* the data, and **Setter methods** (e.g., `Customer.setLoyaltyPoints()`, `Shirt.setColourCode()`) are used to *modify* the data.
    * **Benefits:** Encapsulation protects data from accidental corruption, allows for validation (as seen in `Shirt.setColourCode()`), and makes the code more maintainable and flexible.

2.  Constructors:
    * **Purpose:** Special methods used to initialize new objects when they are created using the `new` keyword. They ensure an object is in a valid state from the moment it's created.
    * **Parameterized Constructors:** Take arguments to set initial values for an object's fields (e.g., `new Customer(1)` calls `Customer(int ID)`).
    * **Default (No-argument) Constructor:** A constructor that takes no arguments (e.g., `new Shirt()` calls `Shirt()`).

3.  Constructor Overloading:
    * **Concept:** A class can have multiple constructors with the same name but different parameter lists (different number of arguments, different types of arguments, or different order of argument types).
    * **Implementation:** The `Shirt` class is a prime example, having constructors with zero, one, two, and three arguments. This provides flexibility in how `Shirt` objects can be initialized.

4.  Constructor Chaining (`this()`):
    * **Concept:** The `this()` keyword (with arguments) allows one constructor to call another constructor within the *same* class.
    * **Implementation:** In `Shirt(char colourCode, double price)`, `this(colourCode)` is used to call the `Shirt(char colourCode)` constructor.
    * **Benefits:** Reduces code duplication and promotes cleaner constructor design by centralizing common initialization logic.

5.  Object Interaction:
    * **Concept:** Objects frequently need to communicate and collaborate.
    * **Implementation:** The `Item` class demonstrates this by calling the `hasLoyaltyDiscount()` method on a `Customer` object (`cust.hasLoyaltyDiscount()`) to determine if a discount should be applied. This shows how different objects can work together to achieve a task.

In essence, this lesson highlights how to design robust and well-structured classes in Java by controlling access to data, providing flexible ways to create objects, and enabling objects to interact responsibly.
*/
