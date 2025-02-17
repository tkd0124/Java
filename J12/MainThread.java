package J12;

public class MainThread {
    public static void main(String[] args) {

        Subthread subthread = new Subthread();

        subthread.start();

        System.out.println("Start Main thread");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main thread : " + i);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(" end Main thread");
    }

}
//millis　millisecond →ms のこと　mmと同じ
