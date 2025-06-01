package lesson_13;

import lesson_12.*;

public class Trouser extends Clothing implements Returnable {
    private char fit;
    private char gender;

    public Trouser(int itemID, String desc, char colourCode, double price, char fit, char gender) {
        super(itemID,desc,colourCode,price);
        this.fit = fit;
        this.gender = gender;
    }

    public Trouser() {
        super(1, "Pants", 'R', 0.0);
        this.fit = 'L';
        this.gender = 'M';
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void display() {
        System.out.println("ItemID: " + getItemID());
        System.out.println("Item Description: " + getDesc());
        System.out.println("Price: " + getPrice());
        System.out.println("Colour Code: " + getColourCode());
        System.out.println("Fit: " + fit);
        System.out.println("Gender: " + gender);
    }
    //overriding the toString() method
    @Override
    public String toString() {
        return ("\nItemID: " + getItemID() + "\nPrice: " + getPrice() + "\nColour Code: " + getColourCode() +
                "\nFit: " + fit + "\nGender: " + gender);
        //("These slacks are beige" + );
    }

    public String doReturn() {
        return "Trouser returns must be within 3 days.";
    }
}