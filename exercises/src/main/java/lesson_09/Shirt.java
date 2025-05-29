package lesson_09;

public class Shirt {
    private int shirtID = 0;
    private String descr = "-description required-";
    private char colourCode = 'U';
    private double price = 0.0;

    //no arguments
    public Shirt() {
        setColourCode('U');
    }

    //one argument
    public Shirt(char colourCode) {
        setColourCode(colourCode);
    }

    //two arguments
    public Shirt(char colourCode, double price) {
        this(colourCode);
        setPrice(price);
    }

    //three arguments
    public Shirt(String descr, char colourCode, double price) {
        setDescr(descr);
        setColourCode(colourCode);
        setPrice(price);
    }

    public char getColourCode() {
        return colourCode;
    }

    public void setColourCode(char newCode) {
        if(newCode == 'R') {
            colourCode = newCode;
            return;
        }
        if(newCode == 'G') {
            colourCode = newCode;
            return;
        }
        if(newCode == 'B') {
            colourCode = newCode;
            return;
        }
        System.out.println("Invalid colourCode. Use R, G or B");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public static void main(String[] args) {
        Shirt shirt01 = new Shirt();
        System.out.println("Get Colour: " + shirt01.colourCode);
        shirt01.setColourCode('T');
        System.out.println("Set Colour: " + shirt01.colourCode);
    }


}