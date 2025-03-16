package ProcessThread;

public class MultiThreadExample {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " のカウント: " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        };

        Thread thread1 = new Thread(task, "スレッド1");
        Thread thread2 = new Thread(task, "スレッド2");

        thread1.start();
        thread2.start();
    }
}
