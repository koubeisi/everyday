package day20201013;

/**
 * @author KouBeisi
 * @date 2020/10/13
 */
public class Father {

    private int i = test();
    private static int j = method();

    static {
        System.out.print(1 + "\t");
    }

    Father(){
        System.out.print(2 + "\t");
    }

    {
        System.out.print(3 + "\t");
    }

    public int test(){
        System.out.print(4 + "\t");
        return 1;
    }

    public static int method(){
        System.out.print(5 + "\t");
        return 1;
    }
}
