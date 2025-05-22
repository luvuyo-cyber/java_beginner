package lesson_08;

public class Practice {

    public static void main(String[] args) {

        // EXAMPLE 1: SHIRT CLASS USAGE
        // Create Shirt object using default constructor
        Shirt myShirt = new Shirt();
        myShirt.display(); // Call instance method
        System.out.println("myShirt: " + myShirt); // Calls overridden toString()

        // SYNTAX 1: Set fields using an instance method
        Shirt shirt01 = new Shirt();
        Shirt shirt02 = new Shirt();
        Shirt shirt03 = new Shirt();
        Shirt shirt04 = new Shirt();
        shirt01.setFields("V-Neck", 'B', 129.99); // Calls setFields(String, char, double)
        shirt02.setFields("Sweatshirt", 'G', 350);
        shirt03.setFields("Golf-T", 'W', 150);
        shirt04.setFields("Round-Neck", 'Y', 129.99);

        // SYNTAX 2: Create Shirt objects using a parameterized constructor (constructor overloading)
        Shirt shirt05 = new Shirt("V-Neck", "Blue", 129.99);
        Shirt shirt06 = new Shirt("Sweatshirt", "Green", 350);
        Shirt shirt07 = new Shirt("Golf-T", "White", 150);
        Shirt shirt08 = new Shirt("Round-Neck", "Yellow", 129.99);
        shirt05.display(); // Display details using instance method
        shirt06.display();
        shirt07.display();
        shirt08.display();

        // EXAMPLE 2: CALCULATOR CLASS (METHOD OVERLOADING)
        // Demonstrates calling overloaded 'calculate' methods based on argument list
        Calculator calc = new Calculator();
        calc.calculate(6, 4);      // Calls calculate(int, double) (4 is promoted)
        calc.calculate();          // Calls calculate()
        calc.calculate(7);         // Calls calculate(int)
        calc.calculate(10, 7, 20); // Calls calculate(int, double, int) (7 is promoted)

        // EXAMPLE 3: METHOD RETURN TYPES
        // Demonstrates methods returning void, String, int, and boolean
        methodReturnTypes example = new methodReturnTypes();
        example.printString();             // Void method
        example.returnString();            // String method (return value unused)
        System.out.println(example.returnString()); // String method (return value printed)
        example.sum(4, 5);                 // Int method (return value unused)
        System.out.println(example.sum(4,5)); // Int method (return value printed)
        example.isGreater(4, 7);           // Boolean method (return value unused)
        System.out.println(example.isGreater(4,7)); // Boolean method (return value printed)

        // EXAMPLE 4: SHOPPINGCART & CUSTOMER CLASSES (OBJECT INTERACTION)
        // Demonstrates one object calling methods on another object
        ShoppingCart shopcart = new ShoppingCart();
        shopcart.setCustomerServices();

        // EXAMPLE 5: ITEM SIZES & ITEM CLASSES (STATIC MEMBERS)

        // 1) Accessing static variable and method directly via class name
        System.out.println("Variable: " + ItemSizes.mSmall);
        System.out.println("Method: " + ItemSizes.setMSmall());

        // 2) Accessing static variable from another class (passing its value)
        Item item1 = new Item();
        item1.setSize(ItemSizes.mMed);
        System.out.println("Item1 Size: " + item1.size);

        // 3) Accessing static method from another class (passing its return value)
        Item item2 = new Item();
        item2.setSize(ItemSizes.setMSmall());
        System.out.println("Item2 Size: " + item2.size);

        // NOTES ON STATIC VS INSTANCE:
        // Instance methods can access static methods or fields.
        // Instance methods/variables require an object instance.
        // Static methods cannot directly access instance methods or fields.
        // Static methods do not need an object reference to be invoked.

        // EXAMPLE 5 (CONTINUED): PASS-BY-VALUE FOR OBJECT REFERENCES
        // Example 1: Modifying object through passed reference (change is reflected)
        Shirt myShirt2 = new Shirt();
        System.out.println("My Shirt color: " + myShirt2.colorCode); // Output: U
        changeShirtColor(myShirt2, 'B');
        System.out.println("My Shirt color2: " + myShirt2.colorCode); // Output: B

        // Example 2: Reassigning parameter reference (original object unchanged)
        Shirt myShirt3 = new Shirt();
        System.out.println("My Shirt color: " + myShirt3.colorCode); // Output: U
        changeShirtColor2(myShirt3, 'B');
        System.out.println("My Shirt color2: " + myShirt3.colorCode); // Output: U (original object not changed)

        // EXAMPLE 6: CALCULATOR2 CLASS (METHOD OVERLOADING)
        // Demonstrates method overloading with different primitive types
        Calculator2 calcTest = new Calculator2();

        int totalOne = calcTest.sum(2, 3);          // Calls sum(int, int)
        System.out.println("Total = " + totalOne);
        System.out.println("========================");

        float totalTwo = calcTest.sum(15.99F, 12.85F); // Calls sum(float, float)
        System.out.println("Total = " + totalTwo);
        System.out.println("========================");

        float totalThree = calcTest.sum(2, 12.85F); // Calls sum(int, float)
        System.out.println("Total = " + totalThree);
        System.out.println("========================");

    } //end of main method

    // Static method: Modifies the object passed by reference
    public static void changeShirtColor (Shirt theShirt, char color) {
        theShirt.colorCode = color;
    }

