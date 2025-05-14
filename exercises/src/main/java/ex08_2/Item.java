package ex08_2;

// This Item class demonstrates method overloading by having multiple methods
// with the same name but different parameter lists.
public class Item {
    // Fields (attributes) of the Item object.
    String desc;
    int quantity;
    double price;
    char colorCode = 'U'; //'U' = Undetermined. Default color code.

    // Method to display the details of the item.
    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", " + price + ", " + colorCode);
    }

    // --- First version of setItemFields (3 arguments) ---
    // This method sets the description, quantity, and price fields of the item.
    // Signature: public (accessible from anywhere), void (returns nothing), setItemFields (name),
    // (String desc, int qty, double pr) (parameter list).
    public void setItemFields(String desc, int qty, double pr) {

        // Using 'this' is good practice here because the parameter names (desc, qty, pr)
        // are the same as the field names. 'this.desc' refers to the field of the current object,
        // while 'desc' on the right refers to the value passed in as a parameter.
        this.desc = desc;
        this.quantity = qty;
        this.price = pr;

        // No return statement needed because the return type is void.
    }

    // --- Second version of setItemFields (4 arguments) ---
    // This method has the SAME name 'setItemFields' but a DIFFERENT parameter list (4 arguments).
    // This is METHOD OVERLOADING. Java distinguishes between these methods based on the parameters.
    // Signature: public (accessible from anywhere), int (returns an integer), setItemFields (name),
    // (String desc, int qty, double pr, char c) (parameter list).
    public int setItemFields(String desc, int qty, double pr, char c) {
        // Inside this method, we can add logic specific to this version, like color validation.
        // Check if the color code 'c' is valid (not a space).
        if (c != ' ') {
            // If valid, set the color code field of THIS object.
            colorCode = c;

            // Call the 3-argument setItemFields method from within this method
            // using 'this.setItemFields()'. This reuses the code from the other method
            // to set the description, quantity, and price.
            this.setItemFields(desc, qty, pr);

            // Return 1 to indicate that the color was valid and fields were set.
            return 1;
        }
        // If the 'if' condition was false (color code is a space)...
        else {
            // ...return -1 to indicate that the color code was invalid.
            // The other fields (desc, qty, pr) are NOT set in this case
            // because the 3-argument method is only called if the color is valid.
            return -1;
        }
    }


}
