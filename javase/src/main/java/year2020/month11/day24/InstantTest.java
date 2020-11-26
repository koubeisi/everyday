package year2020.month11.day24;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.Instant;

/**
 * @author koubs
 * @date 2020/11/23
 */
@Slf4j
public class InstantTest {

    @Test
    public void test1() {
        // 获取当前时刻的时间戳
        Instant now = Instant.now();
        log.info("now:{}",now);

        // 获取当前时间到 1970-01-01 00:00:00 毫秒数
        long epochSecond = now.getEpochSecond();
        // 获取当前时间到 1970-01-01 00:00:00 纳秒部分
        int nano = now.getNano();
        log.info("epochTime:{}.{}",epochSecond,nano);

        Instant instant = Instant.ofEpochSecond(epochSecond,nano);
        log.info("instant:{}",instant);
    }
}
