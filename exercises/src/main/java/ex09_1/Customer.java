package ex09_1;

public class Customer {
    // Private instance variables: These store the data for each Customer object.
    // 'private' means they can only be accessed directly from within this class,
    // enforcing encapsulation.
    private String name;
    private String ssn;

    // Getter method for 'name': Allows other classes to read the customer's name.
    public String getName() {
        return name;
    }

    // Setter method for 'name': Allows other classes to change the customer's name.
    public void setName(String n) {
        name = n;
    }

    // Getter method for 'ssn': Allows other classes to read the customer's SSN.
    // Notice there is no 'setSsn' method, making 'ssn' read-only from outside.
    public String getSSN() {
        return ssn;
    }
}
