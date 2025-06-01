
package lesson_12;

class TestInheritance {

    public static void main(String[] args) {
        //reference is superclass
        Clothing shirt01 = new Shirt(1, "hoodie", 'R', 99.90, 'L');
        Shirt shirt02 = new Shirt(20.00, 'M');
        Clothing trouser01 = new Trouser(2, "2 Chainz", 'T', 199.90, 'M', 'F');
        shirt01.display();
        System.out.println();
        trouser01.getItemID();
        trouser01.display();

        //must cast as trouser because it's a clothing instance
        ((Trouser)trouser01).getFit();
        if(trouser01 instanceof Trouser) {
        char fitcode = ((Trouser)trouser01).getFit();
            System.out.println("Fit: " + fitcode);
        }
    }
}

abstract class Clothing {

    private int itemID = 0;
    private String desc = "-description required-";
    private char colourCode = 'U';
    private double price = 0.0;

    public Clothing(int itemID, String desc, char colourCode, double price) {
        this.itemID = itemID;
        this.desc = desc;
        this.colourCode = colourCode;
        this.price = price;
    }

    public Clothing(double price) {
        this.price = price;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public char getColourCode() {
        return colourCode;
    }

    public void setColourCode(char colourCode) {
        this.colourCode = colourCode;
    }

    public double getPrice() {
        return price;
    }

//    public abstract double getPrice();

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void display();
}

class Shirt extends Clothing {

    private int neckSize;

    private char fit = 'U';

    public Shirt(int itemID, String desc, char colourCode, double price, char fit) {
        //links to superclass(always first line of subclass constructor!!!!)
        super(itemID, desc, colourCode, price);
        this.fit = fit;
    }

    public Shirt(char fit) {
        this(15.00, fit);
    }

    public Shirt(double price, char fit) {
        super(price);
        this.fit = fit;
    }

    public int getNeckSize() {
        return neckSize;
    }

    public void setNeckSize(int neckSize) {
        this.neckSize = neckSize;
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public void display() {
        System.out.println("ItemID: " + getItemID());
        System.out.println("Item Description: " + getDesc());
        System.out.println("Price: " + getPrice());
        System.out.println("Colour Code: " + getColourCode());
        System.out.println("Fit: " + fit);
    }

//    protected void setColourCode(char colourCode) {
//    super.setColourCode(colourCode);
//    }

}



class Trouser extends Clothing {
    private char fit;
    private char gender;

    public Trouser(int itemID, String desc, char colourCode, double price, char fit, char gender) {
        super(itemID,desc,colourCode,price);
        this.fit = fit;
        this.gender = gender;
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
}

class Socks extends Clothing {
    private double price;

    public Socks (double price) {
        super(price);
    }

//    protected  double getPrice() {
//        return price;
//    }

    public void display() {
        System.out.println("ID: " + getItemID());
        System.out.println("Price: " + getPrice());
    }
}