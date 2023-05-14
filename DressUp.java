import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class DressUp extends MyJFrame implements ActionListener {
    public static int size = 1;
    private LinkedList<JLabel> tops;
    private LinkedList<JLabel> middle;
    private LinkedList<JLabel> bottom;
    private HashMap<JLabel, String> pictures;
    private JButton topleft, topright, middleleft, middleright, bottomleft, bottomright;

    /**
     * Initializes three linked lists of JLabels with top, middle, and bottom pictures of Taylor Swift outfits. 
     */
    public DressUp() {
        super();
        tops = new LinkedList<JLabel>();
        middle = new LinkedList<JLabel>();
        bottom = new LinkedList<JLabel>();
        Icon left = new ImageIcon("/Users/nmunjal/Downloads/erascity/leftarrow.png");
        topleft = new JButton(left);

        File topfiles = new File("tops");
        File middlefiles = new File("middle");
        File bottomfiles = new File("bottom");

        File[] listoftops = topfiles.listFiles();
        File[] listofmiddles = middlefiles.listFiles();
        File[] listofbottoms = bottomfiles.listFiles();

        for (File x : listoftops) {
            JLabel label = new JLabel(new ImageIcon((x.getAbsolutePath())));
            pictures.put(label, getKey(x.getAbsolutePath()));
            tops.add(label);
        }

        for (File x : listofmiddles) {
            JLabel label = new JLabel(new ImageIcon((x.getAbsolutePath())));
            middle.add(label);
        }

        for (File x : listofbottoms) {
            JLabel label = new JLabel(new ImageIcon((x.getAbsolutePath())));
            bottom.add(label);
        }

    }

    public void displayInitial() {
        super.add(tops.get(1), 350, 200, 300, 150);
        super.add(middle.get(1), 350, 375, 300, 150);
        super.add(bottom.get(1), 350, 550, 300, 150);


    }


    public String getKey(String filePath) {
        int lastSlashIndex = filePath.lastIndexOf('/');
        int dotIndex = filePath.lastIndexOf('.');

        String key = filePath.substring(lastSlashIndex + 1, dotIndex);
        return key;

    }



    
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }


}

    

