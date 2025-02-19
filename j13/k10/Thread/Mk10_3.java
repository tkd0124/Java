package k10.Thread;

public class Mk10_3 {
    public static void main(String[] args) {
        ThreeSecThread threeSecThread = new ThreeSecThread();
        FiveSecThread fiveSecThread = new FiveSecThread();

        threeSecThread.start();
        fiveSecThread.start();
        for (int i = 1; i <= 15; i++){

            try {
                Thread.sleep(1000);
                System.out.println("MAINThread     : " + i + "秒");
            }catch (InterruptedException e){
            }
        }
    }
}
