package day20201015;

/**
 * @author KouBeisi
 * @date 2020/10/13
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "a";
        s1 = s1 + "b";
        String s2 = "a" + "b";
        String s3 = "ab";
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);
    }
}
