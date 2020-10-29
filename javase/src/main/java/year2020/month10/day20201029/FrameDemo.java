package year2020.month10.day20201029;

/**
 * debug 程序，查看跳到不同方法区内后栈帧的生成，以及跳出后栈帧的消失
 * @author KouBeisi
 * @date 2020/10/20
 */
public class FrameDemo {

    public static void main(String[] args) {
        int i = 10;
        method01(i);
        String str = "hello";
        System.out.println(i);
    }

    public static void method01(int x){
        int y = x + 1;
        Object o = method02();
        System.out.println(y);
    }

    public static Object method02(){
        Object o = new Object();
        return o;
    }
}
