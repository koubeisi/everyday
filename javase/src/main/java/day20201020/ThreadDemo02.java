package day20201020;

/**
 * 假设电影院有100张电影票，模拟售票，补全代码，输出结果如下
 *
 * @author Administrator
 * @date 2020/10/20
 */
public class ThreadDemo02 {

    private static int i = 100;

    public static void main(String[] args) {
        System.out.println("Main thread start.");
        for (int j = 0; j < 10; j++) {
            new Thread(() -> {
                    System.out.println(Thread.currentThread().getName() + " start.");
                    while (i > 0){
                        i--;
                        System.out.println(i);
                    }
                    System.out.println(Thread.currentThread().getName() + " stop.");
            },"thread-" + j).start();
        }
     /*   new Thread(
                //...
        ).start();*/
        System.out.println("Main thread stop.");
    }
}
