package ex06_1;

// This is our blueprint (Class) for creating Item objects.
// It defines the structure and type of data that each Item object will hold.
public class Item {
    // These are the 'fields' or 'attributes' of an Item object.
    // They represent the data associated with each instance of the Item class.
    // 'public' means these fields can be accessed directly from code outside this class for now.
    public int itemID;      // An integer to uniquely identify the item.
    public String desc;     // A String to store the item's description (e.g., "T-Shirt").
    public double price;    // A double to store the item's price (e.g., 25.99).
    public int quantity;    // An integer to store the quantity of this item in a cart or inventory.


}
