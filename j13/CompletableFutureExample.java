package j13;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        // 非同期にタスクを実行し、結果を受け取る
        CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(500); // タスクの模擬処理
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return "Result from CompletableFuture";
                })
                .thenAccept(result -> {
                    // タスク完了後に結果を出力
                    System.out.println(result);
                })
                .join(); // メインスレッドはタスク完了を待つ
    }
}
