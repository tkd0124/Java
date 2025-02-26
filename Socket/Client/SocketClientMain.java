package Socket.Client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketClientMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;

        try(
                Socket socket = new Socket("10.26.142.110", 5000);
                OutputStream os = socket.getOutputStream();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));

        ) {
            System.out.println("サーバーに接続しました");
            System.out.print("名前を入力してください > ");
            name = scanner.next();
            bw.write(name);
            bw.newLine();
            bw.flush();

            SocketClientReadThread socketClientReadThread = new SocketClientReadThread(name, socket);
            Thread readThread = new Thread(socketClientReadThread);
            readThread.setDaemon(true);
            readThread.start();

            while (true) {
                System.out.print(name + ">");
                String message = scanner.next();

                bw.write(message);
                bw.newLine();
                bw.flush();

                if (message.equals("exit")) {
                    break;
                }
            }
        }catch (IOException e){
            System.out.println("通信エラーが発生しました");
        }
    }
}
//package Socket.Client;
//
//import Socket.Client.SocketClientReadThread;
//
//import java.io.*;
//import java.net.Socket;
//import java.util.Scanner;
//
//public class SocketClientMain {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String name;
//
//        try(
//                Socket socket = new Socket("10.26.142.110", 5000);
//                OutputStream os = socket.getOutputStream();
//                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
//        ){
//
//            System.out.println("サーバーに接続しました");
//
//            System.out.print("名前を入力してください>");
//            name = scanner.next();
//            bw.write(name);
//            bw.newLine();
//            bw.flush();
//
//            SocketClientReadThread socketClientReadThread = new SocketClientReadThread(name, socket);
//            Thread readThread = new Thread(socketClientReadThread);
//            readThread.setDaemon(true);
//            readThread.start();
//
//            while (true){
//                System.out.print(name + ">");
//                String message = scanner.next();
//
//                bw.write(message);
//                bw.newLine();
//                bw.flush();
//
//                if(message.equals("exit")){
//                    break;
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("通信エラーが発生しました");
//        }
//    }
//
//}
