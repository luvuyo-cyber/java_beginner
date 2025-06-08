package lesson_12;

// =============================================================================
// TestInheritance Class - Main entry point to demonstrate inheritance concepts
// =============================================================================
public class TestInheritance {

    public static void main(String[] args) {
        // Polymorphism in action:
        // A superclass reference variable can hold a subclass object.
        // This allows us to treat Shirt and Trouser objects as more general Clothing objects.
        // This is known as "Upcasting" (implicit).

        // Creating a Shirt object, but referencing it as a Clothing type.
        // The actual object created is a Shirt, but 'shirt01' can only access methods
        // defined in the Clothing class (unless cast).
        Clothing shirt01 = new Shirt(1, "hoodie", 'R', 99.90, 'L');

        // Creating a Shirt object, referenced as a Shirt type.
        // This object can access all Shirt-specific methods and Clothing methods.
        Shirt shirt02 = new Shirt(20.00, 'M');

        // Creating a Trouser object, referenced as a Clothing type.
        Clothing trouser01 = new Trouser(2, "2 Chainz", 'T', 199.90, 'M', 'F');

        // Calling the 'display()' method on 'shirt01'.
        // Even though 'shirt01' is a 'Clothing' reference, Java's runtime polymorphism
        // ensures that the 'display()' method *of the actual Shirt object* is called.
        // This is because 'display()' is an overridden method.
        shirt01.display();
        System.out.println();

        // Calling 'getItemID()' on 'trouser01'. This method is inherited from Clothing.
        trouser01.getItemID(); // This line calls the method but doesn't print its return value.
        // Calling 'display()' on 'trouser01'. Again, the Trouser's overridden display() is called.
        trouser01.display();

        // Downcasting and 'instanceof':
        // When a superclass reference holds a subclass object, to access methods
        // specific to the subclass, you must "downcast" the reference.
        // This requires explicit casting: (SubclassType) reference.

        // Attempting to cast 'trouser01' to 'Trouser' to access 'getFit()'.
        // This line performs the cast and calls the method, but doesn't print the result.
        ((Trouser)trouser01).getFit();

        // 'instanceof' operator: Used to check if an object is an instance of a particular class
        // or an instance of a subclass of that class. It's good practice to use 'instanceof'
        // before downcasting to prevent ClassCastException if the object is not actually
        // of the type you are trying to cast it to.
        if(trouser01 instanceof Trouser) {
            // If 'trouser01' is indeed a 'Trouser' object, safely cast it and call 'getFit()'.
            char fitcode = ((Trouser)trouser01).getFit();
            System.out.println("Fit: " + fitcode);
        }
    }
}

// =============================================================================
// Clothing Class - Abstract Superclass
// =============================================================================
// 'abstract' class: Cannot be instantiated directly (you cannot create 'new Clothing()').
// It serves as a blueprint for other classes (subclasses) that will inherit from it.
// Abstract classes can have abstract methods (methods without a body) and concrete methods.
abstract class Clothing {

    // Private fields: These are instance variables that belong to each Clothing object.
    // 'private' enforces encapsulation, meaning they can only be accessed/modified
    // directly within this class (or via its public getters/setters).
    private int itemID = 0;
    private String desc = "-description required-";
    private char colourCode = 'U';
    private double price = 0.0;

    // Parameterized Constructor 1: Initializes all fields.
    public Clothing(int itemID, String desc, char colourCode, double price) {
        this.itemID = itemID;
        this.desc = desc;
        this.colourCode = colourCode;
        this.price = price;
    }

    // Parameterized Constructor 2: Initializes only price.
    public Clothing(double price) {
        this.price = price;
    }

    // Getter methods: Provide public access to read the private fields.
    public int getItemID() {
        return itemID;
    }

    // Setter methods: Provide public access to modify the private fields.
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

    // The line below is commented out in your original code.
    // If uncommented, 'getPrice()' would be an abstract method, forcing subclasses
    // to provide their own implementation, making 'price' potentially calculated.
    // public abstract double getPrice();

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method: A method declared without an implementation (no method body).
    // Any non-abstract class that extends 'Clothing' MUST provide an implementation
    // (override) for this 'display()' method. This enforces a common behavior
    // across all subclasses, but allows each subclass to implement it differently.
    public abstract void display();
}

