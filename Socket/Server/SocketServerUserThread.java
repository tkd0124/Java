package Socket.Server;

import java.io.BufferedWriter;
import java.io.IOException;

import static Socket.Server.SocketSeverMain.userList;

public class SocketServerUserThread implements Runnable{

    private User user;

    public SocketServerUserThread(User user){

        this.user = user;
    }

    @Override
    public void run(){

        String message = "";

        try{
            while (true){

                message = user.getBufferedReader().readLine();

                if (message == null){
                    end();
                    break;
                }
                sendMessage(message);

                System.out.println(user.getName() + ">" + message);
            }

        } catch (IOException e) {
            end();
        }
    }

    public void sendMessage(String message) throws  IOException{
        for(User u : userList){
            if (!u.equals(this.user)){
                BufferedWriter bw = u.getBufferedWriter();

                bw.write(this.user.getName() + ">" + message);
                bw.newLine();
                bw.flush();
            }
        }
    }

    public void end(){
        System.out.println(user.getName() + "");

        try{
            for (User u: userList){
                if (u.equals(user)){
                    continue;
                }
                BufferedWriter bw = u.getBufferedWriter();
                bw.write(user.getName() + "");
                bw.newLine();
                bw.flush();
            }
            user.getBufferedReader().close();
            user.getBufferedWriter().close();
            user.getSocket().close();
            userList.remove(user);

        }catch (IOException e){

            e.printStackTrace();

        }
    }
}
