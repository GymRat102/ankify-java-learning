import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TimeAdjusterApi {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate nextFriday = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(nextFriday);

        LocalDate nextSaturday = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        System.out.println(nextSaturday);

        LocalDate lastDayOfTodayMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDayOfTodayMonth);

        TemporalAdjuster NEXT_WORKDAY = w -> {
            LocalDate result = (LocalDate) w;
            do {
                result = result.plusDays(1);
            }
            while (result.getDayOfWeek().getValue() >= 6);
            return result;
        };

        TemporalAdjuster temporalAdjuster2 = TemporalAdjusters.ofDateAdjuster(w -> {
            LocalDate result = w;
            do {
                result = result.plusDays(1);
            }
            while (result.getDayOfWeek().getValue() >= 6);
            return result;
        });


        System.out.println(now.getDayOfWeek().getValue());
        System.out.println(now.with(temporalAdjuster2));
    }
}
