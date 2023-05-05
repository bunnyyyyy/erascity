import javax.swing.*;
import java.awt.*;

public class MyJFrame {

    
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("My JFrame");
        
        JButton button = new JButton("Button");

        
        frame.setSize(800, 600);
        frame.setResizable(false);
        
        
        JPanel panel = new JPanel() {
           
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image image = new ImageIcon(("t/Users/nmunjal/Downloads/erascity/taylorswifthead.jpg")).getImage();
                g.drawImage(image, 400, 300, getWidth(), getHeight(), this);
            }

        };

        System.out.println("here");

        frame.add(button);

        frame.add(panel);
        
        frame.setVisible(true);
    }
}
