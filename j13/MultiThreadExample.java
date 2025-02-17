package j13;

public class MultiThreadExample {
    public static void main(String[] args) {
        // スレッド1: 0〜4の数字を500ミリ秒ごとに出力
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: 数字 " + i);
                try {
                    Thread.sleep(500); // 500ミリ秒停止
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread 1 終了");
        });

        // スレッド2: 0〜4の数字を700ミリ秒ごとに出力
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: 数字 " + i);
                try {
                    Thread.sleep(700); // 700ミリ秒停止
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread 2 終了");
        });

        // 両方のスレッドを開始
        thread1.start();
        thread2.start();

        // メインスレッドは、thread1 と thread2 の終了を待つ
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main スレッド 終了");
    }
}
