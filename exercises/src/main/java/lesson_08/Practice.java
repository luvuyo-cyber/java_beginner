package lesson_08;

// This class serves as the main entry point to demonstrate various OOP concepts.
public class Practice {

    public static void main(String[] args) {

        // =====================================================================
        // EXAMPLE 1: SHIRT CLASS USAGE - Demonstrates Constructors, Instance Methods, and toString()
        // =====================================================================

        // Create Shirt object using the default (no-argument) constructor.
        // The default constructor initializes fields with default values (e.g., "--- description required ---", 'U', 0.00).
        Shirt myShirt = new Shirt();
        myShirt.display(); // Call an instance method 'display()' on the 'myShirt' object.
        // Instance methods operate on the specific object they are called on.
        System.out.println("myShirt: " + myShirt); // When an object is printed, Java implicitly calls its 'toString()' method.
        // The 'Shirt' class has overridden 'toString()' to provide a custom, readable representation.

        // SYNTAX 1: Set fields using an instance method 'setFields'.
        // This demonstrates creating objects with default values and then modifying their state.
        Shirt shirt01 = new Shirt();
        Shirt shirt02 = new Shirt();
        Shirt shirt03 = new Shirt();
        Shirt shirt04 = new Shirt();
        // Calling overloaded 'setFields' method. Java determines which 'setFields' to call
        // based on the number and types of arguments provided (Method Overloading).
        shirt01.setFields("V-Neck", 'B', 129.99); // Calls setFields(String, char, double)
        shirt02.setFields("Sweatshirt", 'G', 350);
        shirt03.setFields("Golf-T", 'W', 150);
        shirt04.setFields("Round-Neck", 'Y', 129.99);

        // SYNTAX 2: Create Shirt objects using a parameterized constructor (Constructor Overloading).
        // Parameterized constructors allow you to initialize an object's fields at the time of creation.
        // This is often more convenient and ensures objects are in a valid state from the start.
        Shirt shirt05 = new Shirt("V-Neck", "Blue", 129.99); // Calls Shirt(String, String, double)
        Shirt shirt06 = new Shirt("Sweatshirt", "Green", 350);
        Shirt shirt07 = new Shirt("Golf-T", "White", 150);
        Shirt shirt08 = new Shirt("Round-Neck", "Yellow", 129.99);
        shirt05.display(); // Display details using the instance method 'display()'
        shirt06.display();
        shirt07.display();
        shirt08.display();

        // =====================================================================
        // EXAMPLE 2: CALCULATOR CLASS (METHOD OVERLOADING)
        // =====================================================================
        // Method overloading allows a class to have multiple methods with the same name,
        // but different parameter lists (different number of parameters, different types of parameters,
        // or different order of parameter types).
        // Java decides which overloaded method to call at compile time based on the arguments passed.
        Calculator calc = new Calculator();
        calc.calculate(6, 4);      // Calls calculate(int, double) because '4' (int) is promoted to 'double' to match the signature.
        calc.calculate();          // Calls calculate() - no parameters.
        calc.calculate(7);         // Calls calculate(int) - single int parameter.
        calc.calculate(10, 7, 20); // Calls calculate(int, double, int) - '7' (int) is promoted to 'double'.

        // =====================================================================
        // EXAMPLE 3: METHOD RETURN TYPES
        // =====================================================================
        // Methods can return different types of values, or no value at all (`void`).
        methodReturnTypes example = new methodReturnTypes();

        example.printString();             // Calls a 'void' method; it performs an action but returns nothing.
        example.returnString();            // Calls a 'String' method; it returns a String, but the return value is not used here.
        System.out.println(example.returnString()); // Calls a 'String' method; its return value is captured and printed.
        example.sum(4, 5);                 // Calls an 'int' method; returns an int, but the return value is unused.
        System.out.println(example.sum(4,5)); // Calls an 'int' method; its return value is captured and printed.
        example.isGreater(4, 7);           // Calls a 'boolean' method; returns a boolean, but the return value is unused.
        System.out.println(example.isGreater(4,7)); // Calls a 'boolean' method; its return value is captured and printed.

        // =====================================================================
        // EXAMPLE 4: SHOPPINGCART & CUSTOMER CLASSES (OBJECT INTERACTION / COMPOSITION)
        // =====================================================================
        // This demonstrates how objects can interact with each other.
        // 'ShoppingCart' has a 'Customer' object as one of its fields (composition).
        // This means a ShoppingCart "has-a" Customer.
        ShoppingCart shopcart = new ShoppingCart();
        // The 'setCustomerServices' method in ShoppingCart calls methods on its internal 'Customer' object.
        shopcart.setCustomerServices();

        // =====================================================================
        // EXAMPLE 5: ITEM SIZES & ITEM CLASSES (STATIC MEMBERS)
        // =====================================================================
        // Static members (variables and methods) belong to the class itself, not to any specific object.
        // They are shared across all instances of the class and can be accessed directly using the class name.

        // 1) Accessing static variable and method directly via class name.
        // 'mSmall' is a static final variable (a constant).
        System.out.println("Variable: " + ItemSizes.mSmall); // Accessing static variable directly.
        // 'setMSmall()' is a static method.
        System.out.println("Method: " + ItemSizes.setMSmall()); // Calling static method directly.

        // 2) Accessing static variable from another class (passing its value)
        Item item1 = new Item();
        item1.setSize(ItemSizes.mMed); // Passing the value of a static variable to an instance method.
        System.out.println("Item1 Size: " + item1.size);

        // 3) Accessing static method from another class (passing its return value)
        Item item2 = new Item();
        item2.setSize(ItemSizes.setMSmall()); // Passing the return value of a static method to an instance method.
        System.out.println("Item2 Size: " + item2.size);

        // NOTES ON STATIC VS INSTANCE:
        // - Instance methods (e.g., `display()` in Shirt) can access static methods or fields.
        //   They operate on a specific object and can also use class-level data.
        // - Instance methods/variables require an object instance to be created before they can be used.
        //   (e.g., `myShirt.display()`)
        // - Static methods (e.g., `ItemSizes.setMSmall()`) cannot directly access instance methods or fields.
        //   This is because static methods exist without any object, so they wouldn't know which object's
        //   instance data to refer to.
        // - Static methods do not need an object reference to be invoked. They are called directly on the class.

        // EXAMPLE 5 (CONTINUED): PASS-BY-VALUE FOR OBJECT REFERENCES
        // In Java, all arguments are passed by value. For primitive types, a copy of the value is passed.
        // For objects, a copy of the *reference* (memory address) to the object is passed.

        // Example 1: Modifying object through passed reference (change is reflected in original object)
        // 'myShirt2' holds a reference to a Shirt object.
        Shirt myShirt2 = new Shirt();
        System.out.println("My Shirt color: " + myShirt2.colorCode); // Output: U (default)
        // 'changeShirtColor' receives a *copy* of the reference to 'myShirt2'.
        // Both the original 'myShirt2' and the parameter 'theShirt' now point to the SAME object.
        changeShirtColor(myShirt2, 'B'); // This method modifies the object that 'theShirt' (and 'myShirt2') points to.
        System.out.println("My Shirt color2: " + myShirt2.colorCode); // Output: B (change is reflected because the object itself was modified)

        // Example 2: Reassigning parameter reference (original object unchanged)
        Shirt myShirt3 = new Shirt();
        System.out.println("My Shirt color: " + myShirt3.colorCode); // Output: U (default)
        // 'changeShirtColor2' receives a *copy* of the reference to 'myShirt3'.
        // Inside the method, 'theShirt' is reassigned to point to a *NEW* Shirt object.
        // This re-assignment only affects the local 'theShirt' parameter, not the original 'myShirt3'.
        changeShirtColor2(myShirt3, 'B');
        System.out.println("My Shirt color2: " + myShirt3.colorCode); // Output: U (original object not changed, 'myShirt3' still points to the old object)

        // =====================================================================
        // EXAMPLE 6: CALCULATOR2 CLASS (METHOD OVERLOADING with different primitive types)
        // =====================================================================
        // Further demonstrates method overloading where the methods have the same name
        // but differ in the data types of their parameters.
        Calculator2 calcTest = new Calculator2();

        int totalOne = calcTest.sum(2, 3);          // Calls sum(int, int) because both arguments are ints.
        System.out.println("Total = " + totalOne);
        System.out.println("========================");

        float totalTwo = calcTest.sum(15.99F, 12.85F); // Calls sum(float, float) because both arguments are floats (note 'F' suffix).
        System.out.println("Total = " + totalTwo);
        System.out.println("========================");

        float totalThree = calcTest.sum(2, 12.85F); // Calls sum(int, float) - Java picks the best match.
        // It could promote '2' to float and call sum(float, float),
        // but sum(int, float) is a more direct match if available.
        System.out.println("Total = " + totalThree);
        System.out.println("========================");

    } //end of main method

