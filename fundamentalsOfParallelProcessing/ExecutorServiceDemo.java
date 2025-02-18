package fundamentalsOfParallelProcessing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        // 固定サイズのスレッドプールを作成（ここでは2スレッド）
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            System.out.println("Task 1 executed by " + Thread.currentThread().getName());
        };

        Runnable task2 = () -> {
            System.out.println("Task 2 executed by " + Thread.currentThread().getName());
        };

        executor.submit(task1);
        executor.submit(task2);

        executor.shutdown();
    }
}
