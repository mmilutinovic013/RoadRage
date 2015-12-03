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
    private JButton startButton; // This is testing if the sidebar Panel exists
    private JButton quitButton; // This is testing if the sidebar Panel exists
    private int currentScore;
    private MainMenu menu;
    
    public Board(MainMenu theMenu) {
        
        //setting up board layout
        //theFrame = new JFrame("Road Rage Game Board"); //super("Road Rage Game Board");
        super();
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
        startButton = new JButton("Start");
        startButton.addActionListener(this);
        //game board with map overlay
        gameboardPanel.setLayout(new BorderLayout());
        gameboardPanel.setSize(800, 800);
        gameboardPanel.add(map, BorderLayout.CENTER);

        //setting up sidebar
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.PAGE_AXIS));
        sidebarPanel.setSize(400, 1000);
        sidebarPanel.add(startButton);
        
        quitButton = new JButton("Quit");
        
        /*quitButton.addActionListener (new ActionListener ()
        {

            public void actionPerformed(ActionEvent e)
            {
               //ObjectsFalling(); // this line needs to call object fall
            }
        });
        */
    
        sidebarPanel.add(quitButton);
        quitButton.addActionListener(this);

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
    
<<<<<<< HEAD
    public void actionPerformed(ActionEvent evt){
=======

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
>>>>>>> 38db9595a0e4317290a7e2eec226334003148b2a
        
        Object obj = evt.getSource();
        if(obj == startButton){
            ObjectsFalling falling = new ObjectsFalling();
            System.out.println("here");
        }
        else if(obj == quitButton){
            this.dispose();
        }
        //tempButton.setVisible(false);
        menu.setVisible(true);
    }
}

    
