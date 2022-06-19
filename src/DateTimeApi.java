import java.time.Duration;
import java.time.Instant;

public class DateTimeApi {

    public static void main(String[] args) {
        // Instant表示时间线上的某个点，可以将Instant对象用作时间戳
        // 当前的时刻
        Instant now = Instant.now();

        // 被称为"新纪元"的时间线原点
        Instant epoch = Instant.EPOCH;

        int i = now.compareTo(epoch);
        System.out.println(i);
        for (int ii = 0; ii < 100000; ii++) {
            System.out.println(ii);
        }

        // 如何度量算法的运行时间
        // Duration 两个时刻之间的时间量
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(now, end);
        System.out.println(timeElapsed);
        long millis = timeElapsed.toMillis();
        long nanos = timeElapsed.toNanos();
        int nano = timeElapsed.getNano();
        long seconds = timeElapsed.getSeconds();
        long hours = timeElapsed.toHours();
        System.out.println(hours);
        System.out.println(nano);

        // Instant和Duration类都是不可修改的类，返回新的实例
    }
}