// =============================================================================
// Shirt Class - Subclass of Clothing
// =============================================================================
// 'extends Clothing': Indicates that 'Shirt' is a subclass of 'Clothing'.
// 'Shirt' inherits all public and protected fields and methods from 'Clothing'.
// Since 'Clothing' is abstract, 'Shirt' (being a concrete class) must implement
// all abstract methods inherited from 'Clothing'.
class Shirt extends Clothing {

    // Additional private fields specific to Shirt.
    private int neckSize; // This field is declared but not used in constructors/methods provided.
    private char fit = 'U'; // 'U' for Unknown/Unset

    // Parameterized Constructor 1:
    // Takes parameters for both Clothing fields and Shirt-specific fields.
    public Shirt(int itemID, String desc, char colourCode, double price, char fit) {
        // 'super()' call: MUST be the first statement in a subclass constructor.
        // It calls a corresponding constructor in the immediate superclass (Clothing).
        // This ensures that the superclass's part of the object is properly initialized.
        super(itemID, desc, colourCode, price);
        this.fit = fit; // Initialize Shirt-specific field.
    }

    // Parameterized Constructor 2:
    // Demonstrates constructor overloading and chaining to another constructor in the same class.
    public Shirt(char fit) {
        // 'this(15.00, fit)': Calls another constructor *within the same class* (Shirt(double, char)).
        // This is called constructor chaining.
        this(15.00, fit);
    }

    // Parameterized Constructor 3:
    // Takes price and fit.
    public Shirt(double price, char fit) {
        // 'super(price)': Calls the Clothing constructor that takes a double (price).
        super(price);
        this.fit = fit; // Initialize Shirt-specific field.
    }

    // Getter and Setter methods for Shirt-specific fields.
    public int getNeckSize() {
        return neckSize;
    }

    public void setNeckSize(int neckSize) {
        this.neckSize = neckSize;
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    // Method Overriding:
    // This method provides the concrete implementation for the abstract 'display()' method
    // inherited from the 'Clothing' superclass.
    // It also demonstrates calling inherited getter methods (e.g., getItemID()) to access
    // fields defined in the superclass.
    @Override // Annotation: Indicates that this method overrides a method in its superclass.
    public void display() {
        System.out.println("ItemID: " + getItemID()); // Calls inherited getter
        System.out.println("Item Description: " + getDesc()); // Calls inherited getter
        System.out.println("Price: " + getPrice()); // Calls inherited getter
        System.out.println("Colour Code: " + getColourCode()); // Calls inherited getter
        System.out.println("Fit: " + fit); // Accesses Shirt's own field
    }

    // The commented section below shows an example of overriding a setter method
    // and potentially calling the superclass's version.
    // protected void setColourCode(char colourCode) {
    // super.setColourCode(colourCode); // Calls the setColourCode method from the Clothing superclass.
    // }

} // End of Shirt class

// =============================================================================
// Trouser Class - Subclass of Clothing
// =============================================================================
// 'extends Clothing': 'Trouser' is a subclass of 'Clothing', inheriting its members.
// It also must implement the abstract 'display()' method.
class Trouser extends Clothing {
    // Additional private fields specific to Trouser.
    private char fit;
    private char gender;

    // Parameterized Constructor:
    // Initializes both inherited Clothing fields and Trouser-specific fields.
    public Trouser(int itemID, String desc, char colourCode, double price, char fit, char gender) {
        super(itemID,desc,colourCode,price); // Calls the Clothing constructor.
        this.fit = fit;
        this.gender = gender;
    }

