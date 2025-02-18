package fundamentalsOfParallelProcessing;

public class MyThreadLifecycleMain {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

//        System.out.println("Thread state after creation: " + thread.getState());
        System.out.println("スレッド作成（NEW）");

        thread.start();
//        System.out.println("Thread state after start(): " + thread.getState());
        System.out.println("スレッド開始（RUNNABLE）");

        try {
//            Thread.sleep(100);
//            System.out.println("Thread state while running: " + thread.getState());

            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
//        System.out.println("Thread state after completion: " + thread.getState());
        System.out.println("メイン処理終了（スレッドも終了）");
    }
}
