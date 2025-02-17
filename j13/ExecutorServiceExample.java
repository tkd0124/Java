package j13;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // 2スレッドの固定スレッドプールを作成
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // タスクをサブミットし、結果を取得する
        Future<String> future = executor.submit(() -> {
            Thread.sleep(500); // タスクの模擬処理
            return "Task result from ExecutorService";
        });

        try {
            // タスクの結果を待機して取得
            String result = future.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // ExecutorService の終了処理
            executor.shutdown();
        }
    }
}