    // Static method: Modifies the object passed by reference
    // 'theShirt' parameter is a copy of the reference to the object.
    // Both 'theShirt' and the original variable (e.g., 'myShirt2') point to the same object in memory.
    // Changes made to the object *through* this reference are visible outside the method.
    public static void changeShirtColor (Shirt theShirt, char color) {
        theShirt.colorCode = color; // Modifies the 'colorCode' field of the object.
    }

    // Static method: Reassigns its local parameter, not affecting the original object
    // 'theShirt' parameter is a copy of the reference.
    // Inside this method, 'theShirt' is made to point to a *new* Shirt object.
    // This re-assignment does NOT affect what the original variable (e.g., 'myShirt3') points to.
    public static void changeShirtColor2(Shirt theShirt, char color) {
        theShirt = new Shirt(); // The local 'theShirt' reference now points to a NEW object.
        // The original object passed to the method is unaffected by this re-assignment.
        theShirt.colorCode = color; // This modifies the *new* Shirt object's color.
        System.out.println("The Shirt color: " + theShirt.colorCode); // Prints the color of the *new* object.
    }
} //end of Practice class

//-------------------------- SHIRT CLASS -----------------------------------------
// Represents a Shirt with properties and behaviors.
class Shirt {
    // FIELDS (instance variables): Each Shirt object will have its own copy of these.
    public String description;
    public char colorCode;
    public double price;

