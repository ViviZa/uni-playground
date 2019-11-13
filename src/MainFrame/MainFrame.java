package MainFrame;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public static void setup() {
        MainFrame frame = new MainFrame();
        frame.setTitle("Word Cloud");
        frame.setSize(1000, 620);
        frame.setResizable(false);
        frame.setLocation(50, 50);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        menuBar.add(m1);
        menuBar.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

        JButton jButton1 = new JButton();
        jButton1.setText("jButton1");

        JButton jButton2 = new JButton();
        jButton2.setText("jButton2");
        jButton2.addActionListener(new MyActionListener());

        JPanel panel = new JPanel();
        panel.add(jButton1);
        panel.add(jButton2);

        //Adding Components to the frame.
        frame.add(panel, BorderLayout.SOUTH);
        frame.add(menuBar, BorderLayout.PAGE_START);
        frame.setVisible(true);

    }

}
