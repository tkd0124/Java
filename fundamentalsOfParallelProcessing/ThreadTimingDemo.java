package fundamentalsOfParallelProcessing;

public class ThreadTimingDemo {
    public static void main(String[] args) {
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++){
                    System.out.println("task1 : " +  i + "( Thread : " + Thread.currentThread().getName() + ")");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++){
                    System.out.println("task2 : " +  i + "( Thread : " + Thread.currentThread().getName() + ")");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}
