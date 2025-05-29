package lesson_10;

public class Employees {

    public String name1 = "Fred Smith";
    public String name2 = "Sam Smith";
    int age = 50;

    public void areNamesEqual() {
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Names are the same.");
        } else {
            System.out.println("Names are different.");
        }
    }


//    public static void main(String[] args) {
//        Employees emp = new Employees();
//        emp.areNamesEqual();
//
//        if (emp.age < 12 || emp.name1.startsWith("F")) {
//            System.out.println("Found him!");
//        }else {
//            System.out.println("Can't find him!");
//        }
//    }

//    public static void main(String[] args) {
//        //****************************USING NAME STRINGS******************
//        //equals method is more reliable than ==
//        String name1 = "Fred Smith";
//        String name2 = "fred Smith";
//
//        if (name1.equalsIgnoreCase(name2)) {
//            System.out.println("Names are the same.");
//        } else {
//            System.out.println("Names are different.");
//        }
//    }
//
//        //****************************USING NAME STRINGS NEW STRING() AND ==******************
//          //equals method is more reliable than ==
//        String name1 = new String("Fred Smith");
//        String name2 = new String("Fred Smith");
//
//        if (name1 == name2) {
//            System.out.println("Names are the same.");
//        } else {
//            System.out.println("Names are different.");
//        }
//
//    }

}