package ex09_2;

public class Customer {
    // Private instance variables for name and SSN.
    private String name;
    private String ssn;

    // Custom constructor:
    // This method is called automatically when a new Customer object is created
    // using 'new Customer(name, ssn)'.
    // It takes 'name' and 'ssn' as arguments and uses them to initialize
    // the object's 'name' and 'ssn' instance variables.
    public Customer(String name, String ssn) {
        this.name = name; // 'this.name' refers to the instance variable, 'name' refers to the parameter.
        this.ssn = ssn; // 'this.ssn' refers to the instance variable, 'ssn' refers to the parameter.
    }

    // Getter method for 'name'.
    public String getName() {
        return name;
    }

    // Setter method for 'name'.
    public void setName(String n) {
        name = n;
    }

    // Getter method for 'ssn'.
    public String getSSN() {
        return ssn;
    }
}
