import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        //offset creation
        OffsetDateTime offsetDateTime1 = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        //formatting
        String fullFormattedDate = offsetDateTime1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("Full Format: " + fullFormattedDate);

        String mediumFormattedDate = offsetDateTime1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Medium Format: " + mediumFormattedDate);

        String shortFormattedDate = offsetDateTime1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("Short Format: " + shortFormattedDate);
    }
}
