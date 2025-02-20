package Exeption;

public class RuntimeExceptionMain {
    public static void main(String[] args) {
    Runnable r1 = () -> {
        try{
            Thread.sleep(1000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        String str = null;
        System.out.println(str.length());
    };
    Runnable r2 = () -> {
        try{
            Thread.sleep(2000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    };
    Runnable r3 = () -> {
        try{
            Thread.sleep(3000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        int[] array = new int[3];
        System.out.println(array[3]);
    };
    Runnable r4 = () -> {
        try{
            Thread.sleep(4000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Object obj = new Object();
        String str2 = (String) obj;
    };
    Runnable r5 = () -> {
        try{
            Thread.sleep(5000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        String str3 = "abc";
        int num = Integer.parseInt(str3);
    };
    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    Thread t3 = new Thread(r3);
    Thread t4 = new Thread(r4);
    Thread t5 = new Thread(r5);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

    }
}
