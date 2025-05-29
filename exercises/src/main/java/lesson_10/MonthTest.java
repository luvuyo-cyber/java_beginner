package lesson_10;

public class MonthTest {
    public static void main(String[] args) {
        //*** SWITCH AND CASE IMPLEMENTATION ***

        int month = 12; // Set the month to December
        boolean isLeapYear = true; // Flag to determine if it's a leap year

        // Switch statement checks the value of the 'month' variable
        switch (month) {
            // Months with 31 days
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                System.out.println("31 days in the month");
                break;

            // February - check if leap year for day count
            case 2:
                if (isLeapYear) {
                    System.out.println("29 days in the month"); // Leap year case
                } else {
                    System.out.println("28 days in the month"); // Non-leap year
                }
                break;

            // Months with 30 days
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days in the month");
                break;

            // If the month is not between 1 and 12
            default:
                System.out.println("Invalid month");
        }

        //*** NESTED IF STATEMENT VERSION (commented out) ***
        /*
        int month = 8;
        boolean isLeapYear = true;

        if (month == 1 || month == 3 || month == 5 || month == 7
            || month == 8 || month == 12) {
            System.out.println("31 days in the month");
        } else if (month == 2) {
            if (isLeapYear) {
                System.out.println("29 days in the month");
            } else {
                System.out.println("28 days in the month");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days in the month");
        } else {
            System.out.println("Invalid month");
        }
        */
    }
}