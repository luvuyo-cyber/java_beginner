package lesson_09;
// =============================================================================
// FILE 2: Shirt.java (Demonstrates Encapsulation, Constructors, and Getters/Setters)
// =============================================================================

// The 'Shirt' class represents a shirt with various attributes.
public class Shirt {
    // Private fields: These attributes are encapsulated, meaning they can only be
    // accessed or modified through the methods (getters/setters) of this class.
    private int shirtID = 0;
    private String descr = "-description required-";
    private char colourCode = 'U'; // 'U' for Unknown/Unset
    private double price = 0.0;

    // Constructor 1: No arguments (default constructor).
    // Initializes a Shirt object with default values.
    public Shirt() {
        // Calls the 'setColourCode' method to ensure proper validation even for default 'U'.
        setColourCode('U');
    }

    // Constructor 2: One argument (colourCode).
    // This is an example of CONSTRUCTOR OVERLOADING (same name, different parameters).
    public Shirt(char colourCode) {
        // 'this(colourCode)' is a special syntax called CONSTRUCTOR CHAINING.
        // It calls another constructor within the same class (in this case, the one-argument constructor).
        // This helps avoid code duplication.
        this.setColourCode(colourCode); // Use the setter for validation.
    }

    // Constructor 3: Two arguments (colourCode, price).
    // Another example of constructor overloading.
    public Shirt(char colourCode, double price) {
        // Chains to the one-argument constructor to handle 'colourCode' initialization and validation.
        this(colourCode);
        // Then calls the setter for 'price'.
        setPrice(price);
    }

    // Constructor 4: Three arguments (descr, colourCode, price).
    // Another example of constructor overloading.
    public Shirt(String descr, char colourCode, double price) {
        // Calls setter methods to initialize fields, which might include validation logic.
        setDescr(descr);
        setColourCode(colourCode);
        setPrice(price);
    }

    // Getter method for 'colourCode'.
    // Allows external classes to read the value of the private 'colourCode' field.
    public char getColourCode() {
        return colourCode;
    }

    // Setter method for 'colourCode'.
    // Provides controlled modification of the 'colourCode' field.
    // Includes validation logic to ensure only valid color codes are set.
    public void setColourCode(char newCode) {
        // Check if the new code is one of the allowed values.
        if(newCode == 'R' || newCode == 'G' || newCode == 'B') {
            colourCode = newCode; // If valid, set the color code.
            return; // Exit the method.
        }
        // If the code reaches here, the 'newCode' was invalid.
        System.out.println("Invalid colourCode. Use R, G or B");
    }

    // Getter method for 'price'.
    public double getPrice() {
        return price;
    }

    // Setter method for 'price'.
    // Allows setting the price. Could include validation (e.g., price cannot be negative).
    public void setPrice(double price) {
        // 'this.price' refers to the instance variable 'price'.
        // 'price' refers to the parameter passed to the method.
        this.price = price;
    }

    // Setter method for 'descr' (description).
    public void setDescr(String descr) {
        this.descr = descr;
    }

    // Main method for testing the Shirt class.
    public static void main(String[] args) {
        Shirt shirt01 = new Shirt(); // Create a Shirt object using the no-argument constructor.
        System.out.println("Get Colour: " + shirt01.colourCode); // Directly accessing private field (only allowed within the same class).
        // In real-world scenarios, you'd use shirt01.getColourCode().
        shirt01.setColourCode('T'); // Attempt to set an invalid color code.
        System.out.println("Set Colour: " + shirt01.colourCode); // Prints the color code after the attempt.
        // It will still be 'U' because 'T' is invalid.
    }
}