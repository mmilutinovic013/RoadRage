package roadrage;

import java.awt.*;
import java.awt.event.*;

/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
*/
import java.util.ArrayList;
import javax.swing.*;
import java.awt.Rectangle;


public class Board extends JFrame implements ActionListener {
    int y = 0;
    int x = 0;
    //TODO: We need Desk and Enemy baefore we can do Board
    // GridLayout? 
    // Push
    private JLabel map;
    private JPanel gameboardPanel;
    private JPanel sidebarPanel;
    private JButton tempButton; // This is testing if the sidebar Panel exist

    public Board() {
        
        //setting up board layout
        super("Board JFrame");
        this.setSize(800, 600);
        this.setLayout(new BorderLayout());
        gameboardPanel = new JPanel();
        sidebarPanel = new JPanel();
        map = new JLabel(new ImageIcon("Pictures/RoadSevenHundred.png")); // Figure out proper image size
        tempButton = new JButton("Test");

        //game board with map overlay
        gameboardPanel.setLayout(new BorderLayout());
        gameboardPanel.setSize(600, 600);
        gameboardPanel.add(map, BorderLayout.CENTER);

        //setting up sidebar
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.PAGE_AXIS));
        sidebarPanel.setSize(200, 800);
        sidebarPanel.add(tempButton);

        this.add(gameboardPanel, BorderLayout.CENTER);
        this.add(sidebarPanel, BorderLayout.LINE_END);
        
        this.setResizable(false);
        this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evt){
        
        Object obj = evt.getSource();
    }
 
  // trying to get objects to fall
    
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        x=0;
        y=0;
        int objmove;

// This creates the object 
            Image img1 = Toolkit.getDefaultToolkit().getImage("obstacle.png");
            g2.drawImage(img1,180,180,this);
            g2.finalize();

// this will randomly select the lane (1-3)
            
            int lane =  (int) Math.ceil ((Math.random() * 2)+ 1);
// this creates the starting location  of the object randomly
            if(lane == 1)
                {
                    x= 100;
                }
            if(lane == 2)
                {
                    x= 300;
                }
            if(lane == 3)
                {
                    x = 500;
                }
            
   // This makes the object fall     
        // for( objmove = 0; objmove++; objmove < 100)
         {
             g.drawImage(img1,x,y,null);
             y--;
             try
             {
              Thread.sleep(250);
             }
             
              catch (InterruptedException e)
             {
                 e.printStackTrace();
             }
         }
            
         }
     
        
        
    }

    
