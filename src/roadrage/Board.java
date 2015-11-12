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
    private JButton tempButton; // This is testing if the sidebar Panel exists
    private int currentScore;
    private MainMenu menu;
    
    public Board(MainMenu theMenu) {
        
        //setting up board layout
        super("Road Rage Game Board");
        this.createComponents();
         menu = theMenu;
    }
    
    public void createComponents(){
        this.setSize(1000, 800);
        this.setLayout(new BorderLayout());
        currentScore = 0; // Current Score starts at 0 upon game start.
        gameboardPanel = new JPanel();
        sidebarPanel = new JPanel();
        map = new JLabel(new ImageIcon("Pictures/Road800x800.png")); // Figure out proper image size
        tempButton = new JButton("Start");

        //game board with map overlay
        gameboardPanel.setLayout(new BorderLayout());
        gameboardPanel.setSize(800, 800);
        gameboardPanel.add(map, BorderLayout.CENTER);

        //setting up sidebar
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.PAGE_AXIS));
        sidebarPanel.setSize(400, 1000);
        sidebarPanel.add(tempButton);
        tempButton = new JButton("End");
        tempButton.addActionListener (new ActionListener ()
        {

            public void actionPerformed(ActionEvent e)
            {
             //  Board.objectfall(); // this line needs to call object fall
            }
        });
    
        sidebarPanel.add(tempButton);
        tempButton.addActionListener(this);

        this.add(gameboardPanel, BorderLayout.CENTER);
        this.add(sidebarPanel, BorderLayout.LINE_END);
        
        this.setResizable(false);
        this.setVisible(true);
    }
    
    //
    // This function updates the score and based off an inputted scoreUpdate variable that is a positive
    // or negative number which is added to the score field
    //
    public void updateScore(int scoreUpdate){
        currentScore += scoreUpdate;
    }
    
    public void actionPerformed(ActionEvent evt){
        
        Object obj = evt.getSource();
        tempButton.setVisible(false);
        this.dispose();
        menu.setVisible(true);
    }
 
   
            
// trying to get objects to fall
    public  void objectfall(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        x=0;
        y=1000;
        int objmove = 0;

// This creates the object 
            Image img1 = Toolkit.getDefaultToolkit().getImage("obstacle.png");
            g2.drawImage(img1,180,180,this);
            g2.finalize();

// this will randomly select the lane (1-3)
            
            int lane =  (int) Math.ceil ((Math.random() * 2)+ 1);
// this creates the starting location  of the object randomly
            if(lane == 1)
                {
                    x= 200;
                }
            if(lane == 2)
                {
                    x= 400;
                }
            if(lane == 3)
                {
                    x = 600;
                }
            
// This makes the object fall     
         for( objmove = 0; objmove <100; objmove ++)
         {
             g.drawImage(img1,x,y,null);
             y--;
             try
             {
              Thread.sleep(50);         // 40 seconds for the object to fall i think
             }
             
              catch (InterruptedException e)
             {
                 e.printStackTrace();
             }
         }
            
    }
     
        
        
}

    
