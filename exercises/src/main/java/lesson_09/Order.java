package lesson_09;

public class Order {
    public static void main(String[] args) {
        Customer cust = new Customer(1);
        Item item = new Item();
//        cust.setLoyaltyPoints(true);
        item.setPrice(cust);
    }
}

class Item {
    private double price = 15.50;

    public void setPrice (Customer cust) {
        if (cust.hasLoyaltyDiscount()) {
            price = price * 0.85;
            System.out.println("Price with discount: " + price);
        } else {
            System.out.println("Price without discount: " + price);
        }
    }
}

class Customer {
    private int ID;
    private boolean loyaltyPoints;

    public Customer(int ID) {
        this.ID = ID;
    }

    public void setLoyaltyPoints(boolean loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public boolean hasLoyaltyDiscount() {
        return loyaltyPoints;
    }
}


