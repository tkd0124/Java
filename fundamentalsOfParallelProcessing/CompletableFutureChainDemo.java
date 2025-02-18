package fundamentalsOfParallelProcessing;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureChainDemo {
    public static void main(String[] args) {
        //非同期で値を供給
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(100); // 処理の遅延をシミュレート
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 50;
        });

        // 供給された値に対して変換処理を実施（値を2倍にする）
        CompletableFuture<Integer> multipliedFuture = future.thenApply(result -> result * 2);

        // 最終結果を消費
        multipliedFuture.thenAccept(result -> {
            System.out.println("Final result: " + result);
        });

        // タスク完了まで待機
        multipliedFuture.join();
    }
}
