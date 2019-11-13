package network;

import MainFrame.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.Socket;

public class Client {


    public static void main (String[] args){
        try {
            Socket socket = new Socket((String) null, 8081);

            MainFrame mainFrame = new MainFrame();
            mainFrame.setTitle("Word Cloud");
            mainFrame.setSize(1000, 620);
            mainFrame.setResizable(false);
            mainFrame.setLocation(50, 50);
            mainFrame.setLayout(new BorderLayout());
            mainFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            JButton jButton1 = new JButton();
            jButton1.setText("jButton1");
            jButton1.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    try {
                        socket.getOutputStream().write(10);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });

            //Adding Components to the frame.
            mainFrame.add(jButton1, BorderLayout.SOUTH);
            mainFrame.setVisible(true);

            System.out.println("Server response: " +  socket.getInputStream().read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
