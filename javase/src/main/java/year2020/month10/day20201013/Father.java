package year2020.month10.day20201013;

/**
 * @author KouBeisi
 * @date 2020/10/13
 */
public class Father {

    static {
        System.out.print(1 + "\t");
    }
    private int i = test();
    private static int j = method();


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
