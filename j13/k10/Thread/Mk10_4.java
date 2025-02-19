package k10.Thread;

public class Mk10_4 {
    public static void main(String[] args) {
        Runnable runnable1 = () -> {
                for (int i = 1; i <= 5; i++){
                    try{
                        Thread.sleep(3000);
                        System.out.println("ThreeSecThread : " + i*3 + "秒");
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

        };
        Runnable runnable2 = () -> {
            for (int i = 1; i <= 3; i++){
                try{
                    Thread.sleep(5000);
                    System.out.println("ThreeSecThread : " + i*5 + "秒");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread threeSec = new Thread(runnable1);
        Thread fiveSec = new Thread(runnable2);
        threeSec.start();
        fiveSec.start();

        for (int i = 1; i <= 15; i++){

            try {
                Thread.sleep(1000);
                System.out.println("MAINThread     : " + i + "秒");
            }catch (InterruptedException e){
            }
        }
    }
}
