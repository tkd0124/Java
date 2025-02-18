package fundamentalsOfParallelProcessing;

public class LambdaRunnableDemo {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("ラムダ式で実装されたタスクが実行されました");
        Thread thread = new Thread(task);
        thread.start();
    }
}
