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

    private JLabel map;
    private JPanel sidebarPanel;
    private JButton startButton; // This is testing if the sidebar Panel exists
    private JButton quitButton; // This is testing if the sidebar Panel exists
    private JPanel background;
    private int currentScore;
    private MainMenu menu;
    
    public Board(MainMenu theMenu) {
        
        //setting up board layout
        //theFrame = new JFrame("Road Rage Game Board"); //super("Road Rage Game Board");
        super();
        this.createComponents();
        menu = theMenu;
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void createComponents(){
        this.setSize(1000, 800);
        this.setLayout(new BorderLayout());
        //map = new JLabel(new ImageIcon("Pictures/Road800x800.png"));// Figure out proper image size
        currentScore = 0; // Current Score starts at 0 upon game start.
        
        
        sidebarPanel = new JPanel();
        
        background = new Map();
        background.setLayout(new BorderLayout());
        Car car = new Car();
        
        background.add(car);
        //car.setBounds(350,600,100,100);
        //car.setSize(100,100);
        
        startButton = new JButton("Start");
        startButton.addActionListener(this);
        //game board with map overlay
       

        //setting up sidebar
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.PAGE_AXIS));
        sidebarPanel.setSize(400, 1000);
        sidebarPanel.add(startButton);
        
        
        quitButton = new JButton("Quit");

        sidebarPanel.add(quitButton);
        quitButton.addActionListener(this);
        
        
        this.add(background, BorderLayout.CENTER);
        this.add(sidebarPanel, BorderLayout.LINE_END);
        //this.add(foreGroundPanel);
        
  
        
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        if(obj == startButton){
           Objects falling = new Objects();
            background.add(falling);
            System.out.println("here");
        }
        else if(obj == quitButton){
            this.dispose();
            menu.setVisible(true);
        }
    }
}
