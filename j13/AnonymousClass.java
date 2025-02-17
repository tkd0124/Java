package j13;

public class AnonymousClass {
    public static void main(String[] args) {

        Thread thread1 = new Thread(){
            @Override
            public void run(){

                System.out.println("Thread1 : start");
                for (int i = 1; i <= 10; i++){
                    System.out.println("サブスレッド：" + i);

                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                    }
                }
                System.out.println("Thread1 : completed");
            }
        };

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread2 : start");
                for (int i = 1; i <= 10; i++){
                    System.out.println("Thread2：" + i);

                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                    }
                }
                System.out.println("Thread2 : completed");
            }
        };
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}
