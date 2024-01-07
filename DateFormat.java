import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {

        String dateString = "2024-01-06";


        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;

        try {
            date = inputFormat.parse(dateString);
        } catch (Exception e) {

        }

        
        if (date != null) {
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
            String formattedDate = outputFormat.format(date);
            System.out.println("Original Date: " + dateString);
            System.out.println("Formatted Date: " + formattedDate);
        }
    }
}
