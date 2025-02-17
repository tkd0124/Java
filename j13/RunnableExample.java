package j13;

public class RunnableExample {
    public static void main(String[] args) {
        // 1. 匿名クラスを使った Runnable の実装
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable via anonymous class is running.");
            }
        };

        // 2. ラムダ式を使った Runnable の実装
        Runnable runnable2 = () -> System.out.println("Runnable via lambda is running.");

        // Thread に Runnable を渡してスレッドを作成
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        // スレッドを開始
        thread1.start();
        thread2.start();

        // メインスレッドは他のスレッドの終了を待つ
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}
