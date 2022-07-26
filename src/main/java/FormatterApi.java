import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Ankied
 */
public class FormatterApi {

    public static void main(String[] args) {

        ZonedDateTime apollo11launch = ZonedDateTime.of(1969, 7, 16,
                9, 32, 0, 0,
                ZoneId.of("America/New_York"));

        // 预定义的格式器
        String formatted = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(apollo11launch);
        System.out.println(apollo11launch.toOffsetDateTime());
        System.out.println(formatted);
        System.out.println();

        // Local相关的格式器
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        String formatted2 = formatter.format(apollo11launch);
        System.out.println(formatted2);
        String formatted3 = formatter.withLocale(Locale.FRANCE).format(apollo11launch);
        System.out.println(formatted3);

        // 定制模式的格式化器
        formatter = DateTimeFormatter.ofPattern("E yyyy-MM-dd HH:mm");

        // 解析字符串中的时间/日期
        LocalDate birthday = LocalDate.parse("1903-06-14"); // 标准的格式器
        ZonedDateTime apollo11launchZonedDatetime = ZonedDateTime.parse("1969-07-16 03:32:00-0400", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssxx"));
        LocalDateTime parsed = LocalDateTime.parse("1969-07-16 03:32:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(parsed + "   ___   ");

    }

}
