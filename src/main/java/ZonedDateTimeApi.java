import java.time.*;

/**
 * Ankied
 */
public class ZonedDateTimeApi {

    public static void main(String[] args) {

        // 构造ZonedDateTime
        ZonedDateTime.of(1969,
                7, 16, 9, 32, 0, 0,
                ZoneId.of("America/New_York"));

        // 协调世界时 - 世界时间标准，接近GMT
        // 通过时刻来获得UTC时区的ZonedDateTime对象
        Instant now = Instant.now();
        ZonedDateTime utc = now.atZone(ZoneId.of("UTC"));
        System.out.println(utc);
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("America/New_York"));
        System.out.println(zonedDateTime);


        // 进入夏令时，早上利用阳光，5点变6点
        // 也就是说世界上有的国家，某一个时间是不存在的
        ZonedDateTime skipped = ZonedDateTime.of(
                LocalDate.of(2013, 3, 31),
                LocalTime.of(2, 30),
                ZoneId.of("Europe/Berlin")
        );
        System.out.println(skipped);

        // 夏令时结束，延迟利用阳光，6点变5点
        // 如果你说一个时间，可能有两个，同一个地区不同时令区的版本
        ZonedDateTime ambiguous = ZonedDateTime.of(
                LocalDate.of(2013, 10, 27),
                LocalTime.of(2, 30), // this time could be two versions
                ZoneId.of("Europe/Berlin")
        );
        System.out.println(ambiguous); // but return with the earlier one
        ZonedDateTime anHourlater = ambiguous.plusHours(1);
        System.out.println(anHourlater); // same hour-minutes, but different Offset

        // caution；当加上一个日期可能跨越夏令时边界的时候，请用Period而不是Duration
        // Duration是Instant里的等价物，Period是LocalDate里的等价物
        ZonedDateTime nextMeetingCorrect = ambiguous.plus(Period.ofDays(7));
        ZonedDateTime nextMeetingWrong = ambiguous.plus(Duration.ofDays(7));
        System.out.println(nextMeetingCorrect);
        System.out.println(nextMeetingWrong);
        // how about this
        ZonedDateTime isThisCorrect = ambiguous.plusDays(7);
        System.out.println(isThisCorrect);

        System.out.println("______________");
        System.out.println(ZoneId.getAvailableZoneIds());

        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(
                LocalDate.of(2013, 1, 27),
                LocalTime.of(2, 30), // this time could be two versions
                ZoneId.of("Etc/GMT-7")
        );

        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(
                LocalDate.of(2013, 1, 27),
                LocalTime.of(3, 30), // this time could be two versions
                ZoneId.of("Etc/GMT-8")
        );

        System.out.println(zonedDateTime1.toInstant() + " " + zonedDateTime2.toInstant());
        System.out.println(zonedDateTime1.isAfter(zonedDateTime2));


    }
}
