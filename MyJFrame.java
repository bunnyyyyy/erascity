import javax.swing.*;
import java.awt.*;

public class MyJFrame {

    private JFrame frame;
    

    public MyJFrame()
    {
        frame = new JFrame("Eras City"); 
        frame.setBounds(10,10,1000, 800);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void add(JLabel label, int x, int y, int width, int height) {

        label.setBounds(x, y, width, height);
        label.setVisible(true);
        frame.getContentPane().add(label);

    }
    public void add(JButton button, int x, int y, int width, int height) {

        button.setBounds(x, y, width, height);
        button.setVisible(true);
        frame.getContentPane().add(button);

    }
    

    public static void main(String[] args) {
       
        new MyJFrame();
        DressUp speakNow = new DressUp();
        speakNow.displayInitial();
        
        
        
    }
}
