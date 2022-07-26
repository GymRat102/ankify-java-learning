import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateApi {

    public static void main(String[] args) {
        // LocalDate是年月日
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate feburary1 = LocalDate.of(2008, 2, 1);

        LocalDate march1 = feburary1.plusMonths(1);
        System.out.println(march1);

        System.out.println(LocalDate.of(2007, 1, 1).plusDays(255));
        System.out.println(LocalDate.of(2008, 1, 1).plusDays(255));

        System.out.println(march1.plus(Period.ofMonths(1)));
        System.out.println(feburary1.until(march1, ChronoUnit.DAYS));

        System.out.println("-------");
        LocalDate next = now.plusDays(34);
        System.out.println(now.until(next, ChronoUnit.DAYS));
    }
}
