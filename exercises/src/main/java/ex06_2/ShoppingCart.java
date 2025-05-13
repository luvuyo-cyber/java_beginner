package ex06_2;

public class ShoppingCart {

    public static void main (String[] args) {
        // Declare two variables that can hold references to Item objects.
        Item item1, item2;

        // Create the FIRST actual Item object in the computer's memory.
        // The 'new' keyword allocates memory.
        // 'item1' is assigned the memory address (reference) of this new object.
        item1 = new Item();

        // Create the SECOND actual Item object in memory. This is a DIFFERENT object.
        // 'item2' is assigned the memory address (reference) of this second new object.
        item2 = new Item();

        // Now, we use the reference variables and the dot operator (.)
        // to access the 'desc' field of the objects they point to and assign values.
        item1.desc = "Shirt"; // Set the description of the object item1
        item2.desc = "Pants"; // Set the description of the object item2

        // Print the descriptions.
        // At this point, item1 points to the "Shirt" object, and item2 points to the "Pants" object.
        System.out.println("Before assignment:");
        System.out.println("Item 1: " + item1.desc); // Should print "Shirt"
        System.out.println("Item 2: " + item2.desc); // Should print "Pants"
        System.out.println(); // Print a blank line for spacing

        // *** The key step to understand references! ***
        // Assign the value of the 'item2' reference variable to the 'item1' reference variable.
        // This does NOT copy the object itself. It copies the MEMORY ADDRESS.
        // Now, both 'item1' and 'item2' variables hold the SAME memory address.
        // They both point to the SAME object in memory (the one that originally held "Pants").
        // The original object that 'item1' pointed to ("Shirt") now has no reference variable
        // pointing to it and becomes eligible for garbage collection (Java's automatic memory cleanup).
        item1 = item2;

        // Print the descriptions again after the assignment.
        // Since both item1 and item2 point to the same object, accessing .desc
        // through either variable will get the description from that single object.
        System.out.println("After assignment (item1 = item2):");
        System.out.println("Item1: " + item1.desc); // Will now print "Pants"
        System.out.println("Item2: " + item2.desc); // Will still print "Pants"

        // What if we change the description using item1 now?
        item1.desc = "Jacket";
        System.out.println("\nAfter changing item1.desc:");
        System.out.println("Item1: " + item1.desc); // Will print "Jacket"
        System.out.println("Item2: " + item2.desc); // Will ALSO print "Jacket" because they point to the same object!
    }

    }

