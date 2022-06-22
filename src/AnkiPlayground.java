import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class AnkiPlayground {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.CHINA);
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(dateTimeFormatter.format(now));


    }
}
