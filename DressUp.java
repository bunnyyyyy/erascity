import javax.swing.*;
import java.util.*;
import java.util.Queue;
import java.awt.*;
import java.io.File;

public class DressUp extends MyJFrame {
    private Queue<JLabel> tops;
    private Queue<JLabel> middle;
    private Queue<JLabel> bottom;

    public DressUp() {
        tops = new LinkedList<JLabel>();
        middle = new LinkedList<JLabel>();
        bottom = new LinkedList<JLabel>();

        File tops = new File("/tops");
        File[] listoftops = tops.listFiles();

        for (File x : listoftops) {
            tops.add()
        }
    
    
  }
}

    }
}
