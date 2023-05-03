import javax.swing.*;

public class MyJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My JFrame");
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        frame.setVisible(true);
    }
}
