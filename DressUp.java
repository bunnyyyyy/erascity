import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class DressUp extends MyJFrame implements ActionListener {
    public static int size = 10;
    private ArrayList<JLabel> tops;
    private ArrayList<JLabel> middle;
    private ArrayList<JLabel> bottom;
    private HashMap<JLabel, String> pictures; //STOP
    private JLabel title;
    private ArrayList<String> albums;
    private JButton topleft, topright, middleleft, middleright, bottomleft, bottomright, checkButton;
    private Node<JLabel> topnode;
    private int topindex = 0, middleindex = 0, bottomindex = 0, titleindex = 0;
    private int points = 0;
    private JLabel pointsLabel, rightWrongLabel;


    /**
     * Initializes three linked lists of JLabels with top, middle, and bottom pictures of Taylor Swift outfits. 
     */
    public DressUp() {
        //create the frame
        super();

        //initializes albums to all the names of albums
        albums = new ArrayList<>(Arrays.asList("Debut", "Fearless", "Speak Now", "Red", 
        "1989", "Reputation", "Lover", "Folkore", "Evermore", "Midnights"));
        Collections.shuffle(albums);
        
        //initializes all the pictures and the buttons
        title = new JLabel(albums.get(0), SwingConstants.CENTER);
        pointsLabel = new JLabel("Points: 0 / 0", SwingConstants.CENTER);
        rightWrongLabel = new JLabel("RIGHT!", SwingConstants.CENTER);
        title.setFont(new Font("Serif", Font.PLAIN, 70));
        pointsLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        rightWrongLabel.setFont(new Font("Serif", Font.PLAIN, 55));
        
        

        pictures = new HashMap<JLabel, String>();
        tops = new ArrayList<JLabel>();
        middle = new ArrayList<JLabel>();
        bottom = new ArrayList<JLabel>();
        ImageIcon left = new ImageIcon(new ImageIcon("/Users/nmunjal/Downloads/erascity/leftarrow.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        
       
        topleft = new JButton(left);
        middleleft = new JButton(left);
        bottomleft = new JButton(left);
        ImageIcon right = new ImageIcon(new ImageIcon("/Users/nmunjal/Downloads/erascity/rightarrow.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        
        
        topright = new JButton(right);
        middleright = new JButton(right);
        bottomright = new JButton(right);

        checkButton = new JButton("Check");
        checkButton.setFont(new Font("Serif", Font.PLAIN, 30));



        

        //converts all pictures to labels and puts the labels in top, middle, bottom linked lists 
        File topfiles = new File("tops");
        File middlefiles = new File("middle");
        File bottomfiles = new File("bottom");

        File[] listoftops = topfiles.listFiles();
        File[] listofmiddles = middlefiles.listFiles();
        File[] listofbottoms = bottomfiles.listFiles();

        



        
       
        for (File x : listoftops) {
            JLabel label = new JLabel(new ImageIcon(new ImageIcon(x.getAbsolutePath()).getImage().getScaledInstance(300, 150, Image.SCALE_DEFAULT)));
            pictures.put(label, getKey(x.getAbsolutePath()));
            if (!getKey(x.getAbsolutePath()).equals("")) {
                tops.add(label);
            } 
        }
        

       
        for (File x : listofmiddles) {
            JLabel label = new JLabel(new ImageIcon(new ImageIcon(x.getAbsolutePath()).getImage().getScaledInstance(300, 150, Image.SCALE_DEFAULT)));
            pictures.put(label, getKey(x.getAbsolutePath()));
            if (!getKey(x.getAbsolutePath()).equals("")) {
                middle.add(label);
            }
            
        }

        for (File x : listofbottoms) {
            JLabel label = new JLabel(new ImageIcon(new ImageIcon(x.getAbsolutePath()).getImage().getScaledInstance(300, 150, Image.SCALE_DEFAULT)));
            pictures.put(label, getKey(x.getAbsolutePath()));
            if (!getKey(x.getAbsolutePath()).equals("")) {
                bottom.add(label);
            }
           
        }
        Collections.shuffle(tops);
        Collections.shuffle(middle);
        Collections.shuffle(bottom);




    }



    //displays the first pictures + buttons
    public void displayInitial() {
        super.add(title, 325, 50, 350, 100);
        super.add(pointsLabel, 800, 50, 150, 100);
        super.add(tops.get(0), 350, 200, 300, 150);
        super.add(middle.get(0), 350, 375, 300, 150);
        super.add(bottom.get(0), 350, 550, 300, 150);
        super.add(rightWrongLabel, 10, 140, 200, 100);
        rightWrongLabel.setVisible(false);

        Border border = BorderFactory.createBevelBorder(BevelBorder.RAISED);
        topleft.setBorder(border);
        middleleft.setBorder(border);
        bottomleft.setBorder(border);
        topright.setBorder(border);
        middleright.setBorder(border);
        bottomright.setBorder(border);

        super.add(topleft, 250, 250, 50, 50);
        super.add(middleleft, 250, 425, 50, 50);
        super.add(bottomleft, 250, 600, 50, 50);
        super.add(topright, 700, 250, 50, 50);
        super.add(middleright, 700, 425, 50, 50);
        super.add(bottomright, 700, 600, 50, 50);
        super.add(checkButton, 50, 70, 100, 50);
        checkButtons();

    }

    public void newTitle() {
        titleindex += 1;
        title.setText(albums.get(titleindex));
    }



    public void buttonsWork() {
        topleft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               remove(tops.get(topindex));
               topindex -= 1;
               add(tops.get(topindex), 350, 200, 300, 150);
               checkButtons();
            }
         });

         topright.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               remove(tops.get(topindex));
               topindex += 1;
               add(tops.get(topindex), 350, 200, 300, 150);
               checkButtons();
            }
         });
        
         middleleft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               remove(middle.get(middleindex));
               middleindex -= 1;
               add(middle.get(middleindex), 350, 375, 300, 150);
               checkButtons();
            }
         });
         middleright.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               remove(middle.get(middleindex));
               middleindex += 1;
               add(middle.get(middleindex), 350, 375, 300, 150);
               checkButtons();
            }
         });

         bottomleft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               remove(bottom.get(bottomindex));
               bottomindex -= 1;
               add(bottom.get(bottomindex), 350, 550, 300, 150);
               checkButtons();
            }
         });

         bottomright.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               remove(bottom.get(bottomindex));
               bottomindex += 1;
               add(bottom.get(bottomindex), 350, 550, 300, 150);
               checkButtons();
            }
         });

         checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            if (checkButton.getText().equals("Check")) {
                if (pictures.get(tops.get(topindex)).equals(pictures.get(middle.get(middleindex))) 
                && pictures.get(middle.get(middleindex)).equals(pictures.get(bottom.get(bottomindex)))
                && pictures.get(bottom.get(bottomindex)).equals(albums.get(titleindex))
                ) {
                    checkButton.setText("Next");
                    rightWrongLabel.setText("RIGHT!");
                    rightWrongLabel.setForeground(Color.GREEN);
                    rightWrongLabel.setVisible(true);
                    points += 1;
                    String text = "Points " + points + " / " + (titleindex + 1);
                    pointsLabel.setText(text);
                }
                else {
                    rightWrongLabel.setText("WRONG!");
                    rightWrongLabel.setForeground(Color.RED);
                    rightWrongLabel.setVisible(true);
                }

                
            }
            else if (checkButton.getText().equals("Next")) {
                if (titleindex == size - 1) {
                    checkButton.setVisible(false);
                    rightWrongLabel.setForeground(Color.CYAN);
                    rightWrongLabel.setText("DONE!!");

                }
                else {
                    rightWrongLabel.setVisible(false);
                    newTitle();
                }
            }
        }
        

         });


    }

    public void checkButtons() {
        if(topindex == 0) {
            remove(topleft);
        }
        else {
            add(topleft);
        }
        if(topindex == size - 1) {
            remove(topright);
        }
        else {
            add(topright);
        }


        if(middleindex == 0) {
            remove(middleleft);
        }
        else {
            add(middleleft);
        }
        if(middleindex == size - 1) {
            remove(middleright);
        }
        else {
            add(middleright);
        }

        if(bottomindex == 0) {
            remove(bottomleft);
        }
        else {
            add(bottomleft);
        }
        if(bottomindex == size - 1) {
            remove(bottomright);
        }
        else {
            add(bottomright);
        }




    }

    public void add(JButton button) {
        button.setVisible(true);
    }

    public void add(JLabel label) {
        label.setVisible(true);
    }
    
    
    public void remove(JLabel label) {
        label.setVisible(false);
    }
    
    public void remove(JButton button) {
        button.setVisible(false);
    }

    public void add(JLabel label, int x, int y, int width, int height) {
        super.add(label, x, y, width, height);

    }

    public String getKey(String filePath) {
        int lastSlashIndex = filePath.lastIndexOf('/');
        int dotIndex = filePath.lastIndexOf('.');

        String key = filePath.substring(lastSlashIndex + 1, dotIndex);
        return key;

    }



    
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }


}

    