    // Static method: Reassigns its local parameter, not affecting the original object
    public static void changeShirtColor2(Shirt theShirt, char color) {
        theShirt = new Shirt(); // Parameter now points to a NEW object
        theShirt.colorCode = color;
        System.out.println("The Shirt color: " + theShirt.colorCode);
    }
} //end of lesson08 class

//-------------------------- SHIRT CLASS -----------------------------------------
class Shirt {
    // FIELDS (instance variables)
    public String description;
    public char colorCode;
    public double price;

    // CONSTRUCTOR 1: Parameterized Constructor
    public Shirt(String desc, String color, double price) {
        setFields(desc, price); // Calls overloaded setFields
        setColor(color);        // Calls setColor
    }

    // CONSTRUCTOR 2: Default Constructor
    public Shirt() {
        description = "--- description required ---";
        colorCode = 'U';
        price = 0.00;
    }

    // METHOD: display() - Prints shirt details
    public void display() {
        System.out.println("\n===== SHIRT DETAILS =====");
        System.out.println("- Shirt description: " + description);
        System.out.println("- Color code: " + colorCode);
        System.out.println("- Price: R" + price);
    }

    // METHOD: toString() - Overridden for custom string representation
    @Override
    public String toString() {
        return "\n- Shirt Description: " + description
                + "\n- Price: R" + price
                + "\n- Color: " + colorCode;
    }

    // METHOD: setFields(String, char, double) - Overloaded Method 1
    public void setFields(String desc, char color, double price) {
        this.description = desc;
        this.colorCode = color;
        this.price = price;
        System.out.println( "\n======== SHIRT DETAILS ========" +
                "\nDescription: " + desc +
                "\nColor Code: " + color +
                "\nPrice: R" + price);
    }

    // METHOD: setFields(String, double) - Overloaded Method 2
    public void setFields(String desc, double price) {
        this.description = desc;
        this.price = price; // Typo: should be this.price = price;
    }

    // METHOD: setColor(String) - Sets colorCode from first char of string
    public void setColor(String theColor) {
        if (theColor.length() > 0) {
            colorCode = theColor.charAt(0);
        }
    }
} //end of Shirt class

//------------------------------------- CALCULATOR CLASSES ------------------------------------------
class Calculator {
    int x; // numerator
    double y; // denominator

    // METHOD: calculate(int, double) - Performs division
    public void calculate(int x, double y) {
        System.out.println("1) " + x + " / " + y + " = " + (x / y));
    }

    // METHOD: calculate() - No parameters, prints message
    public void calculate() {
        System.out.println("2) No parameters");
    }

    // METHOD: calculate(int) - Divides int by 2.0
    public void calculate(int x) {
        System.out.println("3) " + x + " / 2.0 = " + (x / 2.0));
    }

    // METHOD: calculate(int, double, int) - Performs complex calculation
    public void calculate(int x, double y, int z) {
        System.out.println("4) " + x + " / " + y + " + " + z + " = " + (x / y + z));
    }
} //end of first Calculator class

//------------------------------------------------------
// Demonstrating method overloading (same name, different signatures)
final class Calculator2 {
    public static int sum(int num1, int num2) { // Overloaded Method 1: int + int
        System.out.println("Method One");
        return num1 + num2;
    }

    public static float sum(float num1, float num2) { // Overloaded Method 2: float + float
        System.out.println("Method Two");
        return num1 + num2;
    }

    public static float sum(int num1, float num2) { // Overloaded Method 3: int + float
        System.out.println("Method Three");
        return num1 + num2;
    }
} //end of second calculator class

//---------------------------- METHOD RETURN TYPES CLASS ---------------------------------------
class methodReturnTypes {

    // METHOD: printString() - void return type
    public void printString() {
        System.out.println("Hello");
    }

    // METHOD: returnString() - String return type
    public String returnString() {
        return ("Hello");
    }

    // METHOD: sum(int, int) - int return type
    public int sum(int x, int y) {
        return (x + y);
    }

    // METHOD: isGreater(int, int) - boolean return type
    public boolean isGreater(int x, int y) {
        return (x > y);
    }
} //end of methodReturnTypes class

//-------------------------- CUSTOMER CLASS -----------------------------------------------------
class Customer {
    public boolean isNew = true; // Instance field

    // METHOD: isNewCustomer() - Returns customer new status
    public boolean isNewCustomer() {
        return isNew;
    }

    // METHOD: sendEmail(String) - Prints email message
    public void sendEmail(String message) {
        System.out.println("Sending email: \n" + message);
    }
} //end of Customer class

//-------------------------- SHOPPING CART CLASS -----------------------------------------------------
class ShoppingCart {
    Customer cust = new Customer(); // Composition: ShoppingCart has a Customer

    // METHOD: setCustomerServices() - Checks new customer status and sends email
    public void setCustomerServices() {
        String message = "Would you like to hear about special deals in your area?";
        if (cust.isNewCustomer()) {
            cust.sendEmail(message);
        }
    }
}

//-------------------------- ITEM SIZES CLASS -----------------------------------------------------
class ItemSizes {
    // STATIC FINAL VARIABLES (Constants) - Accessible via class name
    static final String mSmall = "Men's Small";
    static final String mMed = "Men's Medium";

    // STATIC METHOD - Returns a string, accessible via class name
    static String setMSmall() {
        return ("Men's Small");
    }
}

//----------------------------- ITEM CLASS -----------------------------------------------------
class Item {
    public String size; // Instance variable

    // METHOD: setSize(String) - Sets the item's size
    public void setSize(String sizeArg) {
        this.size = sizeArg;
    }
}

