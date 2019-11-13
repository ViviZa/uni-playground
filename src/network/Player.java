package network;

import java.io.IOException;
import java.net.Socket;

public class Player {
    private Socket socket;

    public Player(Socket socket) {
        this.socket = socket;
    }

    public void sayHello() {

    }
}
