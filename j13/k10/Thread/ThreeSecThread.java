package k10.Thread;

public class ThreeSecThread extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++){
            try{
                Thread.sleep(3000);
                System.out.println("ThreeSecThread : " + i*3 + "秒");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
