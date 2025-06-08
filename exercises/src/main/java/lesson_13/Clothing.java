// This package declaration must be at the very top of the file for all classes within it.
package lesson_13;

// No need to import lesson_12.* here, as Clothing (and other classes) are now defined within lesson_13.

// =============================================================================
// Clothing Class - Abstract Superclass for all clothing items in lesson_13
// =============================================================================
// This is an abstract class, meaning it cannot be instantiated directly (e.g., new Clothing() is forbidden).
// It serves as a base blueprint for concrete clothing items (like Shirt, Trouser).
// It defines common properties (fields) and common behaviors (methods), including
// an abstract method ('display') that all concrete subclasses MUST implement.
public abstract class Clothing {

    // Private fields: These properties are encapsulated, meaning they can only be
    // accessed directly from within this 'Clothing' class. Subclasses and other
    // classes interact with these fields via public getter and setter methods.
    private int itemID = 0;
    private String desc = "-description required-";
    private char colourCode = 'U';
    private double price = 0.0;

    // Parameterized Constructor:
    // This constructor initializes all core fields when a Clothing object (or its subclass) is created.
    // Subclass constructors will typically call this using 'super()' to initialize the inherited parts.
    public Clothing(int itemID, String desc, char colourCode, double price) {
        this.itemID = itemID;       // 'this.itemID' refers to the instance variable.
        this.desc = desc;           // 'desc' refers to the constructor parameter.
        this.colourCode = colourCode;
        this.price = price;
    }

    // --- Getter Methods ---
    // These methods provide public read access to the private fields, adhering to encapsulation.
    public int getItemID() {
        return itemID;
    }

    // --- Setter Methods ---
    // These methods provide public write (modification) access to the private fields.
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public char getColourCode() {
        return colourCode;
    }

    public void setColourCode(char colourCode) {
        this.colourCode = colourCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method:
    // This method is declared without an implementation (no method body, just a semicolon).
    // Any concrete (non-abstract) class that extends 'Clothing' MUST provide its own
    // specific implementation for this 'display()' method. This enforces a common
    // "display yourself" behavior across all clothing types.
    public abstract void display();
}


