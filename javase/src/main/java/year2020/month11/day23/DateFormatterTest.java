package year2020.month11.day23;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author koubs
 * @date 2020/11/23
 */
@Slf4j
public class DateFormatterTest {



    /**
     * 格式化时间
     * DateTimeFormatter是线程安全的，可以多线程共享同意变量
     */
    @Test
    public void formatter(){

        // 方式一
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd E HH:mm:ss");
        log.info(formatter1.format(LocalDateTime.now()));

        // 方式二
        var formatter2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        log.info(formatter2.format(LocalDateTime.now()));

        var formatter3 = DateTimeFormatter.ISO_LOCAL_DATE;
        log.info("ISO_LOCAL_DATE:{}",formatter3.format(LocalDate.now()));
    }
}
