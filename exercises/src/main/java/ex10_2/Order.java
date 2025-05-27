package ex10_2;

public class Order {
    // Constants for customer types. 'static final' means these values are fixed
    // and belong to the class, not individual objects
    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';

    // Instance variables to store order details.
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    // Constructor: Initializes a new Order object with provided details.
    public Order(String name, double total, String stateCode, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = stateCode;
        this.custType = custType;
        calcDiscount(); // Calls the discount calculation method immediately.
    }

    // Getter method for the discount, formatted as a string with a '%' sign.
    public String getDiscount() {
        return Double.toString(discount) + "%";
    }

    // Method to calculate the discount based on customer type and total.
    public void calcDiscount() {
        // --- Using if-else if statements for conditional logic ---
        if (custType == NONPROFIT) { // If customer is Non-Profit
            if (total > 900) {      // And total is greater than 900
                discount = 10.00;   // 10% discount
            } else {
                discount = 5.00;    // Otherwise, 5% discount
            }
        } else if (custType == PRIVATE) { // Else if customer is Private
            if (total > 900) {           // And total is greater than 900
                discount = 7.00;         // 7% discount
            } else {
                discount = 0;            // Otherwise, no discount
            }
        } else if (custType == CORP) {    // Else if customer is Corporate
            if (total < 500) {           // And total is less than 500
                discount = 8.00;         // 8% discount
            } else {
                discount = 5.00;         // Otherwise, 5% discount
            }
        }
    }
    // No 'else' for an invalid custType here, discount would remain 0 if initialized to 0.

}
