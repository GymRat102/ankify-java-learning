import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalTimeApi {

    public static void main(String[] args) {

        // LocalTime 当日时刻，不关心A/P
        LocalTime now = LocalTime.now();
        System.out.println(now);

        // LocalTime可以加一个duration
        LocalTime time = LocalTime.of(5, 48);
        LocalTime timePlusOneMinutes = time.plus(Duration.of(1, ChronoUnit.MINUTES));
        System.out.println(timePlusOneMinutes);

        // LocalTime 转化为当日的nanos
        System.out.println(time.toNanoOfDay());

        // 比较两个localtime
        boolean isAfter = time.isAfter(timePlusOneMinutes);
        System.out.println(isAfter);

        // LocalDateTime 储存固定时区的时间点
        LocalDateTime nowLocalDateTime = LocalDateTime.now();
        System.out.println(nowLocalDateTime);

    }
}
