package year2020.month11.day17;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;

/**
 * @author KouBeisi
 * @date 2020/11/19
 */
@Slf4j
public class LocalDateTimeTest {


    /**
     * 创建时间
     */
    @Test
    public void create() {
        // 方法一：获取当前时间
        var localDateTime = LocalDateTime.now();
        log.info("localDateTime:{}", localDateTime);
        var cst = LocalDateTime.now(ZoneId.of("America/Chicago"));
        log.info("cst:{}", cst);

        // 方法二：自定义时间
        var customDateTime = LocalDateTime.of(2020, 11, 20, 8, 59);
        log.info("customDateTime:{}", customDateTime);

        // 方式三：根据已有的时间创建
        var localDate = LocalDate.now();
        var localTime = LocalTime.now();
        var localDateTime1 = LocalDateTime.of(localDate, localTime);
        log.info("localDateTime1:{}", localDateTime1);
        var localDateTime2 = localDate.atTime(localTime);
        log.info("localDateTime2:{}", localDateTime2);
        var localDateTime3 = localTime.atDate(localDate);
        log.info("localDateTime3:{}", localDateTime3);


        // 方式四：解析字符串创建
        // 默认使用 DateTimeFormatter.IOS_LOCAL_DATE_TIME
        LocalDateTime localDateTime4 = LocalDateTime.parse("1991-06-10T18:23:59");
        log.info("localDateTime4:{}",localDateTime4);
        LocalDateTime localDateTime5 = LocalDateTime.parse("1991-06-10 18:23:59", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        log.info("localDateTime5:{}",localDateTime5);
    }


    /**
     * 获取时间的属性
     */
    @Test
    public void get() {
        var now = LocalDateTime.now();

        // 方式一
        int year = now.getYear();
        log.info("year:{}", year);
        int dayOfYear = now.getDayOfYear();
        log.info("dayOfYear:{}", dayOfYear);
        int dayOfMonth = now.getDayOfMonth();
        log.info("dayOfMonth:{}", dayOfMonth);
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        log.info("dayOfWeek:{}", dayOfWeek.getValue());

        // 方式二
        year = now.get(ChronoField.YEAR);
        log.info("year:{}", year);
        dayOfYear = now.get(ChronoField.DAY_OF_YEAR);
        log.info("dayOfYear:{}", dayOfYear);
        dayOfMonth = now.get(ChronoField.DAY_OF_MONTH);
        log.info("dayOfMonth:{}", dayOfMonth);
        int theDayOfWeek = now.get(ChronoField.DAY_OF_WEEK);
        log.info("dayOfWeek:{}", theDayOfWeek);
    }

    /**
     * 对时间进行加减 plus minus
     * 更改时间的属性 with
     * 对时间的修改都是返回一个新对象
     */
    @Test
    public void plus() {
        var now = LocalDateTime.now();
        log.info("now:{}",now);

        // 对时间增加或减去
        LocalDateTime localDateTime1 = now.plusYears(2);
        LocalDateTime localDateTime2 = now.minusDays(2);
        log.info("localDateTime2:{}",localDateTime1);
        log.info("localDateTime3:{}",localDateTime2);

        // 直接更改时间的某一属性
        LocalDateTime localDateTime3 = now.withYear(1991);
        log.info("localDateTime3:{}",localDateTime3);

        // 直接更改日期为本月最后一天
        LocalDateTime localDateTime4 = now.with(TemporalAdjusters.lastDayOfMonth());
        log.info("localDateTime4:{}",localDateTime4);
        // 直接更改日期为下一个周五
        LocalDateTime localDateTime5 = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        log.info("localDateTime5:{}",localDateTime5);

        // 增加一段时间
        Duration duration = Duration.ofHours(2);
        LocalDateTime localDateTime6 = now.plus(duration);
        log.info("localDateTime6:{}",localDateTime6);

        // 增加一段时间
        Period period = Period.ofMonths(2);
        LocalDateTime localDateTime7 = now.plus(period);
        log.info("localDateTime7:{}",localDateTime7);
    }
}
