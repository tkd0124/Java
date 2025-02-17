package j13;

public class AnouymousClassExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        new Thread(runnable).start();
    }
}
