package lesson_13;

// =============================================================================
// TestLesson13 Class - Main entry point to demonstrate concepts from Lesson 13
// =============================================================================
// This class showcases various OOP concepts like inheritance, interfaces, polymorphism,
// and modern Java 8 features like lambda expressions with collections.
import lesson_13.Clothing;
import lesson_13.Returnable;
import lesson_13.Shirt;
import lesson_13.Trouser;

import java.util.ArrayList; // Used for dynamic arrays
import java.util.Arrays;    // Utility class for array-related operations
import java.util.List;      // Interface representing an ordered collection

public class TestLesson13 {

    public static void main(String[] args) {
        // --- Examples of Inheritance and Interface Polymorphism ---
        // These lines demonstrate how polymorphism works in Java:
        // - A superclass reference can hold a subclass object (Upcasting).
        // - An interface reference can hold an object of any class that implements that interface.
        // This allows for flexible and generic handling of related objects.

        // Create a Shirt object. The reference type is 'Shirt'.
        Shirt shirt01 = new Shirt(1, "hoodie", 'R', 99.90, 'L');
        // Create a Trouser object, but its reference type is the superclass 'Clothing'.
        // This is implicit Upcasting.
        Clothing trouser01 = new Trouser(2, "slacks", 'T', 199.90, 'M', 'F');

        // Calling the doReturn() method on shirt01. This method is implemented from the Returnable interface.
        System.out.println(shirt01.doReturn());
        // Printing the Shirt object implicitly calls its overridden toString() method.
        System.out.println(shirt01);
        System.out.println(); // Prints a blank line for readability.
        // Printing the Trouser object implicitly calls its overridden toString() method.
        System.out.println(trouser01);

        // Creating Trouser objects with different reference types to further illustrate polymorphism:
        Trouser t1 = new Trouser();         // 't1' is a 'Trouser' reference, holding a 'Trouser' object.
        Clothing c1 = new Trouser();        // 'c1' is a 'Clothing' reference, holding a 'Trouser' object (Upcasting).
        Returnable r1 = new Trouser();      // 'r1' is a 'Returnable' interface reference, holding a 'Trouser' object (Interface Polymorphism).

        // --- Demonstrating access through different reference types ---

        // Accessing Trouser-specific method ('getFit') via explicit downcasting from an interface reference.
        // This is safe because we know 'r1' is actually referencing a 'Trouser' object.
        char fitFromR1 = ((Trouser) r1).getFit();
        System.out.println("Fit obtained by downcasting Returnable reference: " + fitFromR1);

        // Calling the overridden 'display()' method on the 't1' Trouser object.
        t1.display();
        // Calling the 'doReturn()' method on the 't1' Trouser object (implemented from Returnable).
        System.out.println(t1.doReturn());
        // Calling the 'getFit()' method directly on the 't1' Trouser object.
        System.out.println("Fit from t1: " + t1.getFit());

        // Accessing methods inherited from the 'Clothing' class using the 'Clothing' reference 'c1'.
        System.out.println("Description (from c1): " + c1.getDesc());
        System.out.println("ItemID (from c1): " + c1.getItemID());

        // Calling the 'doReturn()' method on the 'Returnable' interface reference 'r1'.
        // This demonstrates polymorphism: the 'doReturn()' method of the actual 'Trouser' object is called.
        System.out.println(r1.doReturn());

        // Using 'instanceof' to safely downcast and access subclass-specific methods:
        // It's crucial to check if an object is an instance of a particular type before downcasting,
        // to prevent a 'ClassCastException' at runtime.
        if(c1 instanceof Trouser) {
            char fit = ((Trouser) c1).getFit(); // Safely downcast 'c1' to 'Trouser' to access 'getFit()'.
            System.out.println("These pants are size: " + fit);
        }

        // =====================================================================
        // SECTION 2: CONVERTING ARRAYS TO LISTS (Java Collections Framework)
        // =====================================================================
        // The Java Collections Framework provides powerful interfaces and classes for handling groups of objects.
        // Lists are dynamic, resizable collections, unlike fixed-size native arrays.

        String[] nums = {"One", "Two", "Three"};
        // Arrays.asList(array): Converts a native Java array into a fixed-size List.
        // Important: The returned List is *backed* by the original array. Changes to the List
        // (e.g., setting an element) will affect the array, but you cannot add/remove elements.
        List<String> myList = Arrays.asList(nums);

        // Converting the fixed-size 'List' (returned by Arrays.asList) into a resizable 'ArrayList'.
        // This creates a *new* ArrayList object, copying the elements from 'myList'.
        ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList(nums));
        System.out.println("\nmyArrayList (from array): " + myArrayList); // Output: [One, Two, Three]


        String[] names = {"Ned", "Fred", "Rick", "Alice", "Jessie"};
        // Another common pattern: directly creating an ArrayList from an array.
        List<String> namesList = new ArrayList<>(Arrays.asList(names));
        System.out.println("Initial namesList: " + namesList);

        // =====================================================================
        // SECTION 3: LAMBDA EXPRESSIONS (Functional Programming with Collections)
        // =====================================================================
        // Lambda expressions (introduced in Java 8) provide a concise way to represent anonymous functions.
        // They are frequently used with functional interfaces (interfaces with a single abstract method)
        // in the Java Collections Framework and Streams API.

