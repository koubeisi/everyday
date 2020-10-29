package year2020.month10.day20201011;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "hello world";
        String s3 = new String("hello world");
        String s4 = new String("hello world");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s3.intern());
        System.out.println(s3 == s4);
    }
}
