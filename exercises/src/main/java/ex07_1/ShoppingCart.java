package ex07_1;

public class ShoppingCart {
    public static void main (String[] args) {
        String custName = "Steve Smith"; // Our customer's full name
        String firstName; // A variable to store the first name we extract
        int spaceIdx; // A variable to store the index (position) of the space character

        // Get the index of the space character (" ") in custName.
        // The indexOf() method searches the string for the first occurrence of the character(s)
        // you give it and returns its 0-based index. If it's not found, it returns -1.
        spaceIdx = custName.indexOf(" ");

        // Use the substring method to parse out the first name.
        // substring(startIndex, endIndex) returns a NEW string containing the characters
        // from startIndex up to (but NOT including) endIndex.
        // We want the characters from the very beginning (index 0) up to the space's index.
        firstName = custName.substring(0, spaceIdx);

        // Print the extracted first name to the console.
        System.out.println("Extracted first name: " + firstName);

    }
}
