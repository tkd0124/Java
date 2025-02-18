package fundamentalsOfParallelProcessing;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args) {
        // 非同期タスクを実行し、完了を待つ
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Async task running: " + Thread.currentThread().getName());
        });

        future.join();
    }
}
