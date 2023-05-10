import javax.swing.*;
import java.awt.*;

public class MyJFrame {

    private JFrame frame;
    private JLabel label;
    
    

    public MyJFrame()
    {
        frame = new JFrame("My JFrame");
        
        // JButton button = new JButton("Button");

        // button.setBounds(50,50,100,100);
        // frame.getContentPane().add(button);
        
        
        label = new JLabel(new ImageIcon(("/Users/nmunjal/Downloads/erascity/tops/swiftie.jpeg")));

        label.setBounds(50,50,100,100);

        label.setVisible(true);

        frame.getContentPane().add(label);

        
        frame.setBounds(10,10,800, 600);
        frame.setResizable(false);
        

        JPanel main = new JPanel();
        main.setBackground(Color.WHITE);
        main.setLayout(new BorderLayout(10, 10));
    
           
        main.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.add(main);
        
        frame.setVisible(true);
    }
    

    public static void main(String[] args) {
        
        new MyJFrame();
        
    }
}
