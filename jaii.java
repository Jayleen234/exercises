import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class jaii {
    public static void main(String[] args) {
        //DateTimeFormatter x = DateTimeFormatter.ofPattern("MM dd yyyy"); // Custom pattern

        //String dateString = "05 22 2025"; // Month-Day-Year format
        //LocalDate y = LocalDate.parse(dateString, x); // Correct usage with formatter

        //System.out.println( y); // Output: 2025-05-22
		

        // Define formatter
        DateTimeFormatter x = DateTimeFormatter.ofPattern("MM dd yyyy");

        // Parse the string into a LocalDate using the formatter
        LocalDate y = LocalDate.parse("05 22 2025", x);

        // Format the LocalDate back to a string using the same formatter
        String z = y.format(x);

        // Print the formatted date
        System.out.println(z);  // Output: 05 22 2025
    
}

    }

