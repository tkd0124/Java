package Socket.Server;

import javax.imageio.IIOException;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketSeverMain {

    public static List<User> userList = new ArrayList<>();
    public static ServerSocket serverSocket;

    public static void main(String[] args) throws IIOException {

        System.out.println("通信開始...");

        try {

            serverSocket = new ServerSocket(5000);

            do {
                Socket socket = serverSocket.accept();

                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                String name = br.readLine();

                User user = new User(name, socket, br, bw);
                userList.add(user);

                System.out.println(user.getName() + "さんが接続しました");

                for (User u : userList) {
                    u.getBufferedWriter().write(user.getName() + "さんが接続しました");
                    u.getBufferedWriter().newLine();
                    u.getBufferedWriter().flush();
                }

                Thread thread = new Thread(new SocketServerUserThread(user));
                thread.start();

            } while (!userList.isEmpty()) ;

            end();

        } catch (IOException e) {
                e.printStackTrace();
                end();
        }
    }
    public static void end(){
        System.out.println("通信終了");

        try {
            serverSocket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

