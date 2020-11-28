package year2020.month11.day23;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author koubs
 * @date 2020/11/23
 */
@Slf4j
public class SimpleDateFormatterTest {

    /**
     * 时间格式化
     * SimpleDateFormat线程不安全，如果只能单线程使用
     */
    @Test
    public void test() throws ParseException {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss z");
        String formattedNow = simpleDateFormat.format(now);
        log.info(formattedNow);
        log.info("{}",now);
        Date date = simpleDateFormat.parse("2020-11-24 周二 01:00:29 CST");
        log.info("{}",date);
    }
}
