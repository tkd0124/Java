package k10.Thread;

public class FiveSecThread extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 3; i++){
            try{
                Thread.sleep(5000);
                System.out.println("FiveSecThread  : " + i*5 + "秒");
            }catch (InterruptedException e){
                e.printStackTrace();
            }



        }
    }
}
