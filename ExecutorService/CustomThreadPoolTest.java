package ExecutorService;

public class CustomThreadPoolTest {
    public static void main(String[] args) {
        CustomThreadPool pool = new CustomThreadPool(3);  // 3つのスレッドを作成

        // 10個のタスクをスレッドプールに投入
        for (int i = 1; i <= 10; i++) {
            int taskId = i;
            pool.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " がタスク " + taskId + " を実行中");
                try {
                    Thread.sleep(1000);  // 1秒間の処理
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " がタスク " + taskId + " を完了");
            });
        }

        // 少し待ってからシャットダウン
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pool.shutdown();
    }
}
