package day20201022;

/**
 * 线程的六种状态
 * @author koubs
 * @date 2020/10/22
 */
public class ThreadStateDemo {

    private static String str = "hello";
    private static Object o = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (true) {

            }
        },"t1");

        Thread t2 = new Thread(()->{
            synchronized (str){
                while (true) {

                }
            }
        },"t2");
        t2.start();

        Thread t3 = new Thread(()->{

        },"t3");
        t3.start();

        Thread t4 = new Thread(()->{
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t4");
        t4.start();


        Thread t5 = new Thread(()->{
            synchronized (str){
            }
        },"t5");
        t5.start();


        Thread t6 = new Thread(()->{
            while (true) {
                synchronized (o){
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"t6");
        t6.start();


        System.out.println( "t1 " + t1.getState());
        System.out.println( "t2 " + t2.getState());
        System.out.println( "t3 " + t3.getState());
        System.out.println( "t4 " + t4.getState());
        System.out.println( "t5 " + t5.getState());
        System.out.println( "t6 " + t6.getState());

    }
}
