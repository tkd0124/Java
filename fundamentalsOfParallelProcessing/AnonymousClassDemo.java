package fundamentalsOfParallelProcessing;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名クラスで実装されたタスクが実行されました！");
            }
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}
