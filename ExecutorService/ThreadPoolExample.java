package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            System.out.println(Thread.currentThread().getName() + " 実行中: Task 1" );
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        };

        Runnable task2 = () -> {
            System.out.println(Thread.currentThread().getName() + " 実行中: Task 2" );
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        };

        Runnable task3 = () -> {
            System.out.println(Thread.currentThread().getName() + " 実行中: Task 3" );
        };
        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3); // task1 or task2 のどちらかが終わるまで待機

        executor.shutdown();
    }
}
