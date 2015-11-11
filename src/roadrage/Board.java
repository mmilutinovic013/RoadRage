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
        
        //action events
        Object obj = evt.getSource();
    }
}
    
