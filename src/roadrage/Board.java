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
    
    //TODO: We need Desk and Enemy baefore we can do Board
    // GridLayout? 
    // Push
    private JLabel map;
    private JPanel gameboardPanel;
    private JPanel sidebarPanel;
    private JButton tempButton; // This is testing if the sidebar Panel exists
    private int currentScore;

    public Board() {
        
        //setting up board layout
        super("Road Rage Game Board");
        this.createComponents();
    }
    
    public void createComponents(){
        this.setSize(1000, 800);
        this.setLayout(new BorderLayout());
        currentScore = 0; // Current Score starts at 0 upon game start.
        gameboardPanel = new JPanel();
        sidebarPanel = new JPanel();
        map = new JLabel(new ImageIcon("Pictures/RoadSevenHundred.png")); // Figure out proper image size
        tempButton = new JButton("Test");

        //game board with map overlay
        gameboardPanel.setLayout(new BorderLayout());
        gameboardPanel.setSize(800, 800);
        gameboardPanel.add(map, BorderLayout.CENTER);

        //setting up sidebar
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.PAGE_AXIS));
        sidebarPanel.setSize(400, 1000);
        sidebarPanel.add(tempButton);

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
        
        //action events
        Object obj = evt.getSource();
    }
}
    
