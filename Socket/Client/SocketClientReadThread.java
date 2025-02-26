package Socket.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketClientReadThread implements Runnable{
    private Socket socket;
    private String name;
    private BufferedReader br = null;

    public SocketClientReadThread(String name, Socket socket) {
        this.name = name;
        this.socket = socket;
    }

    @Override
    public void run(){

        while(true){

            try{
                if (br == null){
                    br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                }

                String message = br.readLine();

                for (int i = 0; i < 50; i++){
                    System.out.print("\b");
                }
                System.out.println(message);

                if (!message.contains("退出")){
                    System.out.print(this.name + ">");
                }

            } catch (IOException e){
                try {
                    br.close();
                    socket.close();
                    break;
                }catch ( IOException ex) {
                    throw  new RuntimeException(ex);
                }
            }
        }
    }
}
