package ProcessThread;

import java.io.IOException;

public class CommandProcess {
    public static void main(String[] args) {
        try {
            // ターミナルで "ls -l" コマンドを実行
            Process process = new ProcessBuilder("ls", "-l").inheritIO().start();

            process.waitFor();
            System.out.println("コマンド実行完了!");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
