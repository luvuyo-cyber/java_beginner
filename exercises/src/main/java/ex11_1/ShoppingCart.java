package ex11_1;

// -------------------------------------------------------------------------
// Import Statements
// -------------------------------------------------------------------------

// Import the 'LocalDateTime' class, which represents a date-time without a time-zone.
import java.time.LocalDateTime;

// Import the 'DateTimeFormatter' class, used for formatting and parsing date-time objects.
import java.time.format.DateTimeFormatter;

public class ShoppingCart {
    public static void main(String[] args) {
        // ---------------------------------------------------------------------
        // 1. Getting the Current Date and Time
        // ---------------------------------------------------------------------
        // Declare a variable 'orderDate' of type 'LocalDateTime'.
        LocalDateTime orderDate;

        // Initialize 'orderDate' with the current date and time.
        // 'LocalDateTime.now()' is a static factory method that returns
        // the current date-time from the system clock in the default time-zone.
        orderDate = LocalDateTime.now();

        // Print the 'orderDate' object directly.
        // When a date-time object is printed, its default 'toString()' method
        // provides a standard representation (e.g., 2025-05-27T17:51:30.123).
        System.out.println("Order date: " + orderDate);

        // ---------------------------------------------------------------------
        // 2. Formatting the Date and Time
        // ---------------------------------------------------------------------
        // Format the 'orderDate' object into a specific string format.
        // 'DateTimeFormatter.ISO_LOCAL_DATE' is a predefined formatter that
        // produces a date in the ISO 8601 format (YYYY-MM-DD).
        // The 'format()' method of 'LocalDateTime' takes a 'DateTimeFormatter'
        // and returns a formatted String.
        String fDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        // Print the formatted date string.
        System.out.println("Formatted order date: " + fDate);
        System.out.println("Another way: " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
}