        System.out.println("\n--- Iterating with Enhanced For Loop ---");
        // This is the traditional way to iterate through a List.
        for(String n: namesList) {
            System.out.print(n.toUpperCase() + ", "); // Prints uppercase versions, but doesn't modify the original list.
        }
        System.out.println("\nAfter for loop (original list unchanged): " + namesList); // The list elements are still original case.

        // Unary Operator Lambda with 'replaceAll()':
        // The 'replaceAll()' method (from the List interface) applies a given operation (lambda)
        // to each element in the list, replacing the original element with the result of the operation.
        // Lambda: 'n -> n.toUpperCase()'
        // 'n' is the input parameter (each String element from the list).
        // '->' separates parameters from the expression body.
        // 'n.toUpperCase()' is the body (the action to perform).
        namesList.replaceAll(n -> n.toUpperCase());
        System.out.println("List.replaceAll lambda (all uppercase): " + namesList); // Output: [NED, FRED, RICK, ALICE, JESSIE]

        // Predicate Lambda with 'removeIf()':
        // The 'removeIf()' method (from the Collection interface) removes elements from the collection
        // that satisfy a given condition (expressed as a lambda, which acts as a 'Predicate').
        // Lambda: 'n -> n.equalsIgnoreCase("Rick")'
        // 'n' is the input parameter.
        // 'n.equalsIgnoreCase("Rick")' is the boolean condition (returns true if 'n' is "Rick", ignoring case).
        namesList.removeIf(n -> n.equalsIgnoreCase("Rick"));
        System.out.println("Predicate Lambda (Removes 'Rick'): " + namesList); // Output: [NED, FRED, ALICE, JESSIE]

        // Another 'removeIf' example with a different condition:
        // This lambda removes names where the length of the string is less than 5 characters.
        namesList.removeIf(n -> n.length() < 5);
        System.out.println("Predicate Lambda (removes if name length is < 5): " + namesList); // Output: [ALICE, JESSIE]
        // Explanation: "NED" (length 3) and "FRED" (length 4) are removed.
    }
}

/*
Overall Summary of Concepts in Lesson 13:
------------------------------------------
This lesson covers a wide array of fundamental Java programming concepts, crucial for building more dynamic and interactive applications:

1.  Interfaces (e.g., `Returnable`):
    * **Concept:** A "contract" that defines a set of methods a class must implement, defining "what a class can do."
    * **Keyword:** `interface`.
    * **Usage:** Classes use `implements` to adhere to an interface (e.g., `Shirt implements Returnable`). This enforces method implementations and enables polymorphism.

2.  Abstract Classes (Revisited - `Clothing`):
    * **Concept:** A base class that cannot be directly instantiated. It can contain both concrete and **abstract methods** (methods without implementation bodies).
    * **Keyword:** `abstract`.
    * **Usage:** Subclasses `extend` an abstract class and *must* implement all inherited abstract methods (unless they are also abstract). This provides a common blueprint while allowing specific implementations.

3.  Inheritance and Method Overriding (`Clothing` -> `Shirt`, `Trouser`):
    * **Concept:** A subclass (`Shirt`, `Trouser`) **`extends`** a superclass (`Clothing`), inheriting its fields and methods.
    * **Method Overriding:** A subclass provides its own specific implementation for a method defined in its superclass (e.g., `Shirt` and `Trouser` both override `display()`).
    * **`super()`:** Used as the first statement in a subclass constructor to call a superclass constructor, ensuring proper initialization of inherited parts.

4.  Polymorphism ("Many Forms"):
    * **Concept:** The ability of an object to take on many forms. A superclass reference variable can refer to a subclass object (e.g., `Clothing trouser01 = new Trouser();`). An interface reference can refer to any object that implements that interface (e.g., `Returnable r1 = new Trouser();`).
    * **Runtime Polymorphism:** When an overridden method is called on a superclass/interface reference, the actual method executed is determined by the *object's true type* at runtime.

5.  Type Casting and `instanceof`:
    * **Upcasting (Implicit):** Assigning a subclass object to a superclass reference (always safe).
    * **Downcasting (Explicit):** Converting a superclass reference to a subclass reference. Requires an explicit cast (`(SubclassType) reference`) and should be used with caution.
    * **`instanceof` Operator:** A safe way to check if an object is an instance of a particular class (or its subclass) before attempting a downcast, preventing `ClassCastException`.

6.  Java Collections Framework (Arrays to `List`/`ArrayList`):
    * **`List` Interface:** Represents an ordered collection of elements.
    * **`ArrayList` Class:** A common, resizable implementation of the `List` interface, offering dynamic size management.
    * **Conversion:** Shows how to convert arrays into `List`s and then into `ArrayList`s for more flexible data manipulation.

7.  Lambda Expressions (`replaceAll`, `removeIf`):
    * **Concept:** Concise, anonymous functions (`(parameters) -> expression`) introduced in Java 8.
    * **Usage with Collections:** Used with methods like `replaceAll()` (to transform elements) and `removeIf()` (to remove elements based on a condition), making collection operations more streamlined and readable.

These concepts collectively empower you to write Java programs that can handle diverse data types, perform repetitive tasks efficiently, manage dynamic collections of data, and interact with the execution environment.
*/