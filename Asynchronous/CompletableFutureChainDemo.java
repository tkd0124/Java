package Asynchronous;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureChainDemo {
    public static void main(String[] args) {

        System.out.println("Main Thread : " + Thread.currentThread().getName());

        // 非同期に初期値（10）を計算する
        CompletableFuture<Integer> futureChain = CompletableFuture
            .supplyAsync(() ->{
            System.out.println("Step 1 : 初期値計算中 (10) - 実行スレッド: " + Thread.currentThread().getName());
                return 10;
            })
        // 計算結果を2倍にする
            .thenApply(value ->{
                System.out.println("Step 2: 値を2倍に - 実行スレッド: " + Thread.currentThread().getName());
                return value * 2;
            })
        // その結果から5を引く
        .thenApply(value -> {
            System.out.println("Step 3: 値から5を引く - 実行スレッド: " + Thread.currentThread().getName());
            return value - 5;
        });

        // 連鎖処理の最終結果を受け取って出力
        futureChain.thenAccept(result -> {
            System.out.println("最終結果：" + result + "‐　実行スレッド" + Thread.currentThread().getName());
        });

        // メインスレッドが終了しないように、タスクの完了を待つ
        futureChain.join();



    }
}