    // CONSTRUCTOR 1: Parameterized Constructor
    // Used to create a Shirt object and initialize its fields with provided values.
    public Shirt(String desc, String color, double price) {
        // 'this' keyword refers to the current object.
        // Calling another constructor within the same class (constructor chaining).
        // This must be the first statement in the constructor.
        // It calls the overloaded 'setFields(String, double)' method.
        this.setFields(desc, price); // Calls overloaded setFields
        this.setColor(color);        // Calls setColor to process the color string
    }

    // CONSTRUCTOR 2: Default (No-argument) Constructor
    // Used to create a Shirt object with predefined default values.
    public Shirt() {
        description = "--- description required ---";
        colorCode = 'U'; // 'U' for Unknown
        price = 0.00;
    }

    // METHOD: display() - An instance method that prints the shirt's details.
    // It operates on the specific Shirt object it is called upon.
    public void display() {
        System.out.println("\n===== SHIRT DETAILS =====");
        System.out.println("- Shirt description: " + description);
        System.out.println("- Color code: " + colorCode);
        System.out.println("- Price: R" + price);
    }

    // METHOD: toString() - Overridden method from the Object class.
    // Provides a custom string representation of the Shirt object when it's printed or converted to a string.
    @Override // Annotation indicating that this method overrides a method in a superclass.
    public String toString() {
        return "\n- Shirt Description: " + description
                + "\n- Price: R" + price
                + "\n- Color: " + colorCode;
    }

    // METHOD: setFields(String, char, double) - Overloaded Method 1
    // Sets all three main fields.
    public void setFields(String desc, char color, double price) {
        this.description = desc; // 'this.description' refers to the instance variable 'description'.
        this.colorCode = color;  // 'color' refers to the parameter.
        this.price = price;
        System.out.println( "\n======== SHIRT DETAILS ========" +
                "\nDescription: " + desc +
                "\nColor Code: " + color +
                "\nPrice: R" + price);
    }

    // METHOD: setFields(String, double) - Overloaded Method 2
    // Sets only description and price. Demonstrates method overloading.
    public void setFields(String desc, double price) {
        this.description = desc;
        this.price = price; // Corrected typo: should be this.price = price;
    }

