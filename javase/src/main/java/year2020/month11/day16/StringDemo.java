package year2020.month11.day16;

import java.util.stream.Stream;

/**
 * @author KouBeisi
 * @date 2020/11/19
 */
public class StringDemo {
    public static void main(String[] args) {
        var str1 = " \t \r\n  ";
        // 判断字符串中的字符是否都是为空白
        System.out.println(str1.isBlank());

        str1 = " \t \rabc\n  ";
        var str2 = str1.strip();
        var str3 = str1.trim();
        // 去除字符串首位的空白字符
        // 和trim()的区别在于,trim()只能去除英文空白字符
        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println(str3);
        System.out.println(str3.length());

        // 去除首部字符串
        var str4 = str1.stripLeading();
        System.out.println(str4);
        System.out.println(str4.length());

        // 去除尾部字符串
        var str5 = str1.stripTrailing();
        System.out.println(str5);
        System.out.println(str5.length());

        // 重复字符串
        var str6 = "abc".repeat(3);
        System.out.println(str6);

        // 以切割字符串成流
        var lines = "A\nB\nc\n\n".lines();
        // 可用以统计行数
        var count = lines.count();
        System.out.println(count);
    }
}
