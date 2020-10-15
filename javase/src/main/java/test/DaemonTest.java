package test;

/**
 * @author KouBeisi
 * @date 2020/10/12
 */
public class DaemonTest {

    public static void main(String[] args) {
        Thread t1  = new Thread(() -> { for (; ; ) { } });
        t1.setDaemon(true);
        t1.start();

        Thread t2  = new Thread(() -> { for (; ; ) { } });
    }
}
