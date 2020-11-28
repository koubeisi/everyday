package year2020.month11.day25;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author koubs
 * @date 2020/11/24
 */
@Slf4j
public class DurationTest {

    @Test
    public void duration(){
        // 根据两个时间直接差创建一个 Duration
        Duration duration = Duration.between(LocalDateTime.of(1991, 6, 10, 1, 10),LocalDateTime.now());

        // 把Duration 转换为 秒
        long seconds1 = duration.toSeconds();
        log.info("seconds1:{}",seconds1);
        long seconds2 = duration.getSeconds();
        log.info("seconds2:{}",seconds2);

        // 根据秒数创建 Duration 对象
        Duration duration1 = Duration.ofMillis(seconds1);
        log.info("duration1:{}",duration1.getSeconds());

        // 操纵 Duration 对象
        Duration duration2 = duration1.plusDays(2);
        log.info("duration2:{}",duration2.getSeconds());

        log.info("{}",(duration2.getSeconds()-duration1.getSeconds())/24/60/60);
    }



}
