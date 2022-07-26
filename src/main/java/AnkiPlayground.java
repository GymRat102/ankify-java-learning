import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class AnkiPlayground {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.CHINA);
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(dateTimeFormatter.format(now));

        // LocalDate API
        LocalDate localDate = LocalDate.now();
        LocalDate localDateNextYear = localDate.plusYears(1);
        LocalDate localDate27 = localDate.withDayOfMonth(27);
        LocalDate localDateDay123 = localDate.withDayOfYear(123);
        long until = localDate27.until(localDateDay123, ChronoUnit.DAYS);
        boolean leapYear = localDateNextYear.isLeapYear();
        DayOfWeek dayOfWeek = localDate27.getDayOfWeek();

        System.out.println(localDate);
        System.out.println(localDateNextYear);
        System.out.println(localDate27);
        System.out.println(localDateDay123);
        System.out.println(until);
        System.out.println(leapYear);
        System.out.println(dayOfWeek);

    }
}
