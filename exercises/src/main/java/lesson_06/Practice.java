package lesson_06;

// This class demonstrates working with objects and classes in Java.
// It serves as the main entry point (contains the 'main' method) for our program.
public class Practice {
    public static void main(String[] args) {

        // =====================================================================
        // SECTION 1: CREATING OBJECTS - Bringing Blueprints to Life
        // =====================================================================
        // In Java, a 'class' is a blueprint, and an 'object' is an actual instance
        // (a tangible thing) created from that blueprint.

        // Creating two Customer objects:
        // 'new Customer()' uses the Customer blueprint to create a new Customer object in memory.
        // 'cust1' and 'cust2' are variables that hold references (memory addresses) to these new objects.
        // Each object (cust1 and cust2) is a separate, independent instance of the Customer class.
        Customer cust1 = new Customer();
        Customer cust2 = new Customer();

        // =====================================================================
        // SECTION 2: CHANGING FIELD VALUES - Customizing Your Objects
        // =====================================================================
        // Fields (also called instance variables) are the properties or data that
        // each object of a class possesses. You can access and modify them using
        // the object's reference followed by a dot (.).

        // Modifying fields of the Customer object:
        // For 'cust1', we are setting its 'age' field.
        cust1.age = 40;           // Setting the age of cust1 to 40. cust2's age remains its default (0 for int).

        // For 'cust2', we are changing its 'name' field.
        cust2.name = "Duke";     // Changing the name of cust2. cust1's name remains its default ("Junior Duke").

        // =====================================================================
        // SECTION 3: CALLING METHODS ON OBJECTS - Making Your Objects Perform Actions
        // =====================================================================
        // Methods are the behaviors or actions that objects can perform.
        // You call a method on a specific object using the object's reference followed by a dot and the method name.

        // Using methods defined in the Customer class:
        // 'cust1.displayCustomer()' tells the 'cust1' object to execute its 'displayCustomer' method.
        // This method will print the 'name' field of the 'cust1' object.
        cust1.displayCustomer(); // Prints "Customer: Junior Duke" (since cust1's name was not changed)

        // 'cust2.displayCustomer()' tells the 'cust2' object to execute its 'displayCustomer' method.
        // This method will print the 'name' field of the 'cust2' object.
        cust2.displayCustomer(); // Prints "Customer: Duke" (since cust2's name was changed to "Duke")

        // =====================================================================
        // SECTION 4: ACCESSING METHODS OF OTHER OBJECTS (Object Composition)
        // =====================================================================
        // Objects can contain other objects as their fields. This is known as "composition"
        // or a "has-a" relationship (e.g., a Customer "has a" Cart).
        // You can chain dot operators to access methods of these nested objects.

        // Customer has a Cart object (see Customer class definition).
        // We're calling a method on the 'Cart' object that belongs to 'cust1'.
        // 'cust1.cart' accesses the 'cart' field of the 'cust1' object.
        // '.Cancel()' then calls the 'Cancel' method on that specific 'cart' object.
        cust1.cart.Cancel();     // Calls the Cancel method in the Cart class, printing "Cancelling order..."

        // Example of creating multiple Item objects (commented out):
        // This line shows how you could create an array of 'Item' objects.
        // Item[] items = {new Item(), new Item(), new Item()};
    }
} // End of Practice class

// =============================================================================
// CUSTOMER CLASS - The Blueprint for Customer Objects
// =============================================================================
// This class defines what a "Customer" is and what it can do.
class Customer {
    // Fields (properties of a Customer): These are instance variables.
    // Each 'Customer' object will have its own copy of these fields.
    public String name = "Junior Duke"; // Default name for new Customer objects.
    public Cart cart = new Cart();      // Each customer object automatically gets its own new 'Cart' object.
    // This demonstrates object composition (a Customer "has a" Cart).
    public int custID = 1205;           // Default Customer ID.
    public String address;              // Address field, uninitialized (will be null by default for String).
    public int orderNum;                // Order number field, uninitialized (will be 0 by default for int).
    public int age;                     // Age field, uninitialized (will be 0 by default for int).

    // Method to display the customer's name: This is an instance method.
    // It operates on the 'name' field of the specific Customer object it is called upon.
    public void displayCustomer() {
        System.out.println("Customer: " + name);
    }
} // End of Customer class

// =============================================================================
// CART CLASS - The Blueprint for Cart Objects
// =============================================================================
// This class defines what a "Cart" is and what it can do.
class Cart {
    // Fields related to a cart:
    public Item[] items;    // An array to hold 'Item' objects in the cart (uninitialized, will be null).
    public String date;     // The date of the cart/order (uninitialized, will be null).
    public double total;    // Total cost of items in the cart (uninitialized, will be 0.0 for double).

    // Method to simulate cancelling the cart:
    public void Cancel() {
        System.out.println("Cancelling order...");
    }
} // End of Cart class

// =============================================================================
// ITEM CLASS - The Blueprint for Item Objects
// =============================================================================
// This is a simple class defining an "Item". It currently has no fields or methods,
// but it serves as a placeholder for items that could be added to a Cart.
class Item {
    // Currently empty. Could be expanded with fields like 'name', 'price', 'quantity', etc.
} // End of Item class

/*
Summary of Concepts:
--------------------
This Java program provides a foundational introduction to Object-Oriented Programming (OOP) concepts:

1.  Classes as Blueprints:
    * A **class** (like `Customer`, `Cart`, `Item`) is a template or blueprint that defines the characteristics (fields/properties) and behaviors (methods) that objects of that class will have.

2.  Objects as Instances:
    * An **object** is a concrete instance created from a class blueprint (e.g., `cust1`, `cust2`). Each object is a separate entity with its own set of field values.

3.  Fields (Properties):
    * **Fields** are variables declared within a class that represent the data or attributes of an object (e.g., `name`, `age` in `Customer`, `total` in `Cart`). Each object has its own copy of these fields.

4.  Methods (Behaviors):
    * **Methods** are functions defined within a class that represent the actions or operations an object can perform (e.g., `displayCustomer()` in `Customer`, `Cancel()` in `Cart`). They operate on the object's data.

5.  Object Interaction and Composition:
    * Objects can interact with each other. A key OOP concept demonstrated here is **composition**, where one object "has a" relationship with another object. For example, the `Customer` class contains a `Cart` object (`public Cart cart = new Cart();`), meaning every `Customer` object comes with its own `Cart`. This allows for structured and modular program design.

This program illustrates how to create objects, modify their properties, make them perform actions, and how objects can be related to and interact with each other, forming the basis of building more complex applications in Java.
*/
