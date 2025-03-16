package ProcessThread;

import java.io.IOException;

public class MultiProcessExample {
    public static void main(String[] args) {
        try {
            // 2つのターミナルを開く
            Process process1 = new ProcessBuilder("open", "-n", "-a", "Terminal").start();
            Process process2 = new ProcessBuilder("open", "-n", "-a", "Terminal").start();

            System.out.println("2つのターミナルを開きました!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
