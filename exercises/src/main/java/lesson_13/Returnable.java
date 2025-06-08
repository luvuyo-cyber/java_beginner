package lesson_13;

// =============================================================================
// Returnable Interface - Defines a contract for items that can be returned
// =============================================================================
// An interface is a blueprint for a class. It defines a set of methods that a class
// must implement if it "implements" this interface. Interfaces specify "what" a class
// can do, without dictating "how" it does it.
public interface Returnable {
    // This is an abstract method (implicitly public and abstract).
    // Any class that 'implements Returnable' MUST provide a concrete implementation
    // for this 'doReturn()' method. It serves as a contract.
    public String doReturn();
}