    // METHOD: setColor(String) - Sets colorCode from the first character of a string.
    public void setColor(String theColor) {
        if (theColor != null && theColor.length() > 0) { // Added null check for safety
            colorCode = theColor.toUpperCase().charAt(0); // Convert to uppercase for consistency
        } else {
            colorCode = 'U'; // Default to unknown if string is empty or null
        }
    }
} //end of Shirt class

//------------------------------------- CALCULATOR CLASSES ------------------------------------------
// Demonstrates method overloading with different parameter lists.
class Calculator {
    // Fields for potential future use (not directly used in these calculate methods)
    int x; // numerator
    double y; // denominator

    // METHOD: calculate(int, double) - Performs division of an int by a double.
    public void calculate(int x, double y) {
        System.out.println("1) " + x + " / " + y + " = " + (x / y));
    }

    // METHOD: calculate() - No parameters. A simple message.
    public void calculate() {
        System.out.println("2) No parameters");
    }

    // METHOD: calculate(int) - Divides an int by 2.0.
    public void calculate(int x) {
        System.out.println("3) " + x + " / 2.0 = " + (x / 2.0));
    }

    // METHOD: calculate(int, double, int) - Performs a more complex calculation.
    public void calculate(int x, double y, int z) {
        System.out.println("4) " + x + " / " + y + " + " + z + " = " + (x / y + z));
    }
} //end of first Calculator class

//------------------------------------------------------
// Demonstrating method overloading (same name, different signatures) with different primitive types.
final class Calculator2 { // 'final' means this class cannot be subclassed.
    // Static methods belong to the class, not an object.
    // They can be called directly using the class name (e.g., Calculator2.sum(..)).

    public static int sum(int num1, int num2) { // Overloaded Method 1: Takes two integers.
        System.out.println("Method One (int, int)"); // Added clearer output for demonstration
        return num1 + num2;
    }

    public static float sum(float num1, float num2) { // Overloaded Method 2: Takes two floats.
        System.out.println("Method Two (float, float)");
        return num1 + num2;
    }

    public static float sum(int num1, float num2) { // Overloaded Method 3: Takes an int and a float.
        System.out.println("Method Three (int, float)");
        // Java will automatically promote 'num1' (int) to a float before addition.
        return num1 + num2;
    }
} //end of second calculator class

//---------------------------- METHOD RETURN TYPES CLASS ---------------------------------------
// Demonstrates methods with different return types.
class methodReturnTypes {

    // METHOD: printString() - 'void' return type means it doesn't return any value.
    // It performs an action (prints to console).
    public void printString() {
        System.out.println("Hello");
    }

    // METHOD: returnString() - 'String' return type means it returns a String value.
    public String returnString() {
        return ("Hello");
    }

    // METHOD: sum(int, int) - 'int' return type means it returns an integer value.
    public int sum(int x, int y) {
        return (x + y);
    }

    // METHOD: isGreater(int, int) - 'boolean' return type means it returns a boolean (true/false) value.
    public boolean isGreater(int x, int y) {
        return (x > y);
    }
} //end of methodReturnTypes class

//-------------------------- CUSTOMER CLASS -----------------------------------------------------
// Represents a Customer.
class Customer {
    public boolean isNew = true; // Instance field: Each Customer object has its own 'isNew' status.

    // METHOD: isNewCustomer() - Returns the 'isNew' status of the customer.
    public boolean isNewCustomer() {
        return isNew;
    }

    // METHOD: sendEmail(String) - Simulates sending an email.
    public void sendEmail(String message) {
        System.out.println("Sending email: \n" + message);
    }
} //end of Customer class

//-------------------------- SHOPPING CART CLASS -----------------------------------------------------
// Represents a ShoppingCart, which "has-a" Customer (Composition).
class ShoppingCart {
    Customer cust = new Customer(); // Composition: A ShoppingCart object contains an instance of a Customer.

    // METHOD: setCustomerServices() - Checks customer status and sends a personalized email.
    // Demonstrates one object (ShoppingCart) interacting with another object (Customer).
    public void setCustomerServices() {
        String message = "Would you like to hear about special deals in your area?";
        if (cust.isNewCustomer()) { // Calls a method on the 'cust' object.
            cust.sendEmail(message); // Calls another method on the 'cust' object.
        }
    }
}

