
package lesson_09;

public class Practice {
    public static void main(String[] args) {

//EXAMPLE1 (REFER TO ITEM AND CUSTOMER CLASSES BELOW MAIN METHOD)
//1)
//accessing private fields from a different class
//Customer cust1 = new Customer();
//Item item = new Item();
//item.price = 10.00;
//item.setPrice(cust1);
//
//cust1.setPhoneNumber("0721234567");
//
//2)
//using access control on methods
//Item item2 = new Item();
//        System.out.println(item2); //id output = 1
//Item item3 = new Item();
//        System.out.println(item3); //id output = 2
//
//
//
//EXAMPLE2 (REFER TO SHIRT CLASS BELOW MAIN METHOD)
//1)
//using getter and setter methods (without checks)
//Shirt theShirt = new Shirt();
//char colorCode;
//
//theShirt.setColorCode('R');
//colorCode = theShirt.getColorCode();
//        System.out.println("Color Code: " + colorCode);
////simulating an invalid color code
//theShirt.setColorCode('Z');
//colorCode = theShirt.getColorCode();
//        System.out.println("Color Code: " + colorCode); //invalid color will be outputted because no checks are in place
//
//2)
//using getter and setter methods (with checks)
//Shirt theShirt = new Shirt();
//        System.out.println("Color Code: " + theShirt.getColorCode());
//
//theShirt.setColorCode('Z');
//        System.out.println("Color Code: " + theShirt.getColorCode());
//
//
//
//EXAMPLE3 (USING CONSTRUCTORS)
//1)instantiating shirt object using the setter methods
//Shirt theShirt = new Shirt();
//theShirt.setColorCode('R');
//theShirt.setDescription("Golf T-shirt");
//theShirt.setPrice(159.99);
//System.out.println(theShirt);
//
//2)instanttating shirt object using constructor
//Shirt theShirt = new Shirt('B', "V-Neck", 109.99);
//        System.out.println(theShirt);
//
//
//3)instantiating shirt objects using the other constructors
        Shirt shirt0 = new Shirt();
        System.out.println("\n*----- No-args constructor -----*" + shirt0);

        Shirt shirt1 = new Shirt('R');
        System.out.println("\n*----- 1-arg constructor -----*" + shirt1);

        Shirt shirt2 = new Shirt('G', 79.99);
        System.out.println("\n*----- 2-args constructor -----*" + shirt2);
    }//end of main method


    //======================================== ITEM CLASS ========================================
    static class Item {
        private int id;
        private String desc;
        private double price = 15.50;
        private static int nextId = 1;

        public Item() {
            setId();
            desc = "-- description required --";
            price = 0.00;

        }//end of item constructor

        public void setPrice(Customer cust) {
            System.out.println("Original Price = R" + price);
            if (cust.hasLoyaltyDiscount()) {
                price = price * .85;
            }
            System.out.println("Price Charged = R" + price);
        }//end of setPrice method

        private void setId() {
            id = Item.nextId++;
        }//end of setId method

        @Override
        public String toString() {
            return "\n===== Item Details =====" +
                    "\n- ID: " + id
                    + "\n- Description: " + desc
                    + "\n- Price: R" + price;
        }//end of toString method

    } //end of item class

    //======================================== CUSTOMER CLASS ========================================
    static class Customer {
        public String name;
        public int custID;
        public boolean receivesDiscount = true;
        private int phone;

        public void displayCustomer() {
            System.out.println("Customer" + custID + ") " + name);
        } //end of displayCustomer method

        public boolean hasLoyaltyDiscount() {
            return receivesDiscount;
        }//end of hasLoyaltyDiscount method

        public void setPhoneNumber(String s_num) {
            this.phone = Integer.parseInt(s_num);
            System.out.println("Phone Number: " + phone);
        }



    } //end of Customer class

    //======================================== ITEM CLASS ========================================
    static class Shirt {
        private int shirtID = 0;
        private String description = "-- description required --";
        private char colorCode = 'U';
        private double price = 0.0;

        // CONSTRUCTORS
//    1)
        public Shirt(char colorCode, String desc, double price) {
            setColorCode(colorCode);
            setDescription(desc);
            setPrice(price);
        }//end of 3-arg constructor
        //
//    2)
        public Shirt() {
            setColorCode('U');
        }//end of no-arg constructor
        //
//    3)
        public Shirt(char colorCode) {
            setColorCode(colorCode);
        }//end of 1-arg constructor
        //
//    4)
        public Shirt(char colorCode, double price) {
            this(colorCode); //calls the 1-arg constructor ('this' looks for method whose signature matches)
            setPrice(price);
        }//end of 2-arg constructor


        // METHODS
        public char getColorCode() {
            return colorCode;
        }//end of getColorCode method (getter)

        //1)
//below is setter method without a check
//    public void setColorCode(char newCode) {
//        colorCode = newCode;
//    }//end of first setColorCode method (setter)
//
//2)
//below is setter method with checks
        public void setColorCode(char newCode) {
            if (newCode == 'R') {
                colorCode = newCode;
                return;
            }
            if (newCode == 'G') {
                colorCode = newCode;
                return;
            }
            if (newCode == 'B') {
                colorCode = newCode;
                return;
            }
            System.out.println("Invalid colorCode. Use R, G or B");
        }//end of second colorCode setter method


        public void setDescription(String desc) {
            description = desc;
        }//end of setDescription method

        public void setPrice(double itemPrice) {
            price = itemPrice;
        }//end of setPrice method


        @Override
        public String toString() {
            return "\n===== Shirt Details =====" +
                    "\n- ID: " + shirtID
                    + "\n- Description: " + description
                    + "\n- Color Code: " + colorCode
                    + "\n- Price: R" + price;
        }//end of toString method




    }

}//end of lesson09 package
