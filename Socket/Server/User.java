package Socket.Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.Socket;

public class User {

    private String name;
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    public User(String name, Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
        this.name = name;
        this.socket = socket;
        this.bufferedReader = bufferedReader;
        this.bufferedWriter = bufferedWriter;
    }

    public String getName() {
        return name;
    }

    public Socket getSocket() {
        return socket;
    }

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }

    public BufferedWriter getBufferedWriter() {
        return bufferedWriter;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof User user){

            return  this.socket.equals(user.socket);
        } else {
            return false;
        }
    }
}
