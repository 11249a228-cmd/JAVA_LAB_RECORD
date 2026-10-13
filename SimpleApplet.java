
import java.awt.*;
import javax.swing.*;

public class SimpleApplet {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Applet");
        f.setSize(400, 200);

        JPanel p = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawString("Welcome to Java Applet", 50, 50);
            }
        };

        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
