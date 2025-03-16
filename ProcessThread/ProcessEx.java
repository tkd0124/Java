package ProcessThread;

import java.io.IOException;

public class ProcessEx {
    public static void main(String[] args) {
        try {
            Process process = new ProcessBuilder("open", "-a", "Terminal").start();

            process.waitFor();
            System.out.println("ターミナルを開きました");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
