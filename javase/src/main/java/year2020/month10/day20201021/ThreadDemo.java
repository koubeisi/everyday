package year2020.month10.day20201021;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 使用 jps、top -H -p、jstack 查看进程和线程信息
 * @author KouBeisi
 * @date 2020/10/20
 */
public class ThreadDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new Thread(() ->{
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1").start();

        FutureTask<Integer> task = new FutureTask<>(() -> {
            Thread.sleep(50000);
            return 100;
        });
        new Thread(task,"t2").start();
        System.out.println(task.get());
    }
}
