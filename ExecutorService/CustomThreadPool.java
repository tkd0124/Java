import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class CustomThreadPool {
    private final int threadCount;  // スレッドの数
    private final List<Worker> workers;  // ワーカースレッドのリスト
    private final Queue<Runnable> taskQueue;  // タスクのキュー
    private boolean isRunning = true;  // プールの動作状態

    public CustomThreadPool(int threadCount) {
        this.threadCount = threadCount;
        this.taskQueue = new LinkedList<>();
        this.workers = new LinkedList<>();

        // 指定数のスレッドを事前に作成し、実行開始
        for (int i = 0; i < threadCount; i++) {
            Worker worker = new Worker();
            workers.add(worker);
            worker.start();
        }
    }

    // タスクをキューに追加
    public synchronized void submit(Runnable task) {
        taskQueue.offer(task);
        notify();  // スレッドに新しいタスクがあることを通知
    }

    // スレッドプールを終了する
    public synchronized void shutdown() {
        isRunning = false;
        for (Worker worker : workers) {
            worker.interrupt();  // 各スレッドを終了させる
        }
    }

    // ワーカースレッド（スレッドがタスクを実行するクラス）
    private class Worker extends Thread {
        public void run() {
            while (isRunning) {
                Runnable task;
                synchronized (CustomThreadPool.this) {
                    while (taskQueue.isEmpty()) {
                        try {
                            CustomThreadPool.this.wait();  // タスクが来るまで待機
                        } catch (InterruptedException e) {
                            return;  // スレッドを終了
                        }
                    }
                    task = taskQueue.poll();  // キューからタスクを取得
                }
                if (task != null) {
                    task.run();  // タスクを実行
                }
            }
        }
    }
}
