package lesson_10;
// =============================================================================
// FILE 3: MonthTest.java - Demonstrates the Switch Statement
// =============================================================================

// The MonthTest class demonstrates the use of the 'switch' statement.
public class MonthTest {
    public static void main(String[] args) {
        //*** SWITCH AND CASE IMPLEMENTATION ***

        int month = 13; // Set the month to December (for testing the switch statement).
        boolean isLeapYear = true; // Flag to determine if it's a leap year.

        // Switch statement:
        // Provides an alternative to a long chain of 'if-else if' statements
        // when you want to perform different actions based on the value of a single variable.
        switch (month) {
            // 'case' labels represent possible values for the 'month' variable.
            // Multiple 'case' labels can be grouped together if they should execute the same code.
            // Here, cases 1, 3, 5, 7, 8, 12 all fall through to the same 'println' statement.
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 12: // December
                System.out.println("31 days in the month");
                break; // 'break' statement is crucial! It exits the switch block once a match is found.
            // Without 'break', execution would "fall through" to the next case.

            // February - requires an additional check for leap year.
            case 2: // February
                if (isLeapYear) { // Nested if-else statement within a switch case.
                    System.out.println("29 days in the month"); // Leap year case
                } else {
                    System.out.println("28 days in the month"); // Non-leap year
                }
                break; // Exit the switch after handling February.

            // Months with 30 days.
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                System.out.println("30 days in the month");
                break; // Exit the switch.

            // The 'default' case is optional. It executes if none of the 'case' labels match the 'month' value.
            default:
                System.out.println("Invalid month");
                // No break needed here as it's the last statement in the switch.
        }

        //*** NESTED IF STATEMENT VERSION (commented out) ***
        // This commented section shows an equivalent logic using nested if-else if statements.
        // While functional, for many discrete values, a switch statement can be more readable and efficient.
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