package ex07_2;

public class ShoppingCart {
    public static void main (String[] args) {
        String custName = "Steve Smith"; // The original full name
        String firstName; // To hold the extracted first name
        int spaceIdx; // To hold the index of the space
        StringBuilder sb; // Declare a variable of type StringBuilder

        // Get the index of the space and extract the first name (same as previous exercise).
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println("Extracted first name: " + firstName); // Print the extracted first name

        // Instantiate and initialize sb to firstName.
        // We create a NEW StringBuilder object and give it the 'firstName' string to start with.
        sb = new StringBuilder(firstName);

        // Put the full name back together, using StringBuilder's append method.
        // The append() method adds the specified text to the end of the current StringBuilder.
        // This modifies the StringBuilder object directly, which is efficient for repeated additions.
        sb.append(" Smith"); // Append a space and the literal string "Smith"

        // The commented line below shows an alternative way to get the last name
        // by extracting the substring from the original custName starting at the space index.
        // Challenge: sb.append(custName.substring(spaceIdx));

        // Print the full name that is now stored in the StringBuilder object.
        // When you print a StringBuilder, Java automatically uses its toString() method
        // to get a String representation of its content.
        System.out.println("Full name built with StringBuilder: " + sb);
    }
}
