package J12;

public class RunnableMain {
    public static void main(String[] args) {

        RunnableClass runnableClass = new RunnableClass();
        Thread thread = new Thread(runnableClass);

        thread.start();

        System.out.println(" now loading...");
        System.out.print(" [ ");

        while (thread.isAlive()){
            System.out.print(" ※ ");

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
            System.out.println(" ] ");
            System.out.println("completed...");
        }
    }
}
