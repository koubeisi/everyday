package day20201020;

/**
 * 假设电影院有100张电影票，模拟售票，补全代码，输出结果如下
 *
 * @author Administrator
 * @date 2020/10/20
 */
public class ThreadDemo01 {

    private static int i = 100;

    public static void main(String[] args) {
        System.out.println("Main thread start.");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " start.");
                while (i > 0){
                    i--;
                    System.out.println(i);
                }
                System.out.println(Thread.currentThread().getName() + " stop.");
            }
        },"thread-1").start();
     /*   new Thread(
                //...
        ).start();*/
        System.out.println("Main thread stop.");
    }
}