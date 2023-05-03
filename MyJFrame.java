import javax.swing.*;
import java.awt.*;

public class MyJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My JFrame");
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel() {
           
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image image = new ImageIcon(getClass().getResource("taylorswifthead.jpg")).getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }

        };

        frame.add(panel);
        
        frame.setVisible(true);
    }
}
