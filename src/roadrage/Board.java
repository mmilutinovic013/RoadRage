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
    private JPanel gameboardPanel;
    private JPanel sidebarPanel;
    private JPanel foreGroundPanel;
    private JButton startButton; // This is testing if the sidebar Panel exists
    private JButton quitButton; // This is testing if the sidebar Panel exists
    private int currentScore;
    private int currentHealth;
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
        map = new JLabel(new ImageIcon("Pictures/Road800x800.png"));// Figure out proper image size
        currentScore = 0; // Current Score starts at 0 upon game start.
        currentHealth = 100;
        
        gameboardPanel = new JPanel();
        sidebarPanel = new JPanel();
        foreGroundPanel = new JPanel();
        Car car = new Car();

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
        
        //foreGroundPanel.setLayout(null());
        foreGroundPanel.setSize(800, 800);
        
        quitButton = new JButton("Quit");

        sidebarPanel.add(quitButton);
        quitButton.addActionListener(this);
        foreGroundPanel.add(car);
        
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
    
    public void updateHealth(int healthUpdate){
        currentHealth += currentHealth;
    }
    
    public void actionPerformed(ActionEvent evt){
        Object obj = evt.getSource();
        if(obj == startButton){
            ObjectsFalling falling = new ObjectsFalling();
            System.out.println("here");
        }
        else if(obj == quitButton){
            this.dispose();
            menu.setVisible(true);
        }
    }
}

    
