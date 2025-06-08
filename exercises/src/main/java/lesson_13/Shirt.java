package lesson_13;

import lesson_13.Clothing;
import lesson_13.Returnable;

// =============================================================================
// Shirt Class - Subclass of Clothing, Implements Returnable Interface
// =============================================================================
// 'extends Clothing': Indicates that 'Shirt' inherits properties and behaviors from 'Clothing'.
// 'implements Returnable': Indicates that 'Shirt' promises to fulfill the contract
// defined by the 'Returnable' interface (i.e., it must implement 'doReturn()').
public class Shirt extends Clothing implements Returnable {

    // Additional private field specific to Shirt, encapsulating its fit.
    private char fit = 'U'; // 'U' for Unknown/Unset as a default.

    // Parameterized Constructor:
    // Initializes fields inherited from 'Clothing' and the 'Shirt'-specific 'fit' field.
    public Shirt(int itemID, String desc, char colourCode, double price, char fit) {
        // 'super()' call: This is crucial! It must be the first statement in a subclass constructor.
        // It calls a corresponding constructor in the immediate superclass ('Clothing') to initialize
        // the inherited parts of the 'Shirt' object.
        super(itemID, desc, colourCode, price);
        this.fit = fit; // Initialize the Shirt-specific 'fit' field.
    }

    // --- Getter and Setter methods for Shirt-specific fields ---
    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    // Method Overriding:
    // This method provides the concrete implementation for the abstract 'display()' method
    // inherited from the 'Clothing' superclass. This is a mandatory requirement because
    // 'Clothing' is abstract and 'Shirt' is a concrete (non-abstract) class.
    @Override // Annotation: Best practice to indicate that this method overrides a superclass method.
    public void display() {
        System.out.println("ItemID: " + getItemID());          // Calls inherited getter from Clothing
        System.out.println("Item Description: " + getDesc());  // Calls inherited getter from Clothing
        System.out.println("Price: " + getPrice());            // Calls inherited getter from Clothing
        System.out.println("Colour Code: " + getColourCode()); // Calls inherited getter from Clothing
        System.out.println("Fit: " + fit);                     // Accesses Shirt's own 'fit' field
    }

    // Method Overriding:
    // This method overrides the 'toString()' method, which is originally defined in the 'Object' class
    // (the root of all Java classes). It provides a custom, human-readable string representation
    // of a 'Shirt' object when it's printed (e.g., using System.out.println(shirtObject)).
    @Override
    public String toString() {
        return ("This shirt is size " + fit + " that costs R" + getPrice() + ".");
    }

    // Implementing the 'doReturn()' method from the 'Returnable' interface.
    // This is a mandatory implementation for 'Shirt' because it declared that it 'implements Returnable'.
    @Override
    public String doReturn() {
        return "Shirt returns must be within 3 days.";
    }
}