//-------------------------- ITEM SIZES CLASS -----------------------------------------------------
// Contains static members, often used for constants or utility methods related to item sizes.
class ItemSizes {
    // STATIC FINAL VARIABLES (Constants) - 'static' means they belong to the class, not an object.
    // 'final' means their value cannot be changed after initialization.
    // They are accessed directly using the class name (e.g., ItemSizes.mSmall).
    static final String mSmall = "Men's Small";
    static final String mMed = "Men's Medium";

    // STATIC METHOD - Belongs to the class. Can be called directly using the class name.
    // Cannot access instance variables or methods directly without an object reference.
    static String setMSmall() {
        return ("Men's Small");
    }
}

//----------------------------- ITEM CLASS -----------------------------------------------------
// Represents an Item.
class Item {
    public String size; // Instance variable: Each Item object has its own 'size'.

    // METHOD: setSize(String) - Sets the item's size.
    public void setSize(String sizeArg) {
        this.size = sizeArg; // 'this.size' refers to the instance variable.
    }
}

/*
Summary of Concepts:
--------------------
This program provides a comprehensive demonstration of key Object-Oriented Programming (OOP) concepts in Java:

1.  Classes and Objects:
    * **Classes (`Shirt`, `Calculator`, `Customer`, etc.):** Act as blueprints for creating objects. They define the properties (fields) and behaviors (methods) that objects of that class will have.
    * **Objects (`myShirt`, `calc`, `shopcart`, etc.):** Are instances of classes. You can create multiple objects from a single class blueprint, each with its own state (field values).

2.  Constructors:
    * **Purpose:** Special methods used to initialize new objects when they are created (`new Shirt()`).
    * **Default Constructor:** A constructor with no parameters (`Shirt()`). It sets fields to default values.
    * **Parameterized Constructor:** A constructor that accepts arguments (`Shirt(String, String, double)`). It allows you to set initial field values when creating an object.
    * **Constructor Overloading:** A class can have multiple constructors with different parameter lists, allowing flexible object creation.

3.  Methods:
    * **Instance Methods (`display()`, `setFields()`):** Belong to an object and operate on that specific object's data. They require an object instance to be called.
    * **`toString()` Method:** A special instance method (often overridden from the `Object` class) that provides a string representation of an object, useful for printing or debugging.
    * **Method Overloading (`calculate()`, `sum()`, `setFields()`):** Allows a class to have multiple methods with the same name but different parameter lists (number, type, or order of parameters). Java determines which method to call based on the arguments provided.
    * **Method Return Types (`void`, `String`, `int`, `boolean`):** Define the type of value a method will send back after it finishes execution. `void` means no value is returned.

4.  Object Interaction and Composition:
    * **Composition (`ShoppingCart` having a `Customer`):** A fundamental OOP principle where one class contains an instance of another class as a field. This models a "has-a" relationship (e.g., a ShoppingCart "has a" Customer). It allows objects to collaborate by calling each other's methods.

5.  Static Members:
    * **Static Fields (`ItemSizes.mSmall`, `ItemSizes.mMed`):** Belong to the class itself, not to any specific object. They are shared by all instances of the class and are accessed directly using the class name. Often used for constants (`static final`).
    * **Static Methods (`ItemSizes.setMSmall()`, `Calculator2.sum()`):** Also belong to the class. They can be called directly using the class name and do not require an object instance. Static methods cannot directly access instance fields or methods of the same class because they don't operate on a specific object.

6.  Pass-by-Value for Object References:
    * In Java, arguments are always passed by value.
    * For primitive types (like `int`, `char`, `double`), a copy of the actual value is passed.
    * For objects, a copy of the *reference* (the memory address) to the object is passed. This means:
        * If you modify the object's *state* through the passed reference, the changes are visible to the original object outside the method (Example 5, `changeShirtColor`).
        * If you reassign the parameter reference to point to a *new* object *inside* the method, the original object outside the method remains unchanged because its reference still points to the old object (Example 5, `changeShirtColor2`).

This program illustrates how these concepts work together to build modular, reusable, and organized Java applications.
*/
