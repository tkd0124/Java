package fundamentalsOfParallelProcessing;

import javax.imageio.IIOException;

public class MyThread extends Thread{
    public void run(){
        try{
//            System.out.println(Thread.currentThread().getName() + "is Running...");
            System.out.println("スレッドが実行中（RUNNING）...");

            Thread.sleep(3000);

//            System.out.println(Thread.currentThread().getName() + "is Terminated...");
        }catch (InterruptedException e){
//            System.out.println(Thread.currentThread().getName() + "was interrupted...");
            e.printStackTrace();
        }
//        System.out.println("Thread が実行されました。");
        System.out.println("スレッドが終了（TERMINATED）...");
    }
}
