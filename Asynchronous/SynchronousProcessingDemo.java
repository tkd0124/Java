package Asynchronous;

public class SynchronousProcessingDemo {
    public static void main(String[] args) {
        System.out.println("Main Thread : " + Thread.currentThread().getName());

        // 同期的に処理を実行
        System.out.println("Step 1 : 初期値計算中 (10) - 実行スレッド: " + Thread.currentThread().getName());
        int value = 10;

        System.out.println("Step 2: 値を2倍に - 実行スレッド: " + Thread.currentThread().getName());
        value = value * 2;

        System.out.println("Step 3: 値から5を引く - 実行スレッド: " + Thread.currentThread().getName());
        value = value - 5;

        System.out.println("最終結果：" + value + " - 実行スレッド: " + Thread.currentThread().getName());
    }
}
