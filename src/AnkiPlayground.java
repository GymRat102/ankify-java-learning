import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
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


        ZonedDateTime now2 = ZonedDateTime.now();
        now.plus(Period.ofWeeks(1));
        now.plusWeeks(1);

        System.out.println(ZonedDateTime.of(2000, 3, 31, 2, 30, 0, 0, ZoneId.of("Europe/Paris")));
        LocalDate now1 = LocalDate.now();
        now1.plusWeeks(1);
        now1.withDayOfMonth(1);
        now1.until(LocalDate.now(), ChronoUnit.DAYS);
        now1.isLeapYear();
        DayOfWeek dayOfWeek = now1.getDayOfWeek();


    }
}
