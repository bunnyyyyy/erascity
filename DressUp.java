import javax.swing.*;
import java.util.*;
import java.util.Queue;
import java.awt.*;
import java.io.*;

public class DressUp extends MyJFrame {
    private LinkedList<JLabel> tops;
    private LinkedList<JLabel> middle;
    private LinkedList<JLabel> bottom;

    /**
     * Initializes three linked lists of JLabels with top, middle, and bottom pictures of Taylor Swift outfits. 
     */
    public DressUp() {
        tops = new LinkedList<JLabel>();
        middle = new LinkedList<JLabel>();
        bottom = new LinkedList<JLabel>();

        File topfiles = new File("/tops");
        File middlefiles = new File("/middle");
        File bottomfiles = new File("/bottom");
        File[] listoftops = topfiles.listFiles();
        File[] listofmiddles = middlefiles.listFiles();
        File[] listofbottoms = bottomfiles.listFiles();

        for (File x : listoftops) {
            JLabel label = new JLabel(new ImageIcon((x.getAbsolutePath())));
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


}

    

