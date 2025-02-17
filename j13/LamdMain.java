package j13;

public class LamdMain {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            for (int i = 1; i <= 10; i++){
                System.out.println("Thread : " + i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){

                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
