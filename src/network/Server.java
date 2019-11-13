package network;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main (String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8081);
            for (int i = 0; i<=2; i++) { //max 3 clients can connect to server
                new Thread(() -> {
                    Socket socket = null;
                    try {
                        socket = serverSocket.accept();
                        int input = socket.getInputStream().read();
                        //initialize Game & Player
                        socket.getOutputStream().write(input);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
