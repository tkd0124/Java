package j13;

public class LambdaExample {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello from lambda!");
        new Thread(runnable).start();
    }
}