    // Getter and Setter methods for Trouser-specific fields.
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
    // Provides the concrete implementation for the abstract 'display()' method
    // inherited from the 'Clothing' superclass, tailored for Trouser details.
    @Override
    public void display() {
        System.out.println("ItemID: " + getItemID());
        System.out.println("Item Description: " + getDesc());
        System.out.println("Price: " + getPrice());
        System.out.println("Colour Code: " + getColourCode());
        System.out.println("Fit: " + fit);
        System.out.println("Gender: " + gender);
    }
} // End of Trouser class

// =============================================================================
// Socks Class - Subclass of Clothing
// =============================================================================
// 'extends Clothing': 'Socks' is a subclass of 'Clothing'.
// It must implement the abstract 'display()' method.
class Socks extends Clothing {
    // This 'price' field here is redundant because 'price' is already inherited from Clothing.
    // If it were intended to be a different 'price' (e.g., a specific retail price vs. cost),
    // it would "hide" the superclass's price. It's generally better to use the inherited field.
    private double price;

    // Constructor: Calls the superclass constructor that takes a price.
    public Socks (double price) {
        super(price);
        // If the private 'price' field in Socks was intended to be used, it would need to be initialized here:
        // this.price = price;
    }

    // The commented section below shows an example of overriding a getter method.
    // protected double getPrice() {
    // return price; // If this was uncommented, it would return the 'price' field of Socks, not Clothing.
    // }

    // Method Overriding:
    // Provides the concrete implementation for the abstract 'display()' method
    // inherited from the 'Clothing' superclass, tailored for Socks details.
    @Override
    public void display() {
        System.out.println("ID: " + getItemID()); // Calls inherited getter
        System.out.println("Price: " + getPrice()); // Calls inherited getter (from Clothing)
    }
} // End of Socks class

/*
Overall Summary of Concepts in Lesson 12:
------------------------------------------
This lesson delves into advanced Object-Oriented Programming (OOP) concepts in Java, focusing on how classes relate to and build upon each other:

1.  Inheritance (`extends` keyword):
    * **Concept:** Allows a class (subclass/child class, e.g., `Shirt`, `Trouser`, `Socks`) to inherit properties (fields) and behaviors (methods) from another class (superclass/parent class, e.g., `Clothing`). This promotes code reusability and establishes an "is-a" relationship (e.g., a Shirt *is a* Clothing item).
    * **`super()` call:** Must be the first statement in a subclass constructor. It's used to call a constructor of the immediate superclass, ensuring the inherited parts of the object are properly initialized.

2.  Abstract Classes and Methods (`abstract` keyword):
    * **Abstract Class (`Clothing`):** A class that cannot be instantiated directly. It serves as a base for other classes to extend. It can contain both concrete methods (with implementations) and abstract methods.
    * **Abstract Method (`display()` in `Clothing`):** A method declared without an implementation (no method body). Any concrete (non-abstract) subclass that extends an abstract class *must* provide an implementation for all inherited abstract methods. This forces subclasses to define specific behaviors while ensuring a common interface.

3.  Polymorphism ("Many Forms"):
    * **Concept:** The ability of an object to take on many forms. In Java, this means a superclass reference variable can refer to an object of any of its subclasses (e.g., `Clothing shirt01 = new Shirt(...)`).
    * **Runtime Polymorphism (Dynamic Method Dispatch):** When an overridden method (like `display()`) is called on a superclass reference that points to a subclass object, Java determines which version of the method to execute at runtime based on the *actual type* of the object, not the reference type.

4.  Method Overriding (`@Override` annotation):
    * **Concept:** A subclass provides its own specific implementation for a method that is already defined in its superclass. The method signature (name, return type, parameters) must be the same.
    * **`@Override` Annotation:** A good practice to use, as it tells the compiler that you intend to override a method, helping catch errors if the signature doesn't match.

5.  Type Casting and `instanceof`:
    * **Upcasting (Implicit):** Assigning a subclass object to a superclass reference (e.g., `Clothing shirt01 = new Shirt();`). This is safe and automatic.
    * **Downcasting (Explicit):** Converting a superclass reference to a subclass reference (e.g., `((Trouser)trouser01)`). This requires an explicit cast and is only safe if the object actually *is* an instance of the target subclass.
    * **`instanceof` Operator:** Used to check if an object is an instance of a particular class (or one of its subclasses) before performing a downcast, preventing `ClassCastException` errors.

These concepts are fundamental to designing flexible, extensible, and maintainable object-oriented systems in Java.
*/
