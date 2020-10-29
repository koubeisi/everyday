package year2020.month10.day20201013;

/**
 * @author KouBeisi
 * @date 2020/10/13
 */
public class Son extends  Father {
    private int i = test();
    private static int j = method();

    static {
        System.out.print(6 + "\t");
    }

    Son(){
        System.out.print(7 + "\t");
    }

    {
        System.out.print(8 + "\t");
    }

    @Override
    public int test() {
        System.out.print(9 + "\t");
        return 1;
    }

    public static int method(){
        System.out.print(10 + "\t");
        return 1;
    }
}
