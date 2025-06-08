package lesson_13;

import lesson_13.Clothing;
import lesson_13.Returnable;

// =============================================================================
// Trouser Class - Subclass of Clothing, Implements Returnable Interface
// =============================================================================
// 'extends Clothing': 'Trouser' inherits properties and behaviors from 'Clothing'.
// 'implements Returnable': 'Trouser' fulfills the contract of the 'Returnable' interface.
public class Trouser extends Clothing implements Returnable {
    // Additional private fields specific to Trouser, encapsulating its fit and gender.
    private char fit;
    private char gender;

    // Parameterized Constructor:
    // Initializes inherited 'Clothing' fields and 'Trouser'-specific 'fit' and 'gender' fields.
    public Trouser(int itemID, String desc, char colourCode, double price, char fit, char gender) {
        super(itemID, desc, colourCode, price); // Calls the Clothing superclass constructor.
        this.fit = fit;
        this.gender = gender;
    }

    // Default (no-argument) Constructor:
    // This is an example of constructor overloading within the 'Trouser' class.
    // It provides default values for 'Trouser' objects if no specific details are provided during creation.
    public Trouser() {
        // Calls a superclass constructor to initialize inherited fields with default values.
        super(1, "Pants", 'R', 0.0); // Initializes ID, desc, color, price for the base Clothing part.
        this.fit = 'L';             // Sets a default fit for Trouser.
        this.gender = 'M';          // Sets a default gender for Trouser.
    }

    // --- Getter and Setter methods for Trouser-specific fields ---
    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // Method Overriding:
    // This provides the concrete implementation for the abstract 'display()' method
    // inherited from the 'Clothing' superclass, tailored specifically for 'Trouser' details.
    @Override
    public void display() {
        System.out.println("ItemID: " + getItemID());
        System.out.println("Item Description: " + getDesc());
        System.out.println("Price: " + getPrice());
        System.out.println("Colour Code: " + getColourCode());
        System.out.println("Fit: " + fit);
        System.out.println("Gender: " + gender);
    }

    // Method Overriding:
    // Overrides the 'toString()' method from the 'Object' class to provide a custom
    // string representation for 'Trouser' objects when they are printed.
    @Override
    public String toString() {
        return ("\nItemID: " + getItemID() + "\nPrice: " + getPrice() + "\nColour Code: " + getColourCode() +
                "\nFit: " + fit + "\nGender: " + gender);
    }

    // Implementing the 'doReturn()' method from the 'Returnable' interface.
    // This is a mandatory implementation for 'Trouser' because it 'implements Returnable'.
    @Override
    public String doReturn() {
        return "Trouser returns must be within 3 days.";
    }
}
