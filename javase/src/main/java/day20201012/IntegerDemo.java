package day20201012;

/**
 * @author KouBeisi
 * @date 2020/10/13
 */
public class IntegerDemo {

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;
        System.out.println(a == b);

        Integer c = 100;
        Integer d = 100;
        System.out.println(c == d);

        Integer e = 200;
        Integer f = 200;
        System.out.println(e == f);

        Integer g = new Integer(300);
        Integer h = new Integer(300);
        System.out.println(g == h);
    }

}
