package ProcessThread;

public class ThreadExample {
    public static void main(String[] args) {
        // 1つ目のスレッド
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("スレッド1: " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        // 2つ目のスレッド
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("スレッド2: " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        // スレッドを開始
        thread1.start();
        thread2.start();
    }
}
