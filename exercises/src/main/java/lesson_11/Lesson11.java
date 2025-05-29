package lesson_11;

import java.util.ArrayList;
import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.FormatStyle;

public class Lesson11 {

    public static void main(String[] args) {

//        LocalDate myDate = LocalDate.now();
//        System.out.println("Today's date is " + myDate);
//        LocalDate newDate = myDate.minusMonths(10);
//        System.out.println("The new date is " + newDate);
//        JapaneseDate jDate = JapaneseDate.from(myDate);
//        System.out.println("Today's date in Japan is " + jDate);
//        LocalDateTime today = LocalDateTime.now();
//        System.out.println("Today's date (without formatting) is " + today);
//
//        String sdate = today.format(DateTimeFormatter.ISO_DATE_TIME);
//        System.out.println("Today's date (in ISO_DATE_TIME format) is " + sdate);
//
//        String fdate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
//        System.out.println("Today's date (in Medium Localized format) is " + fdate);

// ----------------2d Arrays----------------------
//        int[][] yearlySales;
//        yearlySales = new int[5][4];
//        yearlySales[0][0] = 1000;
//        yearlySales[0][1] = 1500;
//        yearlySales[0][2] = 1800;
//        yearlySales[1][0] = 1000;
//        yearlySales[3][3] = 2000;


//******************WHILE LOOP*****************
//        System.out.println("/*");
//        int counter = 0;
//        while(counter < 3) {
//        System.out.println(" *");
//        counter++;
//        }
//        System.out.println("/*");

//******************FOR LOOP*****************
//        System.out.println("---For Loop---");
//        for (int i = 0; i < 5; i++) {
//            System.out.print("i = " + i + "; ");
//        }
//
//        System.out.println("\n---Convert to While-Loop---");
//        //converted to a while loop
//        int i = 0;
//        while(i < 5) {
//        System.out.print("i = " + i + "; ");
//        i++;
//        }
//        System.out.println("\n---Enhanced For-Loop---");
//        String[] names = {"Luvuyo", "Fisokuhle", "Mazibuko"};
//        for (String n : names) {
//            System.out.println(n);
//        }

//******************DO WHILE LOOP*****************
//        factorial(5);
//        factorial(10);

//---Skipping something in an array while looping---
//        String[] names = {"Luvuyo", "Fisokuhle", "Unavailable", "Mazibuko"};
//        for (int idx = 0; idx < names.length; idx++) {
//            if (names[idx].equalsIgnoreCase("Unavailable")) {
//                continue;
//            }
//            System.out.println(names[idx]);
//        }
//******************NESTED WHILE LOOP*****************
//        String name = "Lenny";
//        String guess = "";
//        int attempts = 0;
//        while (!guess.equalsIgnoreCase(name)) {
//            guess = "";
//            while (guess.length() < name.length()) {
//                char asciiChar = (char) (Math.random() * 26 + 97);
//                guess += asciiChar;
//
//
//            }
//            attempts++;
//        }
//        System.out.println(name + " found after " + attempts + " tries!");

//******************NESTED FOR LOOP*****************
//        int h = 4, w = 10;
//
//        for (int row = 0; row < h; row++) {
//            for (int col = 0; col < w; col++) {
//                System.out.print("@");
//            }
//            System.out.println();
//        }


//        int sales[][] = new int[3][4];
//        int[][] salesArray = initArray(sales);
//        System.out.println("Yearly sales by quarter beginning 2010:");
//        for (int i = 0; i < sales.length; i++) {
//            for (int j = 0; j < sales[i].length; j++) {
//                System.out.println("\tQ" + (j + 1) + " " + sales[i][j]);
//            }
//            System.out.println();
//        }


        ArrayList<String> names;
        names = new ArrayList();

        names.add("Jamie");
        names.add("Gustav");
        names.add("Alisa");
        names.add("Jose");
        //add element in index 2
        names.add(2, "Prashant");
        System.out.println(names);
        System.out.println();
        //removes first element
        names.remove(0);
        //remove last element
        names.remove(names.size() - 1);
        names.remove("Gustav");

        System.out.println(names);

    }
        public static int[][] initArray(int[][] salesArray) {
        int salesAmt = 100;
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 0; inner < 4; inner++) {
                salesArray[outer][inner] = salesAmt++;
            }

        }
        return salesArray;
    }

    static void factorial(int target) {
        int save = target;
        int fact = 1;
        do {
            fact *= target--;
        } while (target > 0);
        System.out.println("Factorial for " + save + ": " + fact);
    }
}