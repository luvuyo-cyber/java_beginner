package ex10_3;

public class Order {
    // Class Constants
    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';

    // Instance Variables
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    // Constructor
    public Order(String name, double total, String stateCode, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = stateCode;
        this.custType = custType;
        calcDiscount(); // Call the discount calculation method.
    }

    public String getDiscount() {
        return Double.toString(discount) + "%";
    }

    // -------------------------------------------------------------------------
    // Discount Calculation Method (using switch statement)
    // -------------------------------------------------------------------------
    // This method calculates the 'discount' based on 'custType' and 'total'.
    public void calcDiscount() {
        // The 'switch' statement evaluates the value of 'custType'.
        // It then jumps to the 'case' label that matches the value.
        switch (custType) {
            case NONPROFIT:
                discount = (total > 900) ? 10.00 : 5.00;
                break;
            case PRIVATE:
                discount = (total > 900) ? 7.00 : 0;
                break;
            case CORP:
                discount = (total < 500) ? 8.00 : 5.00;
                break;
            default: // The 'default' case is executed if 'custType' does not match any 'case' label.
                System.out.println("Invalid custType");
                // In this scenario, 'discount' would remain its default value (0.0).
        }
    }


}
