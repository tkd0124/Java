package J12;

public class RunnableClass implements Runnable{
    @Override
    public void run(){
        System.out.println("サブスレッドを開始します");
        for (int i = 1; i <= 10; i++){
            System.out.println("サブスレッド：" + i);

            try{
                Thread.sleep(1000);

            }catch (InterruptedException e){
            }
        }
    }
}
