package year2020.month10.day20201016;

/**
 * 静态内部类
 *
 * @author KouBeisi
 * @date 2020/10/14
 */
public class StaticClass {

    static class Person{
        private String s0 = test();
        {
            System.out.println(1);
        }

        private static String s1 = "hello";
        private String s2 =  "world";
        public static String test(){
            System.out.println(2);
            return "test";
        }
    }

    public static void main(String[] args) {
        Person.test();
//        System.out.println(Person.s1);
        new Person();
    }

}
