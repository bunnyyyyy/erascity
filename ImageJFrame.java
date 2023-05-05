//not this onoe

import javax.swing.*;

 
public class ImageJFrame
{
  ImageJFrame() 
  {
    JFrame f = new JFrame("Add an image to JFrame");
    ImageIcon icon = new ImageIcon("taylorswifthead.jpg");
    f.add(new JLabel(icon));
    f.pack();
    f.setVisible(true);
  }
  public static void main(String args[]) 
  {
    new ImageJFrame();
  }
}