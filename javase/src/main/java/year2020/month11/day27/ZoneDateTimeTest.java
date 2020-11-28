package year2020.month11.day27;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.*;

/**
 * @author koubs
 * @date 2020/11/24
 */
@Slf4j
public class ZoneDateTimeTest {

    @Test
    void zoneIdTest(){
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        log.info("zoneId:{}",zoneId.getId());

        ZoneOffset zoneOffset = ZoneOffset.of("+08:00");
        log.info("zoneOffset:{}",zoneOffset.getId());

        ZonedDateTime zonedDateTime = LocalDateTime.now().atZone(zoneId);
        OffsetDateTime offsetDateTime = LocalDateTime.now().atOffset(zoneOffset);
        log.info("zonedDateTime:{}",zonedDateTime);
        log.info("offsetDateTime:{}",offsetDateTime);
    }

    @Test
    public void test(){
        // 方式一：
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        // 可以看到输出结果是带时区的
        log.info("{}",zonedDateTime.toString());
        // LocalDateTime 是没有该方法的
        ZoneId zoneId = zonedDateTime.getZone();
        log.info("{}",zoneId);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("America/New_York"));
        log.info("zonedDateTime1:{}",zonedDateTime1.toString());

        // 方式二
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime2 = localDateTime.atZone(ZoneId.of("Asia/Shanghai"));
        log.info("localDateTime:{}",localDateTime);
        log.info("zonedDateTime2:{}",zonedDateTime2);
    }
}
