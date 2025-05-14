package ex08_1;
// This is our Item blueprint, now with a 'color' field and a 'setColor' method.
public class Item {
    // Field to store the item's color code.
    char color;

    // Declare and code the setColor method.
    // Method Signature:
    // public: Access modifier - this method can be called from any other class.
    // boolean: Return type - this method will return a boolean value (true or false).
    // setColor: Method name - describes the action.
    // (char colorCode): Parameter list - this method takes one input, a character named colorCode.
    public boolean setColor(char colorCode) {

        // Inside the method body, we write the code that performs the action.
        // We check if the input 'colorCode' is equal to the space character.
        if (colorCode == ' ') {

            // If it IS a space, it's an invalid color according to our rule.
            // The 'return false;' statement immediately stops the execution of this method
            // and sends the boolean value 'false' back to the code that called this method.
            return false;
        }
        // If the 'if' condition was false (meaning colorCode is NOT a space)...
        else {
            // ...it's a valid color. We assign the input 'colorCode' to the 'color' field of THIS object.
            // 'this.color' explicitly refers to the 'color' field of the specific Item object
            // on which this setColor method was called. Using 'this' is good practice
            // to distinguish between a field and a parameter with the same name.
            this.color = colorCode;
            // The color was set successfully, so we return 'true'.
            return true; // Stop the method and send 'true' back.
        }
    }

}
